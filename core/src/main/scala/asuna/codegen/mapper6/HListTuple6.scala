package asuna
class HListTuple6[E1, E2, E3, E4, E5, E6](val head: E6 :: E5 :: E4 :: E3 :: E2 :: E1 :: HNil) extends AnyVal with AsunaTuple6[E1, E2, E3, E4, E5, E6] {
  override def add[T](xyy: T): HListTuple7[E1, E2, E3, E4, E5, E6, T] = new HListTuple7[E1, E2, E3, E4, E5, E6, T](xyy :: head)
  override def rightHead: E6                                          = head.head
  override def rightTail: HListTuple5[E1, E2, E3, E4, E5]             = new HListTuple5(head.tail)
  override def i1: E1                                                 = head.tail.tail.tail.tail.tail.head
  override def i2: E2                                                 = head.tail.tail.tail.tail.head
  override def i3: E3                                                 = head.tail.tail.tail.head
  override def i4: E4                                                 = head.tail.tail.head
  override def i5: E5                                                 = head.tail.head
  override def i6: E6                                                 = head.head
}