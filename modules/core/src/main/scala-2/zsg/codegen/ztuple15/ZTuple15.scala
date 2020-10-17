package zsg
import scala.language.higherKinds
class ZTuple15[I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11, I12, I13, I14, I15](
  val i1: I1,
  val i2: I2,
  val i3: I3,
  val i4: I4,
  val i5: I5,
  val i6: I6,
  val i7: I7,
  val i8: I8,
  val i9: I9,
  val i10: I10,
  val i11: I11,
  val i12: I12,
  val i13: I13,
  val i14: I14,
  val i15: I15
) extends zsg.TupleTag
object ZTuple15 {
  implicit def contextNum1[F[_], T <: Context1[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple11_Context1, Tuple12_Context1, Tuple13_Context1, Tuple14_Context1, Tuple15_Context1](
    implicit
    t1: F[
      Tuple1_Context1
    ],
    t2: F[
      Tuple2_Context1
    ],
    t3: F[
      Tuple3_Context1
    ],
    t4: F[
      Tuple4_Context1
    ],
    t5: F[
      Tuple5_Context1
    ],
    t6: F[
      Tuple6_Context1
    ],
    t7: F[
      Tuple7_Context1
    ],
    t8: F[
      Tuple8_Context1
    ],
    t9: F[
      Tuple9_Context1
    ],
    t10: F[
      Tuple10_Context1
    ],
    t11: F[
      Tuple11_Context1
    ],
    t12: F[
      Tuple12_Context1
    ],
    t13: F[
      Tuple13_Context1
    ],
    t14: F[
      Tuple14_Context1
    ],
    t15: F[
      Tuple15_Context1
    ]
  ): ApplicationX1[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ]] = new ApplicationX1[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ]] {
    override def application(context: T): F[
      ZTuple15[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1,
        Tuple11_Context1,
        Tuple12_Context1,
        Tuple13_Context1,
        Tuple14_Context1,
        Tuple15_Context1
      ]
    ] = {
      context.append(
        context.append(
          context.append(
            context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum1))(
              zsg.PlusInstanceZsgTuple2.contextNum1
            ),
            context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum1))(
              zsg.PlusInstanceZsgTuple2.contextNum1
            )
          )(zsg.PlusInstanceZsgTuple2.contextNum1),
          context.append(
            context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum1))(
              zsg.PlusInstanceZsgTuple2.contextNum1
            ),
            context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum1)
          )(zsg.PlusInstanceZsgTuple2.contextNum1)
        )(zsg.PlusInstanceZsgTuple2.contextNum1),
        t15
      )(PlusInstanceTuple15.contextNum1)
    }
  }
  implicit def contextNum2[F[_, _], T <: Context2[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple11_Context1, Tuple12_Context1, Tuple13_Context1, Tuple14_Context1, Tuple15_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple11_Context2, Tuple12_Context2, Tuple13_Context2, Tuple14_Context2, Tuple15_Context2](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2
    ],
    t4: F[
      Tuple4_Context1,
      Tuple4_Context2
    ],
    t5: F[
      Tuple5_Context1,
      Tuple5_Context2
    ],
    t6: F[
      Tuple6_Context1,
      Tuple6_Context2
    ],
    t7: F[
      Tuple7_Context1,
      Tuple7_Context2
    ],
    t8: F[
      Tuple8_Context1,
      Tuple8_Context2
    ],
    t9: F[
      Tuple9_Context1,
      Tuple9_Context2
    ],
    t10: F[
      Tuple10_Context1,
      Tuple10_Context2
    ],
    t11: F[
      Tuple11_Context1,
      Tuple11_Context2
    ],
    t12: F[
      Tuple12_Context1,
      Tuple12_Context2
    ],
    t13: F[
      Tuple13_Context1,
      Tuple13_Context2
    ],
    t14: F[
      Tuple14_Context1,
      Tuple14_Context2
    ],
    t15: F[
      Tuple15_Context1,
      Tuple15_Context2
    ]
  ): ApplicationX2[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ]] = new ApplicationX2[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ]] {
    override def application(context: T): F[
      ZTuple15[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1,
        Tuple11_Context1,
        Tuple12_Context1,
        Tuple13_Context1,
        Tuple14_Context1,
        Tuple15_Context1
      ],
      ZTuple15[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2,
        Tuple11_Context2,
        Tuple12_Context2,
        Tuple13_Context2,
        Tuple14_Context2,
        Tuple15_Context2
      ]
    ] = {
      context.append(
        context.append(
          context.append(
            context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum2))(
              zsg.PlusInstanceZsgTuple2.contextNum2
            ),
            context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum2))(
              zsg.PlusInstanceZsgTuple2.contextNum2
            )
          )(zsg.PlusInstanceZsgTuple2.contextNum2),
          context.append(
            context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum2))(
              zsg.PlusInstanceZsgTuple2.contextNum2
            ),
            context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum2)
          )(zsg.PlusInstanceZsgTuple2.contextNum2)
        )(zsg.PlusInstanceZsgTuple2.contextNum2),
        t15
      )(PlusInstanceTuple15.contextNum2)
    }
  }
  implicit def contextNum3[F[_, _, _], T <: Context3[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple11_Context1, Tuple12_Context1, Tuple13_Context1, Tuple14_Context1, Tuple15_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple11_Context2, Tuple12_Context2, Tuple13_Context2, Tuple14_Context2, Tuple15_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple11_Context3, Tuple12_Context3, Tuple13_Context3, Tuple14_Context3, Tuple15_Context3](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3
    ],
    t4: F[
      Tuple4_Context1,
      Tuple4_Context2,
      Tuple4_Context3
    ],
    t5: F[
      Tuple5_Context1,
      Tuple5_Context2,
      Tuple5_Context3
    ],
    t6: F[
      Tuple6_Context1,
      Tuple6_Context2,
      Tuple6_Context3
    ],
    t7: F[
      Tuple7_Context1,
      Tuple7_Context2,
      Tuple7_Context3
    ],
    t8: F[
      Tuple8_Context1,
      Tuple8_Context2,
      Tuple8_Context3
    ],
    t9: F[
      Tuple9_Context1,
      Tuple9_Context2,
      Tuple9_Context3
    ],
    t10: F[
      Tuple10_Context1,
      Tuple10_Context2,
      Tuple10_Context3
    ],
    t11: F[
      Tuple11_Context1,
      Tuple11_Context2,
      Tuple11_Context3
    ],
    t12: F[
      Tuple12_Context1,
      Tuple12_Context2,
      Tuple12_Context3
    ],
    t13: F[
      Tuple13_Context1,
      Tuple13_Context2,
      Tuple13_Context3
    ],
    t14: F[
      Tuple14_Context1,
      Tuple14_Context2,
      Tuple14_Context3
    ],
    t15: F[
      Tuple15_Context1,
      Tuple15_Context2,
      Tuple15_Context3
    ]
  ): ApplicationX3[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ]] = new ApplicationX3[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ]] {
    override def application(context: T): F[
      ZTuple15[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1,
        Tuple11_Context1,
        Tuple12_Context1,
        Tuple13_Context1,
        Tuple14_Context1,
        Tuple15_Context1
      ],
      ZTuple15[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2,
        Tuple11_Context2,
        Tuple12_Context2,
        Tuple13_Context2,
        Tuple14_Context2,
        Tuple15_Context2
      ],
      ZTuple15[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3,
        Tuple11_Context3,
        Tuple12_Context3,
        Tuple13_Context3,
        Tuple14_Context3,
        Tuple15_Context3
      ]
    ] = {
      context.append(
        context.append(
          context.append(
            context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum3))(
              zsg.PlusInstanceZsgTuple2.contextNum3
            ),
            context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum3))(
              zsg.PlusInstanceZsgTuple2.contextNum3
            )
          )(zsg.PlusInstanceZsgTuple2.contextNum3),
          context.append(
            context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum3))(
              zsg.PlusInstanceZsgTuple2.contextNum3
            ),
            context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum3)
          )(zsg.PlusInstanceZsgTuple2.contextNum3)
        )(zsg.PlusInstanceZsgTuple2.contextNum3),
        t15
      )(PlusInstanceTuple15.contextNum3)
    }
  }
  implicit def contextNum4[F[_, _, _, _], T <: Context4[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple11_Context1, Tuple12_Context1, Tuple13_Context1, Tuple14_Context1, Tuple15_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple11_Context2, Tuple12_Context2, Tuple13_Context2, Tuple14_Context2, Tuple15_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple11_Context3, Tuple12_Context3, Tuple13_Context3, Tuple14_Context3, Tuple15_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple11_Context4, Tuple12_Context4, Tuple13_Context4, Tuple14_Context4, Tuple15_Context4](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4
    ],
    t4: F[
      Tuple4_Context1,
      Tuple4_Context2,
      Tuple4_Context3,
      Tuple4_Context4
    ],
    t5: F[
      Tuple5_Context1,
      Tuple5_Context2,
      Tuple5_Context3,
      Tuple5_Context4
    ],
    t6: F[
      Tuple6_Context1,
      Tuple6_Context2,
      Tuple6_Context3,
      Tuple6_Context4
    ],
    t7: F[
      Tuple7_Context1,
      Tuple7_Context2,
      Tuple7_Context3,
      Tuple7_Context4
    ],
    t8: F[
      Tuple8_Context1,
      Tuple8_Context2,
      Tuple8_Context3,
      Tuple8_Context4
    ],
    t9: F[
      Tuple9_Context1,
      Tuple9_Context2,
      Tuple9_Context3,
      Tuple9_Context4
    ],
    t10: F[
      Tuple10_Context1,
      Tuple10_Context2,
      Tuple10_Context3,
      Tuple10_Context4
    ],
    t11: F[
      Tuple11_Context1,
      Tuple11_Context2,
      Tuple11_Context3,
      Tuple11_Context4
    ],
    t12: F[
      Tuple12_Context1,
      Tuple12_Context2,
      Tuple12_Context3,
      Tuple12_Context4
    ],
    t13: F[
      Tuple13_Context1,
      Tuple13_Context2,
      Tuple13_Context3,
      Tuple13_Context4
    ],
    t14: F[
      Tuple14_Context1,
      Tuple14_Context2,
      Tuple14_Context3,
      Tuple14_Context4
    ],
    t15: F[
      Tuple15_Context1,
      Tuple15_Context2,
      Tuple15_Context3,
      Tuple15_Context4
    ]
  ): ApplicationX4[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ]] = new ApplicationX4[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ]] {
    override def application(context: T): F[
      ZTuple15[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1,
        Tuple11_Context1,
        Tuple12_Context1,
        Tuple13_Context1,
        Tuple14_Context1,
        Tuple15_Context1
      ],
      ZTuple15[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2,
        Tuple11_Context2,
        Tuple12_Context2,
        Tuple13_Context2,
        Tuple14_Context2,
        Tuple15_Context2
      ],
      ZTuple15[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3,
        Tuple11_Context3,
        Tuple12_Context3,
        Tuple13_Context3,
        Tuple14_Context3,
        Tuple15_Context3
      ],
      ZTuple15[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4,
        Tuple11_Context4,
        Tuple12_Context4,
        Tuple13_Context4,
        Tuple14_Context4,
        Tuple15_Context4
      ]
    ] = {
      context.append(
        context.append(
          context.append(
            context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum4))(
              zsg.PlusInstanceZsgTuple2.contextNum4
            ),
            context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum4))(
              zsg.PlusInstanceZsgTuple2.contextNum4
            )
          )(zsg.PlusInstanceZsgTuple2.contextNum4),
          context.append(
            context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum4))(
              zsg.PlusInstanceZsgTuple2.contextNum4
            ),
            context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum4)
          )(zsg.PlusInstanceZsgTuple2.contextNum4)
        )(zsg.PlusInstanceZsgTuple2.contextNum4),
        t15
      )(PlusInstanceTuple15.contextNum4)
    }
  }
  implicit def contextNum5[F[_, _, _, _, _], T <: Context5[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple11_Context1, Tuple12_Context1, Tuple13_Context1, Tuple14_Context1, Tuple15_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple11_Context2, Tuple12_Context2, Tuple13_Context2, Tuple14_Context2, Tuple15_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple11_Context3, Tuple12_Context3, Tuple13_Context3, Tuple14_Context3, Tuple15_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple11_Context4, Tuple12_Context4, Tuple13_Context4, Tuple14_Context4, Tuple15_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, Tuple6_Context5, Tuple7_Context5, Tuple8_Context5, Tuple9_Context5, Tuple10_Context5, Tuple11_Context5, Tuple12_Context5, Tuple13_Context5, Tuple14_Context5, Tuple15_Context5](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4,
      Tuple2_Context5
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4,
      Tuple3_Context5
    ],
    t4: F[
      Tuple4_Context1,
      Tuple4_Context2,
      Tuple4_Context3,
      Tuple4_Context4,
      Tuple4_Context5
    ],
    t5: F[
      Tuple5_Context1,
      Tuple5_Context2,
      Tuple5_Context3,
      Tuple5_Context4,
      Tuple5_Context5
    ],
    t6: F[
      Tuple6_Context1,
      Tuple6_Context2,
      Tuple6_Context3,
      Tuple6_Context4,
      Tuple6_Context5
    ],
    t7: F[
      Tuple7_Context1,
      Tuple7_Context2,
      Tuple7_Context3,
      Tuple7_Context4,
      Tuple7_Context5
    ],
    t8: F[
      Tuple8_Context1,
      Tuple8_Context2,
      Tuple8_Context3,
      Tuple8_Context4,
      Tuple8_Context5
    ],
    t9: F[
      Tuple9_Context1,
      Tuple9_Context2,
      Tuple9_Context3,
      Tuple9_Context4,
      Tuple9_Context5
    ],
    t10: F[
      Tuple10_Context1,
      Tuple10_Context2,
      Tuple10_Context3,
      Tuple10_Context4,
      Tuple10_Context5
    ],
    t11: F[
      Tuple11_Context1,
      Tuple11_Context2,
      Tuple11_Context3,
      Tuple11_Context4,
      Tuple11_Context5
    ],
    t12: F[
      Tuple12_Context1,
      Tuple12_Context2,
      Tuple12_Context3,
      Tuple12_Context4,
      Tuple12_Context5
    ],
    t13: F[
      Tuple13_Context1,
      Tuple13_Context2,
      Tuple13_Context3,
      Tuple13_Context4,
      Tuple13_Context5
    ],
    t14: F[
      Tuple14_Context1,
      Tuple14_Context2,
      Tuple14_Context3,
      Tuple14_Context4,
      Tuple14_Context5
    ],
    t15: F[
      Tuple15_Context1,
      Tuple15_Context2,
      Tuple15_Context3,
      Tuple15_Context4,
      Tuple15_Context5
    ]
  ): ApplicationX5[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ], ZTuple15[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5,
    Tuple11_Context5,
    Tuple12_Context5,
    Tuple13_Context5,
    Tuple14_Context5,
    Tuple15_Context5
  ]] = new ApplicationX5[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ], ZTuple15[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5,
    Tuple11_Context5,
    Tuple12_Context5,
    Tuple13_Context5,
    Tuple14_Context5,
    Tuple15_Context5
  ]] {
    override def application(context: T): F[
      ZTuple15[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1,
        Tuple11_Context1,
        Tuple12_Context1,
        Tuple13_Context1,
        Tuple14_Context1,
        Tuple15_Context1
      ],
      ZTuple15[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2,
        Tuple11_Context2,
        Tuple12_Context2,
        Tuple13_Context2,
        Tuple14_Context2,
        Tuple15_Context2
      ],
      ZTuple15[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3,
        Tuple11_Context3,
        Tuple12_Context3,
        Tuple13_Context3,
        Tuple14_Context3,
        Tuple15_Context3
      ],
      ZTuple15[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4,
        Tuple11_Context4,
        Tuple12_Context4,
        Tuple13_Context4,
        Tuple14_Context4,
        Tuple15_Context4
      ],
      ZTuple15[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        Tuple5_Context5,
        Tuple6_Context5,
        Tuple7_Context5,
        Tuple8_Context5,
        Tuple9_Context5,
        Tuple10_Context5,
        Tuple11_Context5,
        Tuple12_Context5,
        Tuple13_Context5,
        Tuple14_Context5,
        Tuple15_Context5
      ]
    ] = {
      context.append(
        context.append(
          context.append(
            context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum5))(
              zsg.PlusInstanceZsgTuple2.contextNum5
            ),
            context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum5))(
              zsg.PlusInstanceZsgTuple2.contextNum5
            )
          )(zsg.PlusInstanceZsgTuple2.contextNum5),
          context.append(
            context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum5))(
              zsg.PlusInstanceZsgTuple2.contextNum5
            ),
            context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum5)
          )(zsg.PlusInstanceZsgTuple2.contextNum5)
        )(zsg.PlusInstanceZsgTuple2.contextNum5),
        t15
      )(PlusInstanceTuple15.contextNum5)
    }
  }
  implicit def contextNum6[F[_, _, _, _, _, _], T <: Context6[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple11_Context1, Tuple12_Context1, Tuple13_Context1, Tuple14_Context1, Tuple15_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple11_Context2, Tuple12_Context2, Tuple13_Context2, Tuple14_Context2, Tuple15_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple11_Context3, Tuple12_Context3, Tuple13_Context3, Tuple14_Context3, Tuple15_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple11_Context4, Tuple12_Context4, Tuple13_Context4, Tuple14_Context4, Tuple15_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, Tuple6_Context5, Tuple7_Context5, Tuple8_Context5, Tuple9_Context5, Tuple10_Context5, Tuple11_Context5, Tuple12_Context5, Tuple13_Context5, Tuple14_Context5, Tuple15_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, Tuple6_Context6, Tuple7_Context6, Tuple8_Context6, Tuple9_Context6, Tuple10_Context6, Tuple11_Context6, Tuple12_Context6, Tuple13_Context6, Tuple14_Context6, Tuple15_Context6](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4,
      Tuple2_Context5,
      Tuple2_Context6
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4,
      Tuple3_Context5,
      Tuple3_Context6
    ],
    t4: F[
      Tuple4_Context1,
      Tuple4_Context2,
      Tuple4_Context3,
      Tuple4_Context4,
      Tuple4_Context5,
      Tuple4_Context6
    ],
    t5: F[
      Tuple5_Context1,
      Tuple5_Context2,
      Tuple5_Context3,
      Tuple5_Context4,
      Tuple5_Context5,
      Tuple5_Context6
    ],
    t6: F[
      Tuple6_Context1,
      Tuple6_Context2,
      Tuple6_Context3,
      Tuple6_Context4,
      Tuple6_Context5,
      Tuple6_Context6
    ],
    t7: F[
      Tuple7_Context1,
      Tuple7_Context2,
      Tuple7_Context3,
      Tuple7_Context4,
      Tuple7_Context5,
      Tuple7_Context6
    ],
    t8: F[
      Tuple8_Context1,
      Tuple8_Context2,
      Tuple8_Context3,
      Tuple8_Context4,
      Tuple8_Context5,
      Tuple8_Context6
    ],
    t9: F[
      Tuple9_Context1,
      Tuple9_Context2,
      Tuple9_Context3,
      Tuple9_Context4,
      Tuple9_Context5,
      Tuple9_Context6
    ],
    t10: F[
      Tuple10_Context1,
      Tuple10_Context2,
      Tuple10_Context3,
      Tuple10_Context4,
      Tuple10_Context5,
      Tuple10_Context6
    ],
    t11: F[
      Tuple11_Context1,
      Tuple11_Context2,
      Tuple11_Context3,
      Tuple11_Context4,
      Tuple11_Context5,
      Tuple11_Context6
    ],
    t12: F[
      Tuple12_Context1,
      Tuple12_Context2,
      Tuple12_Context3,
      Tuple12_Context4,
      Tuple12_Context5,
      Tuple12_Context6
    ],
    t13: F[
      Tuple13_Context1,
      Tuple13_Context2,
      Tuple13_Context3,
      Tuple13_Context4,
      Tuple13_Context5,
      Tuple13_Context6
    ],
    t14: F[
      Tuple14_Context1,
      Tuple14_Context2,
      Tuple14_Context3,
      Tuple14_Context4,
      Tuple14_Context5,
      Tuple14_Context6
    ],
    t15: F[
      Tuple15_Context1,
      Tuple15_Context2,
      Tuple15_Context3,
      Tuple15_Context4,
      Tuple15_Context5,
      Tuple15_Context6
    ]
  ): ApplicationX6[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ], ZTuple15[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5,
    Tuple11_Context5,
    Tuple12_Context5,
    Tuple13_Context5,
    Tuple14_Context5,
    Tuple15_Context5
  ], ZTuple15[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6,
    Tuple11_Context6,
    Tuple12_Context6,
    Tuple13_Context6,
    Tuple14_Context6,
    Tuple15_Context6
  ]] = new ApplicationX6[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ], ZTuple15[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5,
    Tuple11_Context5,
    Tuple12_Context5,
    Tuple13_Context5,
    Tuple14_Context5,
    Tuple15_Context5
  ], ZTuple15[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6,
    Tuple11_Context6,
    Tuple12_Context6,
    Tuple13_Context6,
    Tuple14_Context6,
    Tuple15_Context6
  ]] {
    override def application(context: T): F[
      ZTuple15[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1,
        Tuple11_Context1,
        Tuple12_Context1,
        Tuple13_Context1,
        Tuple14_Context1,
        Tuple15_Context1
      ],
      ZTuple15[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2,
        Tuple11_Context2,
        Tuple12_Context2,
        Tuple13_Context2,
        Tuple14_Context2,
        Tuple15_Context2
      ],
      ZTuple15[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3,
        Tuple11_Context3,
        Tuple12_Context3,
        Tuple13_Context3,
        Tuple14_Context3,
        Tuple15_Context3
      ],
      ZTuple15[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4,
        Tuple11_Context4,
        Tuple12_Context4,
        Tuple13_Context4,
        Tuple14_Context4,
        Tuple15_Context4
      ],
      ZTuple15[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        Tuple5_Context5,
        Tuple6_Context5,
        Tuple7_Context5,
        Tuple8_Context5,
        Tuple9_Context5,
        Tuple10_Context5,
        Tuple11_Context5,
        Tuple12_Context5,
        Tuple13_Context5,
        Tuple14_Context5,
        Tuple15_Context5
      ],
      ZTuple15[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6,
        Tuple5_Context6,
        Tuple6_Context6,
        Tuple7_Context6,
        Tuple8_Context6,
        Tuple9_Context6,
        Tuple10_Context6,
        Tuple11_Context6,
        Tuple12_Context6,
        Tuple13_Context6,
        Tuple14_Context6,
        Tuple15_Context6
      ]
    ] = {
      context.append(
        context.append(
          context.append(
            context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum6))(
              zsg.PlusInstanceZsgTuple2.contextNum6
            ),
            context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum6))(
              zsg.PlusInstanceZsgTuple2.contextNum6
            )
          )(zsg.PlusInstanceZsgTuple2.contextNum6),
          context.append(
            context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum6))(
              zsg.PlusInstanceZsgTuple2.contextNum6
            ),
            context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum6)
          )(zsg.PlusInstanceZsgTuple2.contextNum6)
        )(zsg.PlusInstanceZsgTuple2.contextNum6),
        t15
      )(PlusInstanceTuple15.contextNum6)
    }
  }
  implicit def contextNum7[F[_, _, _, _, _, _, _], T <: Context7[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple11_Context1, Tuple12_Context1, Tuple13_Context1, Tuple14_Context1, Tuple15_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple11_Context2, Tuple12_Context2, Tuple13_Context2, Tuple14_Context2, Tuple15_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple11_Context3, Tuple12_Context3, Tuple13_Context3, Tuple14_Context3, Tuple15_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple11_Context4, Tuple12_Context4, Tuple13_Context4, Tuple14_Context4, Tuple15_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, Tuple6_Context5, Tuple7_Context5, Tuple8_Context5, Tuple9_Context5, Tuple10_Context5, Tuple11_Context5, Tuple12_Context5, Tuple13_Context5, Tuple14_Context5, Tuple15_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, Tuple6_Context6, Tuple7_Context6, Tuple8_Context6, Tuple9_Context6, Tuple10_Context6, Tuple11_Context6, Tuple12_Context6, Tuple13_Context6, Tuple14_Context6, Tuple15_Context6, Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, Tuple6_Context7, Tuple7_Context7, Tuple8_Context7, Tuple9_Context7, Tuple10_Context7, Tuple11_Context7, Tuple12_Context7, Tuple13_Context7, Tuple14_Context7, Tuple15_Context7](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6,
      Tuple1_Context7
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4,
      Tuple2_Context5,
      Tuple2_Context6,
      Tuple2_Context7
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4,
      Tuple3_Context5,
      Tuple3_Context6,
      Tuple3_Context7
    ],
    t4: F[
      Tuple4_Context1,
      Tuple4_Context2,
      Tuple4_Context3,
      Tuple4_Context4,
      Tuple4_Context5,
      Tuple4_Context6,
      Tuple4_Context7
    ],
    t5: F[
      Tuple5_Context1,
      Tuple5_Context2,
      Tuple5_Context3,
      Tuple5_Context4,
      Tuple5_Context5,
      Tuple5_Context6,
      Tuple5_Context7
    ],
    t6: F[
      Tuple6_Context1,
      Tuple6_Context2,
      Tuple6_Context3,
      Tuple6_Context4,
      Tuple6_Context5,
      Tuple6_Context6,
      Tuple6_Context7
    ],
    t7: F[
      Tuple7_Context1,
      Tuple7_Context2,
      Tuple7_Context3,
      Tuple7_Context4,
      Tuple7_Context5,
      Tuple7_Context6,
      Tuple7_Context7
    ],
    t8: F[
      Tuple8_Context1,
      Tuple8_Context2,
      Tuple8_Context3,
      Tuple8_Context4,
      Tuple8_Context5,
      Tuple8_Context6,
      Tuple8_Context7
    ],
    t9: F[
      Tuple9_Context1,
      Tuple9_Context2,
      Tuple9_Context3,
      Tuple9_Context4,
      Tuple9_Context5,
      Tuple9_Context6,
      Tuple9_Context7
    ],
    t10: F[
      Tuple10_Context1,
      Tuple10_Context2,
      Tuple10_Context3,
      Tuple10_Context4,
      Tuple10_Context5,
      Tuple10_Context6,
      Tuple10_Context7
    ],
    t11: F[
      Tuple11_Context1,
      Tuple11_Context2,
      Tuple11_Context3,
      Tuple11_Context4,
      Tuple11_Context5,
      Tuple11_Context6,
      Tuple11_Context7
    ],
    t12: F[
      Tuple12_Context1,
      Tuple12_Context2,
      Tuple12_Context3,
      Tuple12_Context4,
      Tuple12_Context5,
      Tuple12_Context6,
      Tuple12_Context7
    ],
    t13: F[
      Tuple13_Context1,
      Tuple13_Context2,
      Tuple13_Context3,
      Tuple13_Context4,
      Tuple13_Context5,
      Tuple13_Context6,
      Tuple13_Context7
    ],
    t14: F[
      Tuple14_Context1,
      Tuple14_Context2,
      Tuple14_Context3,
      Tuple14_Context4,
      Tuple14_Context5,
      Tuple14_Context6,
      Tuple14_Context7
    ],
    t15: F[
      Tuple15_Context1,
      Tuple15_Context2,
      Tuple15_Context3,
      Tuple15_Context4,
      Tuple15_Context5,
      Tuple15_Context6,
      Tuple15_Context7
    ]
  ): ApplicationX7[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ], ZTuple15[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5,
    Tuple11_Context5,
    Tuple12_Context5,
    Tuple13_Context5,
    Tuple14_Context5,
    Tuple15_Context5
  ], ZTuple15[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6,
    Tuple11_Context6,
    Tuple12_Context6,
    Tuple13_Context6,
    Tuple14_Context6,
    Tuple15_Context6
  ], ZTuple15[
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple6_Context7,
    Tuple7_Context7,
    Tuple8_Context7,
    Tuple9_Context7,
    Tuple10_Context7,
    Tuple11_Context7,
    Tuple12_Context7,
    Tuple13_Context7,
    Tuple14_Context7,
    Tuple15_Context7
  ]] = new ApplicationX7[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ], ZTuple15[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5,
    Tuple11_Context5,
    Tuple12_Context5,
    Tuple13_Context5,
    Tuple14_Context5,
    Tuple15_Context5
  ], ZTuple15[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6,
    Tuple11_Context6,
    Tuple12_Context6,
    Tuple13_Context6,
    Tuple14_Context6,
    Tuple15_Context6
  ], ZTuple15[
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple6_Context7,
    Tuple7_Context7,
    Tuple8_Context7,
    Tuple9_Context7,
    Tuple10_Context7,
    Tuple11_Context7,
    Tuple12_Context7,
    Tuple13_Context7,
    Tuple14_Context7,
    Tuple15_Context7
  ]] {
    override def application(context: T): F[
      ZTuple15[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1,
        Tuple11_Context1,
        Tuple12_Context1,
        Tuple13_Context1,
        Tuple14_Context1,
        Tuple15_Context1
      ],
      ZTuple15[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2,
        Tuple11_Context2,
        Tuple12_Context2,
        Tuple13_Context2,
        Tuple14_Context2,
        Tuple15_Context2
      ],
      ZTuple15[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3,
        Tuple11_Context3,
        Tuple12_Context3,
        Tuple13_Context3,
        Tuple14_Context3,
        Tuple15_Context3
      ],
      ZTuple15[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4,
        Tuple11_Context4,
        Tuple12_Context4,
        Tuple13_Context4,
        Tuple14_Context4,
        Tuple15_Context4
      ],
      ZTuple15[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        Tuple5_Context5,
        Tuple6_Context5,
        Tuple7_Context5,
        Tuple8_Context5,
        Tuple9_Context5,
        Tuple10_Context5,
        Tuple11_Context5,
        Tuple12_Context5,
        Tuple13_Context5,
        Tuple14_Context5,
        Tuple15_Context5
      ],
      ZTuple15[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6,
        Tuple5_Context6,
        Tuple6_Context6,
        Tuple7_Context6,
        Tuple8_Context6,
        Tuple9_Context6,
        Tuple10_Context6,
        Tuple11_Context6,
        Tuple12_Context6,
        Tuple13_Context6,
        Tuple14_Context6,
        Tuple15_Context6
      ],
      ZTuple15[
        Tuple1_Context7,
        Tuple2_Context7,
        Tuple3_Context7,
        Tuple4_Context7,
        Tuple5_Context7,
        Tuple6_Context7,
        Tuple7_Context7,
        Tuple8_Context7,
        Tuple9_Context7,
        Tuple10_Context7,
        Tuple11_Context7,
        Tuple12_Context7,
        Tuple13_Context7,
        Tuple14_Context7,
        Tuple15_Context7
      ]
    ] = {
      context.append(
        context.append(
          context.append(
            context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum7))(
              zsg.PlusInstanceZsgTuple2.contextNum7
            ),
            context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum7))(
              zsg.PlusInstanceZsgTuple2.contextNum7
            )
          )(zsg.PlusInstanceZsgTuple2.contextNum7),
          context.append(
            context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum7))(
              zsg.PlusInstanceZsgTuple2.contextNum7
            ),
            context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum7)
          )(zsg.PlusInstanceZsgTuple2.contextNum7)
        )(zsg.PlusInstanceZsgTuple2.contextNum7),
        t15
      )(PlusInstanceTuple15.contextNum7)
    }
  }
  implicit def contextNum8[F[_, _, _, _, _, _, _, _], T <: Context8[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple11_Context1, Tuple12_Context1, Tuple13_Context1, Tuple14_Context1, Tuple15_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple11_Context2, Tuple12_Context2, Tuple13_Context2, Tuple14_Context2, Tuple15_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple11_Context3, Tuple12_Context3, Tuple13_Context3, Tuple14_Context3, Tuple15_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple11_Context4, Tuple12_Context4, Tuple13_Context4, Tuple14_Context4, Tuple15_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, Tuple6_Context5, Tuple7_Context5, Tuple8_Context5, Tuple9_Context5, Tuple10_Context5, Tuple11_Context5, Tuple12_Context5, Tuple13_Context5, Tuple14_Context5, Tuple15_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, Tuple6_Context6, Tuple7_Context6, Tuple8_Context6, Tuple9_Context6, Tuple10_Context6, Tuple11_Context6, Tuple12_Context6, Tuple13_Context6, Tuple14_Context6, Tuple15_Context6, Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, Tuple6_Context7, Tuple7_Context7, Tuple8_Context7, Tuple9_Context7, Tuple10_Context7, Tuple11_Context7, Tuple12_Context7, Tuple13_Context7, Tuple14_Context7, Tuple15_Context7, Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, Tuple6_Context8, Tuple7_Context8, Tuple8_Context8, Tuple9_Context8, Tuple10_Context8, Tuple11_Context8, Tuple12_Context8, Tuple13_Context8, Tuple14_Context8, Tuple15_Context8](
    implicit
    t1: F[
      Tuple1_Context1,
      Tuple1_Context2,
      Tuple1_Context3,
      Tuple1_Context4,
      Tuple1_Context5,
      Tuple1_Context6,
      Tuple1_Context7,
      Tuple1_Context8
    ],
    t2: F[
      Tuple2_Context1,
      Tuple2_Context2,
      Tuple2_Context3,
      Tuple2_Context4,
      Tuple2_Context5,
      Tuple2_Context6,
      Tuple2_Context7,
      Tuple2_Context8
    ],
    t3: F[
      Tuple3_Context1,
      Tuple3_Context2,
      Tuple3_Context3,
      Tuple3_Context4,
      Tuple3_Context5,
      Tuple3_Context6,
      Tuple3_Context7,
      Tuple3_Context8
    ],
    t4: F[
      Tuple4_Context1,
      Tuple4_Context2,
      Tuple4_Context3,
      Tuple4_Context4,
      Tuple4_Context5,
      Tuple4_Context6,
      Tuple4_Context7,
      Tuple4_Context8
    ],
    t5: F[
      Tuple5_Context1,
      Tuple5_Context2,
      Tuple5_Context3,
      Tuple5_Context4,
      Tuple5_Context5,
      Tuple5_Context6,
      Tuple5_Context7,
      Tuple5_Context8
    ],
    t6: F[
      Tuple6_Context1,
      Tuple6_Context2,
      Tuple6_Context3,
      Tuple6_Context4,
      Tuple6_Context5,
      Tuple6_Context6,
      Tuple6_Context7,
      Tuple6_Context8
    ],
    t7: F[
      Tuple7_Context1,
      Tuple7_Context2,
      Tuple7_Context3,
      Tuple7_Context4,
      Tuple7_Context5,
      Tuple7_Context6,
      Tuple7_Context7,
      Tuple7_Context8
    ],
    t8: F[
      Tuple8_Context1,
      Tuple8_Context2,
      Tuple8_Context3,
      Tuple8_Context4,
      Tuple8_Context5,
      Tuple8_Context6,
      Tuple8_Context7,
      Tuple8_Context8
    ],
    t9: F[
      Tuple9_Context1,
      Tuple9_Context2,
      Tuple9_Context3,
      Tuple9_Context4,
      Tuple9_Context5,
      Tuple9_Context6,
      Tuple9_Context7,
      Tuple9_Context8
    ],
    t10: F[
      Tuple10_Context1,
      Tuple10_Context2,
      Tuple10_Context3,
      Tuple10_Context4,
      Tuple10_Context5,
      Tuple10_Context6,
      Tuple10_Context7,
      Tuple10_Context8
    ],
    t11: F[
      Tuple11_Context1,
      Tuple11_Context2,
      Tuple11_Context3,
      Tuple11_Context4,
      Tuple11_Context5,
      Tuple11_Context6,
      Tuple11_Context7,
      Tuple11_Context8
    ],
    t12: F[
      Tuple12_Context1,
      Tuple12_Context2,
      Tuple12_Context3,
      Tuple12_Context4,
      Tuple12_Context5,
      Tuple12_Context6,
      Tuple12_Context7,
      Tuple12_Context8
    ],
    t13: F[
      Tuple13_Context1,
      Tuple13_Context2,
      Tuple13_Context3,
      Tuple13_Context4,
      Tuple13_Context5,
      Tuple13_Context6,
      Tuple13_Context7,
      Tuple13_Context8
    ],
    t14: F[
      Tuple14_Context1,
      Tuple14_Context2,
      Tuple14_Context3,
      Tuple14_Context4,
      Tuple14_Context5,
      Tuple14_Context6,
      Tuple14_Context7,
      Tuple14_Context8
    ],
    t15: F[
      Tuple15_Context1,
      Tuple15_Context2,
      Tuple15_Context3,
      Tuple15_Context4,
      Tuple15_Context5,
      Tuple15_Context6,
      Tuple15_Context7,
      Tuple15_Context8
    ]
  ): ApplicationX8[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ], ZTuple15[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5,
    Tuple11_Context5,
    Tuple12_Context5,
    Tuple13_Context5,
    Tuple14_Context5,
    Tuple15_Context5
  ], ZTuple15[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6,
    Tuple11_Context6,
    Tuple12_Context6,
    Tuple13_Context6,
    Tuple14_Context6,
    Tuple15_Context6
  ], ZTuple15[
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple6_Context7,
    Tuple7_Context7,
    Tuple8_Context7,
    Tuple9_Context7,
    Tuple10_Context7,
    Tuple11_Context7,
    Tuple12_Context7,
    Tuple13_Context7,
    Tuple14_Context7,
    Tuple15_Context7
  ], ZTuple15[
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    Tuple5_Context8,
    Tuple6_Context8,
    Tuple7_Context8,
    Tuple8_Context8,
    Tuple9_Context8,
    Tuple10_Context8,
    Tuple11_Context8,
    Tuple12_Context8,
    Tuple13_Context8,
    Tuple14_Context8,
    Tuple15_Context8
  ]] = new ApplicationX8[F, T, ZTuple15[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1,
    Tuple11_Context1,
    Tuple12_Context1,
    Tuple13_Context1,
    Tuple14_Context1,
    Tuple15_Context1
  ], ZTuple15[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2,
    Tuple11_Context2,
    Tuple12_Context2,
    Tuple13_Context2,
    Tuple14_Context2,
    Tuple15_Context2
  ], ZTuple15[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3,
    Tuple11_Context3,
    Tuple12_Context3,
    Tuple13_Context3,
    Tuple14_Context3,
    Tuple15_Context3
  ], ZTuple15[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4,
    Tuple11_Context4,
    Tuple12_Context4,
    Tuple13_Context4,
    Tuple14_Context4,
    Tuple15_Context4
  ], ZTuple15[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5,
    Tuple11_Context5,
    Tuple12_Context5,
    Tuple13_Context5,
    Tuple14_Context5,
    Tuple15_Context5
  ], ZTuple15[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6,
    Tuple11_Context6,
    Tuple12_Context6,
    Tuple13_Context6,
    Tuple14_Context6,
    Tuple15_Context6
  ], ZTuple15[
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple6_Context7,
    Tuple7_Context7,
    Tuple8_Context7,
    Tuple9_Context7,
    Tuple10_Context7,
    Tuple11_Context7,
    Tuple12_Context7,
    Tuple13_Context7,
    Tuple14_Context7,
    Tuple15_Context7
  ], ZTuple15[
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    Tuple5_Context8,
    Tuple6_Context8,
    Tuple7_Context8,
    Tuple8_Context8,
    Tuple9_Context8,
    Tuple10_Context8,
    Tuple11_Context8,
    Tuple12_Context8,
    Tuple13_Context8,
    Tuple14_Context8,
    Tuple15_Context8
  ]] {
    override def application(context: T): F[
      ZTuple15[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1,
        Tuple11_Context1,
        Tuple12_Context1,
        Tuple13_Context1,
        Tuple14_Context1,
        Tuple15_Context1
      ],
      ZTuple15[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2,
        Tuple11_Context2,
        Tuple12_Context2,
        Tuple13_Context2,
        Tuple14_Context2,
        Tuple15_Context2
      ],
      ZTuple15[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3,
        Tuple11_Context3,
        Tuple12_Context3,
        Tuple13_Context3,
        Tuple14_Context3,
        Tuple15_Context3
      ],
      ZTuple15[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4,
        Tuple11_Context4,
        Tuple12_Context4,
        Tuple13_Context4,
        Tuple14_Context4,
        Tuple15_Context4
      ],
      ZTuple15[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        Tuple5_Context5,
        Tuple6_Context5,
        Tuple7_Context5,
        Tuple8_Context5,
        Tuple9_Context5,
        Tuple10_Context5,
        Tuple11_Context5,
        Tuple12_Context5,
        Tuple13_Context5,
        Tuple14_Context5,
        Tuple15_Context5
      ],
      ZTuple15[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6,
        Tuple5_Context6,
        Tuple6_Context6,
        Tuple7_Context6,
        Tuple8_Context6,
        Tuple9_Context6,
        Tuple10_Context6,
        Tuple11_Context6,
        Tuple12_Context6,
        Tuple13_Context6,
        Tuple14_Context6,
        Tuple15_Context6
      ],
      ZTuple15[
        Tuple1_Context7,
        Tuple2_Context7,
        Tuple3_Context7,
        Tuple4_Context7,
        Tuple5_Context7,
        Tuple6_Context7,
        Tuple7_Context7,
        Tuple8_Context7,
        Tuple9_Context7,
        Tuple10_Context7,
        Tuple11_Context7,
        Tuple12_Context7,
        Tuple13_Context7,
        Tuple14_Context7,
        Tuple15_Context7
      ],
      ZTuple15[
        Tuple1_Context8,
        Tuple2_Context8,
        Tuple3_Context8,
        Tuple4_Context8,
        Tuple5_Context8,
        Tuple6_Context8,
        Tuple7_Context8,
        Tuple8_Context8,
        Tuple9_Context8,
        Tuple10_Context8,
        Tuple11_Context8,
        Tuple12_Context8,
        Tuple13_Context8,
        Tuple14_Context8,
        Tuple15_Context8
      ]
    ] = {
      context.append(
        context.append(
          context.append(
            context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum8))(
              zsg.PlusInstanceZsgTuple2.contextNum8
            ),
            context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum8))(
              zsg.PlusInstanceZsgTuple2.contextNum8
            )
          )(zsg.PlusInstanceZsgTuple2.contextNum8),
          context.append(
            context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum8))(
              zsg.PlusInstanceZsgTuple2.contextNum8
            ),
            context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum8)
          )(zsg.PlusInstanceZsgTuple2.contextNum8)
        )(zsg.PlusInstanceZsgTuple2.contextNum8),
        t15
      )(PlusInstanceTuple15.contextNum8)
    }
  }
}
