package asuna.scala_tuple.tuple_support
import asuna.Plus1
import asuna.support.heterogeneous._
trait PlusToTuple_11_1 {
final def plusWithTypeParameter11[X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11
, Y1  ]:
Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  HNil
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  )
] = new Plus1[
X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  HNil
, Y1
, ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  )
] {
final override def takeHead1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  )):  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  HNil =
z._2 ::  z._3 ::  z._4 ::  z._5 ::  z._6 ::  z._7 ::  z._8 ::  z._9 ::  z._10 ::  z._11 ::  z._12 ::  HNil.value
final override def takeTail1(z: ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  )): Y1 = z._1
final override def plus1(x:  X1_C1 ::  X1_C2 ::  X1_C3 ::  X1_C4 ::  X1_C5 ::  X1_C6 ::  X1_C7 ::  X1_C8 ::  X1_C9 ::  X1_C10 ::  X1_C11 ::  HNil, y: Y1): ( Y1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8  , X1_C9  , X1_C10  , X1_C11  ) =
(y  , x  .head  , x  .tail  .head  , x  .tail  .tail  .head  , x  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head  , x  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .tail  .head )
}
}
