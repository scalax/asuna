package zsg.macros.case_class_test

import zsg.macros.single.{ZsgGeneric, ZsgSetterGeneric}
import zsg.{ApplicationX2, Context2, Plus2}

trait ModelFromString[M] {
  def getData(str: List[FieldModel]): (List[FieldModel], M)
}

object ModelFromString {

  class ReverseDecoderContext extends Context2[ModelFromStringImpl] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: ModelFromStringImpl[X1, X2], y: ModelFromStringImpl[Y1, Y2])(
      p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): ModelFromStringImpl[Z1, Z2] =
      new ModelFromStringImpl[Z1, Z2] {
        override def getData(str: List[FieldModel]): (List[FieldModel], Z2) = {
          val (str1, d1) = y.getData(str)
          val (str2, d2) = x.getData(str1)
          (str2, p.plus2(d2, d1))
        }
      }
  }

  object ReverseDecoderContext {
    val value: ReverseDecoderContext = new ReverseDecoderContext
  }

  class DecoderContext extends Context2[ModelFromStringImpl] {
    override def append[X1, X2, Y1, Y2, Z1, Z2](x: ModelFromStringImpl[X1, X2], y: ModelFromStringImpl[Y1, Y2])(
      p: Plus2[X1, X2, Y1, Y2, Z1, Z2]
    ): ModelFromStringImpl[Z1, Z2] =
      new ModelFromStringImpl[Z1, Z2] {
        override def getData(str: List[FieldModel]): (List[FieldModel], Z2) = {
          val (str1, d1) = x.getData(str)
          val (str2, d2) = y.getData(str1)
          (str2, p.plus2(d1, d2))
        }
      }
  }

  object DecoderContext {
    val value: DecoderContext = new DecoderContext
  }

  def decoder[I1, I2, I3](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    pp: ApplicationX2[ModelFromStringImpl, DecoderContext, I2, I3],
    zsgSetterGeneric: ZsgSetterGeneric[I1, I3]
  ): ModelFromString[I1] =
    new ModelFromString[I1] {
      override def getData(str: List[FieldModel]): (List[FieldModel], I1) = {
        val (str1, m) = pp.application(DecoderContext.value).getData(str)
        (str1, zsgSetterGeneric.setter(m))
      }
    }

  def reverseDecoder[I1, I2, I3](implicit
    ii: ZsgGeneric.Aux[I1, I2],
    pp: ApplicationX2[ModelFromStringImpl, ReverseDecoderContext, I2, I3],
    zsgSetterGeneric: ZsgSetterGeneric[I1, I3]
  ): ModelFromString[I1] =
    new ModelFromString[I1] {
      override def getData(str: List[FieldModel]): (List[FieldModel], I1) = {
        val (str1, m) = pp.application(ReverseDecoderContext.value).getData(str)
        (str1, zsgSetterGeneric.setter(m))
      }
    }

}
