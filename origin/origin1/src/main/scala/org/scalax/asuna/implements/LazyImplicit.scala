package org.scalax.asuna.implements

import scala.reflect.macros.blackbox

import scala.language.experimental.macros

trait LazyImplicit[T] {
  def value: T
}

object LazyImplicit {
  implicit def implicitFetch[T]: LazyImplicit[T] = macro LazyImplicitHelper.LazyImplicitHelperImpl.implicitFetch[T]
}

object LazyImplicitHelper {

  class LazyImplicitHelperImpl(val c: blackbox.Context) {
    import c.universe._

    def implicitFetch[T: c.WeakTypeTag]: c.Expr[LazyImplicit[T]] = {
      val lazyImplicit = weakTypeOf[LazyImplicit[T]]
      val t            = weakTypeOf[T]
      c.Expr[LazyImplicit[T]] {
        q"""new ${lazyImplicit} { override def value: ${t} = implicitly[${t}] }"""
      }
    }
  }

}
