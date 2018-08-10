package net.scalax.asuna.helper.encoder

import net.scalax.asuna.core.encoder.{ EncoderShape, EncoderShapeValue }
import net.scalax.asuna.helper.encoder.macroImpl.EncoderMapper

import scala.language.experimental.macros
import scala.language.higherKinds

trait CaseClassEncoderShapeMapperHelper[RepCol, DataCol] {
  def caseOnly[Table, Case]: ForTableInput[Table, Case, RepCol, DataCol] = macro EncoderMapper.EncoderMapperImpl.impl[Table, Case, RepCol, DataCol]
}

trait ForTableInput[Table, Case, RepCol, DataCol] {
  def input(table: Table): EncoderShapeValue[Case, RepCol, DataCol]
}

trait EncoderContent[RepOut, DataType]

trait EncoderWrapperHelper[RepCol, DataCol, Wrapper[_, _] <: EncoderContent[_, _]] {
  def effect[Rep, D, Out](rep: Rep)(implicit shape: EncoderShape[Rep, D, Out, RepCol, DataCol]): Wrapper[Out, D]
}

trait EncoderHelper[RepCol, DataCol] extends EncoderDataShapeValueHelper[RepCol, DataCol] with CaseClassEncoderShapeMapperHelper[RepCol, DataCol]