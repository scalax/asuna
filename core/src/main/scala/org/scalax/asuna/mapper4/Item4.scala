package org.scalax.asuna.mapper.item
trait Item4[ E1  ,   E2  ,   E3  ,   E4  ] extends Any {
self =>
def i1: E1
def i2: E2
def i3: E3
def i4: E4
def leftHead: E1 = throw new Exception("Can not use this method.")
def leftTail: Item3[ E2  ,   E3  ,   E4  ] = throw new Exception("Can not use this method.")
def rightHead: E4 = throw new Exception("Can not use this method.")
def rightTail: Item3[ E1  ,   E2  ,   E3  ] = throw new Exception("Can not use this method.")
def eat[T](xyy: T): Item5[ E1,  E2,  E3,  E4,  T] = throw new Exception("Can not use this method.")
def pudao[T](xyy: T): Item5[T  , E1  , E2  , E3  , E4 ] = throw new Exception("Can not use this method.")
def eatToTuple[T](xyy: T): Tuple5[ E1,  E2,  E3,  E4,  T] = ( self.i1,  self.i2,  self.i3,  self.i4,  xyy)
def pudaoToTuple[T](xyy: T): Tuple5[T  , E1  , E2  , E3  , E4 ] = (xyy  , self.i1  , self.i2  , self.i3  , self.i4 )
def leftTuple: Tuple3[ E2  ,   E3  ,   E4  ] = Tuple3( self.i2  ,   self.i3  ,   self.i4  )
def rightTuple: Tuple3[ E1  ,   E2  ,   E3  ] = Tuple3( self.i1  ,   self.i2  ,   self.i3  )
}