package org.scalax.asuna.mapper.item
trait XyyItem18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
    extends Any
    with org.scalax.asuna.mapper.item.TagContentImpl[ItemTag18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]] {
  self =>
  override type IITag = ItemTag18[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]
  def i1: E1
  def i2: E2
  def i3: E3
  def i4: E4
  def i5: E5
  def i6: E6
  def i7: E7
  def i8: E8
  def i9: E9
  def i10: E10
  def i11: E11
  def i12: E12
  def i13: E13
  def i14: E14
  def i15: E15
  def i16: E16
  def i17: E17
  def i18: E18
  def leftHead: E1                                                                                                    = throw new Exception("Can not use this method.")
  def leftTail: XyyItem17[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18]                = throw new Exception("Can not use this method.")
  def rightHead: E18                                                                                                  = throw new Exception("Can not use this method.")
  def rightTail: XyyItem17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17]                = throw new Exception("Can not use this method.")
  def eat[T](xyy: T): XyyItem19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, T]   = throw new Exception("Can not use this method.")
  def pudao[T](xyy: T): XyyItem19[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] = throw new Exception("Can not use this method.")
  def eatToTuple[T](xyy: T): Tuple19[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18, T] =
    (
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18,
      xyy
    )
  def pudaoToTuple[T](xyy: T): Tuple19[T, E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    (
      xyy,
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18
    )
  def leftTuple: Tuple17[E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17, E18] =
    Tuple17(
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17,
      self.i18
    )
  def rightTuple: Tuple17[E1, E2, E3, E4, E5, E6, E7, E8, E9, E10, E11, E12, E13, E14, E15, E16, E17] =
    Tuple17(
      self.i1,
      self.i2,
      self.i3,
      self.i4,
      self.i5,
      self.i6,
      self.i7,
      self.i8,
      self.i9,
      self.i10,
      self.i11,
      self.i12,
      self.i13,
      self.i14,
      self.i15,
      self.i16,
      self.i17
    )
}