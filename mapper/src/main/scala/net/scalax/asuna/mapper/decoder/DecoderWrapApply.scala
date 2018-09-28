package net.scalax.asuna.mapper.decoder

import net.scalax.asuna.core.decoder.{DecoderShape, DecoderShapeValue}
import net.scalax.asuna.mapper.common.InputTable

trait DecoderWrapApply[RepCol, DataCol] {
  def withLazyModel[Input, Output, Sub]: LazyModelWrap[Input, Output, Sub] = new LazyModelWrap[Input, Output, Sub] {}
  def withTable[Case]: TableWrap[Case]                                     = new TableWrap[Case]                   {}

  trait LazyModelWrap[Input, Output, Sub] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: InputTable[Table, DecoderDataGen.Aux[Input, Output, Sub, Rep, TempData]]
    ): DecoderCompiler[Rep, TempData, RepCol, DataCol, LazyModel[Input, Output, Sub]] =
      new DecoderCompiler[Rep, TempData, RepCol, DataCol, LazyModel[Input, Output, Sub]] {
        override def compile[Target1](
            implicit shape: DecoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]
        ): DecoderShapeValue[LazyModel[Input, Output, Sub], RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new DecoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.dmap { (content: TempData) =>
            wrap.from(content, wrap.rep)
          }
        }
      }

  }

  trait TableWrap[Case] {

    def apply[Table, Rep, TempData](table: Table)(
        implicit
      repWrap: InputTable[Table, DecoderDataGen.Aux[EmptyLazyModel, Case, EmptyLazyModel, Rep, TempData]]
    ): DecoderCompiler[Rep, TempData, RepCol, DataCol, Case] =
      new DecoderCompiler[Rep, TempData, RepCol, DataCol, Case] {
        override def compile[Target1](implicit shape: DecoderShape.Aux[Rep, TempData, Target1, RepCol, DataCol]): DecoderShapeValue[Case, RepCol, DataCol] = {
          val shape1     = shape
          val wrap       = repWrap.inputTable(table)
          val wrappedRep = shape1.wrapRep(wrap.rep)
          val sv = new DecoderShapeValue[TempData, RepCol, DataCol] {
            override type RepType = Target1
            override val rep   = wrappedRep
            override val shape = shape1.packed
          }
          sv.dmap { (content: TempData) =>
            wrap.from(content, wrap.rep).apply(EmptyLazyModel.value)
          }
        }
      }

  }

}

object DecoderWrapApply {
  def decoderInstance[RepCol, DataCol]: DecoderWrapApply[RepCol, DataCol] = new DecoderWrapApply[RepCol, DataCol] {}
}