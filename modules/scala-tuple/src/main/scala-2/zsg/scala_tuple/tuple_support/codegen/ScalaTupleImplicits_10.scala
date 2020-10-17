package zsg.scala_tuple.tuple_support
import scala.language.higherKinds
trait ScalaTupleImplicits_10 {
  implicit def contextNum_1_10[F[_], T <: zsg.Context1[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1](
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
    ]
  ): zsg.ApplicationX1[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ]] = new zsg.ApplicationX1[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ]] {
    override def application(context: T): F[
      Tuple10[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1
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
          t9
        )(zsg.PlusInstanceZsgTuple2.contextNum1),
        t10
      )(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_10.contextNum1)
    }
  }
  implicit def contextNum_2_10[F[_, _], T <: zsg.Context2[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2](
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
    ]
  ): zsg.ApplicationX2[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ]] = new zsg.ApplicationX2[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ]] {
    override def application(context: T): F[
      Tuple10[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1
      ],
      Tuple10[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2
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
          t9
        )(zsg.PlusInstanceZsgTuple2.contextNum2),
        t10
      )(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_10.contextNum2)
    }
  }
  implicit def contextNum_3_10[F[_, _, _], T <: zsg.Context3[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3](
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
    ]
  ): zsg.ApplicationX3[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ]] = new zsg.ApplicationX3[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ]] {
    override def application(context: T): F[
      Tuple10[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1
      ],
      Tuple10[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2
      ],
      Tuple10[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3
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
          t9
        )(zsg.PlusInstanceZsgTuple2.contextNum3),
        t10
      )(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_10.contextNum3)
    }
  }
  implicit def contextNum_4_10[F[_, _, _, _], T <: zsg.Context4[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4](
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
    ]
  ): zsg.ApplicationX4[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ]] = new zsg.ApplicationX4[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ]] {
    override def application(context: T): F[
      Tuple10[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1
      ],
      Tuple10[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2
      ],
      Tuple10[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3
      ],
      Tuple10[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4
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
          t9
        )(zsg.PlusInstanceZsgTuple2.contextNum4),
        t10
      )(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_10.contextNum4)
    }
  }
  implicit def contextNum_5_10[F[_, _, _, _, _], T <: zsg.Context5[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, Tuple6_Context5, Tuple7_Context5, Tuple8_Context5, Tuple9_Context5, Tuple10_Context5](
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
    ]
  ): zsg.ApplicationX5[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ], Tuple10[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5
  ]] = new zsg.ApplicationX5[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ], Tuple10[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5
  ]] {
    override def application(context: T): F[
      Tuple10[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1
      ],
      Tuple10[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2
      ],
      Tuple10[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3
      ],
      Tuple10[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4
      ],
      Tuple10[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        Tuple5_Context5,
        Tuple6_Context5,
        Tuple7_Context5,
        Tuple8_Context5,
        Tuple9_Context5,
        Tuple10_Context5
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
          t9
        )(zsg.PlusInstanceZsgTuple2.contextNum5),
        t10
      )(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_10.contextNum5)
    }
  }
  implicit def contextNum_6_10[F[_, _, _, _, _, _], T <: zsg.Context6[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, Tuple6_Context5, Tuple7_Context5, Tuple8_Context5, Tuple9_Context5, Tuple10_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, Tuple6_Context6, Tuple7_Context6, Tuple8_Context6, Tuple9_Context6, Tuple10_Context6](
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
    ]
  ): zsg.ApplicationX6[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ], Tuple10[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5
  ], Tuple10[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6
  ]] = new zsg.ApplicationX6[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ], Tuple10[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5
  ], Tuple10[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6
  ]] {
    override def application(context: T): F[
      Tuple10[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1
      ],
      Tuple10[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2
      ],
      Tuple10[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3
      ],
      Tuple10[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4
      ],
      Tuple10[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        Tuple5_Context5,
        Tuple6_Context5,
        Tuple7_Context5,
        Tuple8_Context5,
        Tuple9_Context5,
        Tuple10_Context5
      ],
      Tuple10[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6,
        Tuple5_Context6,
        Tuple6_Context6,
        Tuple7_Context6,
        Tuple8_Context6,
        Tuple9_Context6,
        Tuple10_Context6
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
          t9
        )(zsg.PlusInstanceZsgTuple2.contextNum6),
        t10
      )(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_10.contextNum6)
    }
  }
  implicit def contextNum_7_10[F[_, _, _, _, _, _, _], T <: zsg.Context7[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, Tuple6_Context5, Tuple7_Context5, Tuple8_Context5, Tuple9_Context5, Tuple10_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, Tuple6_Context6, Tuple7_Context6, Tuple8_Context6, Tuple9_Context6, Tuple10_Context6, Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, Tuple6_Context7, Tuple7_Context7, Tuple8_Context7, Tuple9_Context7, Tuple10_Context7](
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
    ]
  ): zsg.ApplicationX7[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ], Tuple10[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5
  ], Tuple10[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6
  ], Tuple10[
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple6_Context7,
    Tuple7_Context7,
    Tuple8_Context7,
    Tuple9_Context7,
    Tuple10_Context7
  ]] = new zsg.ApplicationX7[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ], Tuple10[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5
  ], Tuple10[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6
  ], Tuple10[
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple6_Context7,
    Tuple7_Context7,
    Tuple8_Context7,
    Tuple9_Context7,
    Tuple10_Context7
  ]] {
    override def application(context: T): F[
      Tuple10[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1
      ],
      Tuple10[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2
      ],
      Tuple10[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3
      ],
      Tuple10[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4
      ],
      Tuple10[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        Tuple5_Context5,
        Tuple6_Context5,
        Tuple7_Context5,
        Tuple8_Context5,
        Tuple9_Context5,
        Tuple10_Context5
      ],
      Tuple10[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6,
        Tuple5_Context6,
        Tuple6_Context6,
        Tuple7_Context6,
        Tuple8_Context6,
        Tuple9_Context6,
        Tuple10_Context6
      ],
      Tuple10[
        Tuple1_Context7,
        Tuple2_Context7,
        Tuple3_Context7,
        Tuple4_Context7,
        Tuple5_Context7,
        Tuple6_Context7,
        Tuple7_Context7,
        Tuple8_Context7,
        Tuple9_Context7,
        Tuple10_Context7
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
          t9
        )(zsg.PlusInstanceZsgTuple2.contextNum7),
        t10
      )(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_10.contextNum7)
    }
  }
  implicit def contextNum_8_10[F[_, _, _, _, _, _, _, _], T <: zsg.Context8[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple5_Context1, Tuple6_Context1, Tuple7_Context1, Tuple8_Context1, Tuple9_Context1, Tuple10_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple5_Context2, Tuple6_Context2, Tuple7_Context2, Tuple8_Context2, Tuple9_Context2, Tuple10_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple5_Context3, Tuple6_Context3, Tuple7_Context3, Tuple8_Context3, Tuple9_Context3, Tuple10_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple5_Context4, Tuple6_Context4, Tuple7_Context4, Tuple8_Context4, Tuple9_Context4, Tuple10_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple5_Context5, Tuple6_Context5, Tuple7_Context5, Tuple8_Context5, Tuple9_Context5, Tuple10_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple5_Context6, Tuple6_Context6, Tuple7_Context6, Tuple8_Context6, Tuple9_Context6, Tuple10_Context6, Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple5_Context7, Tuple6_Context7, Tuple7_Context7, Tuple8_Context7, Tuple9_Context7, Tuple10_Context7, Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8, Tuple5_Context8, Tuple6_Context8, Tuple7_Context8, Tuple8_Context8, Tuple9_Context8, Tuple10_Context8](
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
    ]
  ): zsg.ApplicationX8[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ], Tuple10[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5
  ], Tuple10[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6
  ], Tuple10[
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple6_Context7,
    Tuple7_Context7,
    Tuple8_Context7,
    Tuple9_Context7,
    Tuple10_Context7
  ], Tuple10[
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    Tuple5_Context8,
    Tuple6_Context8,
    Tuple7_Context8,
    Tuple8_Context8,
    Tuple9_Context8,
    Tuple10_Context8
  ]] = new zsg.ApplicationX8[F, T, Tuple10[
    Tuple1_Context1,
    Tuple2_Context1,
    Tuple3_Context1,
    Tuple4_Context1,
    Tuple5_Context1,
    Tuple6_Context1,
    Tuple7_Context1,
    Tuple8_Context1,
    Tuple9_Context1,
    Tuple10_Context1
  ], Tuple10[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2,
    Tuple5_Context2,
    Tuple6_Context2,
    Tuple7_Context2,
    Tuple8_Context2,
    Tuple9_Context2,
    Tuple10_Context2
  ], Tuple10[
    Tuple1_Context3,
    Tuple2_Context3,
    Tuple3_Context3,
    Tuple4_Context3,
    Tuple5_Context3,
    Tuple6_Context3,
    Tuple7_Context3,
    Tuple8_Context3,
    Tuple9_Context3,
    Tuple10_Context3
  ], Tuple10[
    Tuple1_Context4,
    Tuple2_Context4,
    Tuple3_Context4,
    Tuple4_Context4,
    Tuple5_Context4,
    Tuple6_Context4,
    Tuple7_Context4,
    Tuple8_Context4,
    Tuple9_Context4,
    Tuple10_Context4
  ], Tuple10[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5,
    Tuple5_Context5,
    Tuple6_Context5,
    Tuple7_Context5,
    Tuple8_Context5,
    Tuple9_Context5,
    Tuple10_Context5
  ], Tuple10[
    Tuple1_Context6,
    Tuple2_Context6,
    Tuple3_Context6,
    Tuple4_Context6,
    Tuple5_Context6,
    Tuple6_Context6,
    Tuple7_Context6,
    Tuple8_Context6,
    Tuple9_Context6,
    Tuple10_Context6
  ], Tuple10[
    Tuple1_Context7,
    Tuple2_Context7,
    Tuple3_Context7,
    Tuple4_Context7,
    Tuple5_Context7,
    Tuple6_Context7,
    Tuple7_Context7,
    Tuple8_Context7,
    Tuple9_Context7,
    Tuple10_Context7
  ], Tuple10[
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8,
    Tuple5_Context8,
    Tuple6_Context8,
    Tuple7_Context8,
    Tuple8_Context8,
    Tuple9_Context8,
    Tuple10_Context8
  ]] {
    override def application(context: T): F[
      Tuple10[
        Tuple1_Context1,
        Tuple2_Context1,
        Tuple3_Context1,
        Tuple4_Context1,
        Tuple5_Context1,
        Tuple6_Context1,
        Tuple7_Context1,
        Tuple8_Context1,
        Tuple9_Context1,
        Tuple10_Context1
      ],
      Tuple10[
        Tuple1_Context2,
        Tuple2_Context2,
        Tuple3_Context2,
        Tuple4_Context2,
        Tuple5_Context2,
        Tuple6_Context2,
        Tuple7_Context2,
        Tuple8_Context2,
        Tuple9_Context2,
        Tuple10_Context2
      ],
      Tuple10[
        Tuple1_Context3,
        Tuple2_Context3,
        Tuple3_Context3,
        Tuple4_Context3,
        Tuple5_Context3,
        Tuple6_Context3,
        Tuple7_Context3,
        Tuple8_Context3,
        Tuple9_Context3,
        Tuple10_Context3
      ],
      Tuple10[
        Tuple1_Context4,
        Tuple2_Context4,
        Tuple3_Context4,
        Tuple4_Context4,
        Tuple5_Context4,
        Tuple6_Context4,
        Tuple7_Context4,
        Tuple8_Context4,
        Tuple9_Context4,
        Tuple10_Context4
      ],
      Tuple10[
        Tuple1_Context5,
        Tuple2_Context5,
        Tuple3_Context5,
        Tuple4_Context5,
        Tuple5_Context5,
        Tuple6_Context5,
        Tuple7_Context5,
        Tuple8_Context5,
        Tuple9_Context5,
        Tuple10_Context5
      ],
      Tuple10[
        Tuple1_Context6,
        Tuple2_Context6,
        Tuple3_Context6,
        Tuple4_Context6,
        Tuple5_Context6,
        Tuple6_Context6,
        Tuple7_Context6,
        Tuple8_Context6,
        Tuple9_Context6,
        Tuple10_Context6
      ],
      Tuple10[
        Tuple1_Context7,
        Tuple2_Context7,
        Tuple3_Context7,
        Tuple4_Context7,
        Tuple5_Context7,
        Tuple6_Context7,
        Tuple7_Context7,
        Tuple8_Context7,
        Tuple9_Context7,
        Tuple10_Context7
      ],
      Tuple10[
        Tuple1_Context8,
        Tuple2_Context8,
        Tuple3_Context8,
        Tuple4_Context8,
        Tuple5_Context8,
        Tuple6_Context8,
        Tuple7_Context8,
        Tuple8_Context8,
        Tuple9_Context8,
        Tuple10_Context8
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
          t9
        )(zsg.PlusInstanceZsgTuple2.contextNum8),
        t10
      )(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_10.contextNum8)
    }
  }
}
