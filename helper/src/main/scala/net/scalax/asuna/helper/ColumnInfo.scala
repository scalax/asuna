package net.scalax.asuna.helper

trait MacroColumnInfo {

  val tableColumnName: String
  val modelColumnName: String

  /*type TableType
  type ModelType

  val tableWeakTypeTag: WeakTypeTag[TableType]
  val modelTag: WeakTypeTag[ModelType]

  type TableRepType
  type ModelRepType

  val tableRepWeakTypeTag: WeakTypeTag[TableRepType]
  val modelRepTag: WeakTypeTag[ModelRepType]*/

}

case class MacroColumnInfoImpl /*[TT, MT, TRT, MRT]*/ (
  override val tableColumnName: String,
  override val modelColumnName: String /*,
  override val tableWeakTypeTag: WeakTypeTag[TT],
  override val modelTag: WeakTypeTag[MT],
  override val tableRepWeakTypeTag: WeakTypeTag[TRT],
  override val modelRepTag: WeakTypeTag[MRT]*/ ) extends MacroColumnInfo {

  /*override type TableType = TT
  override type ModelType = MT

  override type TableRepType = TRT
  override type ModelRepType = MRT*/

}

trait MacroColumnInfoContent {

  implicit def columnInfo: MacroColumnInfo

}
/*trait EncoderColumnInfo[RepCol, DataCol] extends MacroColumnInfoContent {
  def edsv: EncoderShapeValue[Any, RepCol, DataCol]
}*/ 