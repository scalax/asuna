package org.scalax.asuna.ii.item
class ItemTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem     = T1
  override type HeadItem    = org.scalax.asuna.mapper.item.EndItemTag
  override type TailItem    = ItemTag16[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  override type Sub         = org.scalax.asuna.mapper.item.EndItemTag
  override type NoMessage   = ItemTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  override type XyyItemType = XyyItem17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = ItemTag17[
      (RawItem, I#RawItem)
    , (TailItem#RawItem, I#TailItem#RawItem)
    , (TailItem#TailItem#RawItem, I#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem, I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem)
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
    , (
        TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
      , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#RawItem
    )
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = org.scalax.asuna.mapper.item.MessageResultImpl[ItemTagWithMessage17[
      T1
    , I#HeadItem
    , T2
    , I#TailItem#HeadItem
    , T3
    , I#TailItem#TailItem#HeadItem
    , T4
    , I#TailItem#TailItem#TailItem#HeadItem
    , T5
    , I#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T6
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T7
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T8
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T9
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T10
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T11
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T12
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T13
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T14
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T15
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T16
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
    , T17
    , I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem
  ], I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem]
  def debug[
      K <: org.scalax.asuna.mapper.item.KindContext
    , I1 <: org.scalax.asuna.mapper.item.TypeParam
    , I2 <: org.scalax.asuna.mapper.item.TypeParam
    , I3 <: org.scalax.asuna.mapper.item.TypeParam
    , I4 <: org.scalax.asuna.mapper.item.TypeParam
    , I5 <: org.scalax.asuna.mapper.item.TypeParam
    , I6 <: org.scalax.asuna.mapper.item.TypeParam
    , I7 <: org.scalax.asuna.mapper.item.TypeParam
    , I8 <: org.scalax.asuna.mapper.item.TypeParam
    , I9 <: org.scalax.asuna.mapper.item.TypeParam
    , I10 <: org.scalax.asuna.mapper.item.TypeParam
    , I11 <: org.scalax.asuna.mapper.item.TypeParam
    , I12 <: org.scalax.asuna.mapper.item.TypeParam
    , I13 <: org.scalax.asuna.mapper.item.TypeParam
    , I14 <: org.scalax.asuna.mapper.item.TypeParam
    , I15 <: org.scalax.asuna.mapper.item.TypeParam
    , I16 <: org.scalax.asuna.mapper.item.TypeParam
    , I17 <: org.scalax.asuna.mapper.item.TypeParam
  ](c: org.scalax.asuna.mapper.item.Context[K])(
      implicit
    dapp1: org.scalax.asuna.mapper.item.DebugItemApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`]
    , dapp2: org.scalax.asuna.mapper.item.DebugItemApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`]
    , dapp3: org.scalax.asuna.mapper.item.DebugItemApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`]
    , dapp4: org.scalax.asuna.mapper.item.DebugItemApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`]
    , dapp5: org.scalax.asuna.mapper.item.DebugItemApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`]
    , dapp6: org.scalax.asuna.mapper.item.DebugItemApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`]
    , dapp7: org.scalax.asuna.mapper.item.DebugItemApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`]
    , dapp8: org.scalax.asuna.mapper.item.DebugItemApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`]
    , dapp9: org.scalax.asuna.mapper.item.DebugItemApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`]
    , dapp10: org.scalax.asuna.mapper.item.DebugItemApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`]
    , dapp11: org.scalax.asuna.mapper.item.DebugItemApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`]
    , dapp12: org.scalax.asuna.mapper.item.DebugItemApplication[K, T12, I12, `Application can not load with index 12, please eat xyy.`]
    , dapp13: org.scalax.asuna.mapper.item.DebugItemApplication[K, T13, I13, `Application can not load with index 13, please eat xyy.`]
    , dapp14: org.scalax.asuna.mapper.item.DebugItemApplication[K, T14, I14, `Application can not load with index 14, please eat xyy.`]
    , dapp15: org.scalax.asuna.mapper.item.DebugItemApplication[K, T15, I15, `Application can not load with index 15, please eat xyy.`]
    , dapp16: org.scalax.asuna.mapper.item.DebugItemApplication[K, T16, I16, `Application can not load with index 16, please eat xyy.`]
    , dapp17: org.scalax.asuna.mapper.item.DebugItemApplication[K, T17, I17, `Application can not load with index 17, please eat xyy.`]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17], EatXyyType17[
      I1
    , I2
    , I3
    , I4
    , I5
    , I6
    , I7
    , I8
    , I9
    , I10
    , I11
    , I12
    , I13
    , I14
    , I15
    , I16
    , I17
  ]] =
    ItemTag17.appendEatXyy17(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11, dapp12, dapp13, dapp14, dapp15, dapp16, dapp17)
}
object ItemTag17 {
  implicit def appendEatXyy17[
      K <: org.scalax.asuna.mapper.item.KindContext
    , H1
    , H2
    , H3
    , H4
    , H5
    , H6
    , H7
    , H8
    , H9
    , H10
    , H11
    , H12
    , H13
    , H14
    , H15
    , H16
    , H17
    , T1 <: org.scalax.asuna.mapper.item.TypeParam
    , T2 <: org.scalax.asuna.mapper.item.TypeParam
    , T3 <: org.scalax.asuna.mapper.item.TypeParam
    , T4 <: org.scalax.asuna.mapper.item.TypeParam
    , T5 <: org.scalax.asuna.mapper.item.TypeParam
    , T6 <: org.scalax.asuna.mapper.item.TypeParam
    , T7 <: org.scalax.asuna.mapper.item.TypeParam
    , T8 <: org.scalax.asuna.mapper.item.TypeParam
    , T9 <: org.scalax.asuna.mapper.item.TypeParam
    , T10 <: org.scalax.asuna.mapper.item.TypeParam
    , T11 <: org.scalax.asuna.mapper.item.TypeParam
    , T12 <: org.scalax.asuna.mapper.item.TypeParam
    , T13 <: org.scalax.asuna.mapper.item.TypeParam
    , T14 <: org.scalax.asuna.mapper.item.TypeParam
    , T15 <: org.scalax.asuna.mapper.item.TypeParam
    , T16 <: org.scalax.asuna.mapper.item.TypeParam
    , T17 <: org.scalax.asuna.mapper.item.TypeParam
  ](
      implicit t1: org.scalax.asuna.mapper.item.Application[K, H1, T1]
    , t2: org.scalax.asuna.mapper.item.Application[K, H2, T2]
    , t3: org.scalax.asuna.mapper.item.Application[K, H3, T3]
    , t4: org.scalax.asuna.mapper.item.Application[K, H4, T4]
    , t5: org.scalax.asuna.mapper.item.Application[K, H5, T5]
    , t6: org.scalax.asuna.mapper.item.Application[K, H6, T6]
    , t7: org.scalax.asuna.mapper.item.Application[K, H7, T7]
    , t8: org.scalax.asuna.mapper.item.Application[K, H8, T8]
    , t9: org.scalax.asuna.mapper.item.Application[K, H9, T9]
    , t10: org.scalax.asuna.mapper.item.Application[K, H10, T10]
    , t11: org.scalax.asuna.mapper.item.Application[K, H11, T11]
    , t12: org.scalax.asuna.mapper.item.Application[K, H12, T12]
    , t13: org.scalax.asuna.mapper.item.Application[K, H13, T13]
    , t14: org.scalax.asuna.mapper.item.Application[K, H14, T14]
    , t15: org.scalax.asuna.mapper.item.Application[K, H15, T15]
    , t16: org.scalax.asuna.mapper.item.Application[K, H16, T16]
    , t17: org.scalax.asuna.mapper.item.Application[K, H17, T17]
  ): org.scalax.asuna.mapper.item.Application[K, org.scalax.asuna.ii.item.ItemTag17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17], EatXyyType17[
      T1
    , T2
    , T3
    , T4
    , T5
    , T6
    , T7
    , T8
    , T9
    , T10
    , T11
    , T12
    , T13
    , T14
    , T15
    , T16
    , T17
  ]] =
    new org.scalax.asuna.mapper.item.Application[
        K
      , org.scalax.asuna.ii.item.ItemTag17[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11, H12, H13, H14, H15, H16, H17]
      , EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]
    ] {
      override def application(
          context: org.scalax.asuna.mapper.item.Context[K]
      ): K#M[EatXyyType17[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17]] = {
        if (context.isReverse) {
          context.append(
              ItemTag16.appendEatXyy16(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17).application(context)
            , t1.application(context)
            , ArticleXyyPlus17.put17
          )
        } else {
          context.append(
              ItemTag16.appendEatXyy16(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16).application(context)
            , t17.application(context)
            , ArticleXyyPlus17.plus17
          )
        }
      }
    }
}
