package org.scalax.asuna.mapper.item
import shapeless._
class ReverseHListItem7[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ](val head:  E1 ::  E2 ::  E3 ::  E4 ::  E5 ::  E6 ::  E7 ::  HNil) extends AnyVal with Item7[ E1  ,   E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ] {
override def pudao[T](xyy: T): ReverseHListItem8[T  , E1  , E2  , E3  , E4  , E5  , E6  , E7 ] = new ReverseHListItem8[T  , E1  , E2  , E3  , E4  , E5  , E6  , E7  ](xyy :: head)
override def leftHead: E1 = head.head
override def leftTail: ReverseHListItem6[ E2  ,   E3  ,   E4  ,   E5  ,   E6  ,   E7  ] = new ReverseHListItem6(head.tail)
override def i1: E1 = head.head
override def i2: E2 = head .tail .head
override def i3: E3 = head .tail  .tail .head
override def i4: E4 = head .tail  .tail  .tail .head
override def i5: E5 = head .tail  .tail  .tail  .tail .head
override def i6: E6 = head .tail  .tail  .tail  .tail  .tail .head
override def i7: E7 = head .tail  .tail  .tail  .tail  .tail  .tail .head
}