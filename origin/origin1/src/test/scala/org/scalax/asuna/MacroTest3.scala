package org.scalax.asuna.mapper.append

import io.circe._
import org.scalax.asuna.implements.LazyImplicit
import shapeless._
import shapeless.labelled.FieldType

object MacroTest3 {

  case class koukou1(id: Long, name: String, age: String, i4: String, i5: Int, i6: String)

  trait EncodeImplicit[T] {
    def mm: ObjectEncoder[T]
  }

  object EncodeImplicit {

    implicit val encodeHNil: EncodeImplicit[HNil] = new EncodeImplicit[HNil] { override def mm = ObjectEncoder.instance(_ => JsonObject.empty) }

    implicit def encodeHCons[K <: Symbol, H, T <: HList](implicit
                                                         key: Witness.Aux[K],
                                                         encodeH: LazyImplicit[Encoder[H]],
                                                         encodeT: EncodeImplicit[T]): EncodeImplicit[FieldType[K, H] :: T] =
      new EncodeImplicit[FieldType[K, H] :: T] {
        override def mm = ObjectEncoder.instance {
          case h :: t => (key.value.name -> encodeH.value(h)) +: encodeT.mm.encodeObject(t)
        }
      }

    implicit def encodeGeneric[A, R](implicit gen: LabelledGeneric.Aux[A, R], encodeR: EncodeImplicit[R]): EncodeImplicit[A] =
      new EncodeImplicit[A] { override def mm = ObjectEncoder.instance(a => encodeR.mm.encodeObject(gen.to(a))) }

  }

}
