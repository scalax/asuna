package asuna.macros.single

import asuna.macros.AsunaParameters
import asuna.macros.single.utils.SealedHelper

import scala.annotation.tailrec
import scala.language.experimental.macros
import scala.collection.compat._

trait AsunaSealedGeneric[H] {
  type Sealed
  def tag: Sealed
}

class SealedTag[T]

object SealedTag {
  def apply[T]: SealedTag[T] = new SealedTag[T]
}

object AsunaSealedGeneric {

  class SealedGenericApply[I] {
    def value[M](value1: => M): AsunaSealedGeneric.Aux[I, M] = new AsunaSealedGeneric[I] {
      override type Sealed = M
      override def tag: M = value1
    }
  }

  object SealedGenericApply {
    val value: SealedGenericApply[Any]                   = new SealedGenericApply[Any]
    implicit def implicitApply[T]: SealedGenericApply[T] = value.asInstanceOf[SealedGenericApply[T]]
  }

  type Aux[H, II] = AsunaSealedGeneric[H] { type Sealed = II }

  implicit def macroImpl[H, II](implicit i: AsunaSealedGeneric.SealedGenericApply[H]): AsunaSealedGeneric.Aux[H, II] =
    macro AsunaSealedGenericMacroApply.MacroImpl1.generic[H, II]

}

object AsunaSealedGenericMacroApply {

  class MacroImpl1(override val c: scala.reflect.macros.whitebox.Context) extends SealedHelper {
    self =>

    import c.universe._

    def generic[H: c.WeakTypeTag, M: c.WeakTypeTag](i: c.Expr[AsunaSealedGeneric.SealedGenericApply[H]]): c.Expr[AsunaSealedGeneric.Aux[H, M]] = {
      try {
        val h     = weakTypeOf[H]
        val hType = h.resultType

        val props = fleshedOutSubtypes(hType).to(List)

        val proTypeTag = props.map(s => q"""_root_.asuna.macros.single.SealedTag[${s}]""")

        @tailrec
        def typeTagGen(tree: List[Tree], init: Boolean): Tree =
          if (tree.length == 1) {
            if (init)
              q"""_root_.asuna.BuildContent.tuple1(..${tree})"""
            else
              q"""..${tree}"""
          } else {
            val groupedTree = tree.grouped(AsunaParameters.maxPropertyNum).toList
            if (init)
              typeTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("tuple" + s.length)}(..${s})"""), false)
            else
              typeTagGen(groupedTree.map(s => q"""_root_.asuna.BuildContent.${TermName("nodeTuple" + s.length)}(..${s})"""), false)
          }

        c.Expr[AsunaSealedGeneric.Aux[H, M]] {
          q"""${i}.value(${typeTagGen(proTypeTag, true)})"""
        }

      } catch {
        case e: Exception =>
          e.printStackTrace
          throw e
      }
    }
  }

}
