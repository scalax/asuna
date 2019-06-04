package org.scalax.asuna.mapper.item
class NodeTag11[
  T1 <: org.scalax.asuna.mapper.item.ItemTag,
  T2 <: org.scalax.asuna.mapper.item.ItemTag,
  T3 <: org.scalax.asuna.mapper.item.ItemTag,
  T4 <: org.scalax.asuna.mapper.item.ItemTag,
  T5 <: org.scalax.asuna.mapper.item.ItemTag,
  T6 <: org.scalax.asuna.mapper.item.ItemTag,
  T7 <: org.scalax.asuna.mapper.item.ItemTag,
  T8 <: org.scalax.asuna.mapper.item.ItemTag,
  T9 <: org.scalax.asuna.mapper.item.ItemTag,
  T10 <: org.scalax.asuna.mapper.item.ItemTag,
  T11 <: org.scalax.asuna.mapper.item.ItemTag
] extends org.scalax.asuna.mapper.item.ItemTag {
  override type RawItem  = org.scalax.asuna.mapper.item.NotUseItem
  override type HeadItem = T1
  override type TailItem = NodeTag10[T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]
  override type Sub      = NodeTag11[T1#Sub, T2#Sub, T3#Sub, T4#Sub, T5#Sub, T6#Sub, T7#Sub, T8#Sub, T9#Sub, T10#Sub, T11#Sub]
  override type NoMessage =
    NodeTag11[T1#NoMessage, T2#NoMessage, T3#NoMessage, T4#NoMessage, T5#NoMessage, T6#NoMessage, T7#NoMessage, T8#NoMessage, T9#NoMessage, T10#NoMessage, T11#NoMessage]
  override type Pull[I <: org.scalax.asuna.mapper.item.ItemTag] = NodeTag11[
    HeadItem#Sub#Pull[I#HeadItem#Sub],
    TailItem#HeadItem#Sub#Pull[I#TailItem#HeadItem#Sub],
    TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ],
    TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub#Pull[
      I#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#TailItem#HeadItem#Sub
    ]
  ]
  override type InputMessage[I <: org.scalax.asuna.mapper.item.MessageContent] = ({
    type Type1  = T1#InputMessage[I];
    type Type2  = T2#InputMessage[Type1#Left];
    type Type3  = T3#InputMessage[Type2#Left];
    type Type4  = T4#InputMessage[Type3#Left];
    type Type5  = T5#InputMessage[Type4#Left];
    type Type6  = T6#InputMessage[Type5#Left];
    type Type7  = T7#InputMessage[Type6#Left];
    type Type8  = T8#InputMessage[Type7#Left];
    type Type9  = T9#InputMessage[Type8#Left];
    type Type10 = T10#InputMessage[Type9#Left];
    type Type11 = T11#InputMessage[Type10#Left];
    type II = org.scalax.asuna.mapper.item.MessageResultImpl[NodeTag11[
      Type1#Result,
      Type2#Result,
      Type3#Result,
      Type4#Result,
      Type5#Result,
      Type6#Result,
      Type7#Result,
      Type8#Result,
      Type9#Result,
      Type10#Result,
      Type11#Result
    ], Type11#Left]
  })#II
  override type XyyItemType = XyyItem11[
    T1#XyyItemType,
    T2#XyyItemType,
    T3#XyyItemType,
    T4#XyyItemType,
    T5#XyyItemType,
    T6#XyyItemType,
    T7#XyyItemType,
    T8#XyyItemType,
    T9#XyyItemType,
    T10#XyyItemType,
    T11#XyyItemType
  ]
  def debug[
    K <: org.scalax.asuna.mapper.KindContext,
    I1 <: org.scalax.asuna.mapper.TypeParam,
    I2 <: org.scalax.asuna.mapper.TypeParam,
    I3 <: org.scalax.asuna.mapper.TypeParam,
    I4 <: org.scalax.asuna.mapper.TypeParam,
    I5 <: org.scalax.asuna.mapper.TypeParam,
    I6 <: org.scalax.asuna.mapper.TypeParam,
    I7 <: org.scalax.asuna.mapper.TypeParam,
    I8 <: org.scalax.asuna.mapper.TypeParam,
    I9 <: org.scalax.asuna.mapper.TypeParam,
    I10 <: org.scalax.asuna.mapper.TypeParam,
    I11 <: org.scalax.asuna.mapper.TypeParam
  ](c: org.scalax.asuna.mapper.Context[K])(
    implicit
    dapp1: org.scalax.asuna.mapper.DebugApplication[K, T1, I1, `Application can not load with index 1, please eat xyy.`],
    dapp2: org.scalax.asuna.mapper.DebugApplication[K, T2, I2, `Application can not load with index 2, please eat xyy.`],
    dapp3: org.scalax.asuna.mapper.DebugApplication[K, T3, I3, `Application can not load with index 3, please eat xyy.`],
    dapp4: org.scalax.asuna.mapper.DebugApplication[K, T4, I4, `Application can not load with index 4, please eat xyy.`],
    dapp5: org.scalax.asuna.mapper.DebugApplication[K, T5, I5, `Application can not load with index 5, please eat xyy.`],
    dapp6: org.scalax.asuna.mapper.DebugApplication[K, T6, I6, `Application can not load with index 6, please eat xyy.`],
    dapp7: org.scalax.asuna.mapper.DebugApplication[K, T7, I7, `Application can not load with index 7, please eat xyy.`],
    dapp8: org.scalax.asuna.mapper.DebugApplication[K, T8, I8, `Application can not load with index 8, please eat xyy.`],
    dapp9: org.scalax.asuna.mapper.DebugApplication[K, T9, I9, `Application can not load with index 9, please eat xyy.`],
    dapp10: org.scalax.asuna.mapper.DebugApplication[K, T10, I10, `Application can not load with index 10, please eat xyy.`],
    dapp11: org.scalax.asuna.mapper.DebugApplication[K, T11, I11, `Application can not load with index 11, please eat xyy.`]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11], EatXyyType11[
    I1,
    I2,
    I3,
    I4,
    I5,
    I6,
    I7,
    I8,
    I9,
    I10,
    I11
  ]] =
    NodeTag11.appendNodeTagEatXyy11(dapp1, dapp2, dapp3, dapp4, dapp5, dapp6, dapp7, dapp8, dapp9, dapp10, dapp11)
}
object NodeTag11 {
  implicit def appendNodeTagEatXyy11[
    K <: org.scalax.asuna.mapper.KindContext,
    H1 <: org.scalax.asuna.mapper.item.ItemTag,
    H2 <: org.scalax.asuna.mapper.item.ItemTag,
    H3 <: org.scalax.asuna.mapper.item.ItemTag,
    H4 <: org.scalax.asuna.mapper.item.ItemTag,
    H5 <: org.scalax.asuna.mapper.item.ItemTag,
    H6 <: org.scalax.asuna.mapper.item.ItemTag,
    H7 <: org.scalax.asuna.mapper.item.ItemTag,
    H8 <: org.scalax.asuna.mapper.item.ItemTag,
    H9 <: org.scalax.asuna.mapper.item.ItemTag,
    H10 <: org.scalax.asuna.mapper.item.ItemTag,
    H11 <: org.scalax.asuna.mapper.item.ItemTag,
    T1 <: org.scalax.asuna.mapper.TypeParam,
    T2 <: org.scalax.asuna.mapper.TypeParam,
    T3 <: org.scalax.asuna.mapper.TypeParam,
    T4 <: org.scalax.asuna.mapper.TypeParam,
    T5 <: org.scalax.asuna.mapper.TypeParam,
    T6 <: org.scalax.asuna.mapper.TypeParam,
    T7 <: org.scalax.asuna.mapper.TypeParam,
    T8 <: org.scalax.asuna.mapper.TypeParam,
    T9 <: org.scalax.asuna.mapper.TypeParam,
    T10 <: org.scalax.asuna.mapper.TypeParam,
    T11 <: org.scalax.asuna.mapper.TypeParam
  ](
    implicit t1: org.scalax.asuna.mapper.Application[K, H1, T1],
    t2: org.scalax.asuna.mapper.Application[K, H2, T2],
    t3: org.scalax.asuna.mapper.Application[K, H3, T3],
    t4: org.scalax.asuna.mapper.Application[K, H4, T4],
    t5: org.scalax.asuna.mapper.Application[K, H5, T5],
    t6: org.scalax.asuna.mapper.Application[K, H6, T6],
    t7: org.scalax.asuna.mapper.Application[K, H7, T7],
    t8: org.scalax.asuna.mapper.Application[K, H8, T8],
    t9: org.scalax.asuna.mapper.Application[K, H9, T9],
    t10: org.scalax.asuna.mapper.Application[K, H10, T10],
    t11: org.scalax.asuna.mapper.Application[K, H11, T11]
  ): org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], EatXyyType11[
    T1,
    T2,
    T3,
    T4,
    T5,
    T6,
    T7,
    T8,
    T9,
    T10,
    T11
  ]] =
    new org.scalax.asuna.mapper.Application[K, org.scalax.asuna.mapper.item.NodeTag11[H1, H2, H3, H4, H5, H6, H7, H8, H9, H10, H11], EatXyyType11[
      T1,
      T2,
      T3,
      T4,
      T5,
      T6,
      T7,
      T8,
      T9,
      T10,
      T11
    ]] {
      override def application(context: org.scalax.asuna.mapper.Context[K]): K#M[EatXyyType11[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11]] = {
        if (context.isReverse) {
          context.append(NodeTag10.appendNodeTagEatXyy10(t2, t3, t4, t5, t6, t7, t8, t9, t10, t11).application(context), t1.application(context), ArticleXyyPlus11.put11)
        } else {
          context.append(NodeTag10.appendNodeTagEatXyy10(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).application(context), t11.application(context), ArticleXyyPlus11.plus11)
        }
      }
    }
}
class `Application can not load with index 11, please eat xyy.` extends org.scalax.asuna.mapper.item.Message