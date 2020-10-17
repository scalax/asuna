package zsg
import scala.language.higherKinds
class ZTuple4[I1, I2, I3, I4](val i1: I1, val i2: I2, val i3: I3, val i4: I4) extends zsg.TupleTag
object ZTuple4 {
  implicit def contextNum1[F[_], T <: Context1[F], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1](implicit
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
    ]
  ): ApplicationX1[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1]] =
    new ApplicationX1[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1]] {
      override def application(context: T): F[
        ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1]
      ] = {
        context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum1), t3)(zsg.PlusInstanceZsgTuple2.contextNum1), t4)(
          PlusInstanceTuple4.contextNum1
        )
      }
    }
  implicit def contextNum2[F[_, _], T <: Context2[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2](implicit
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
    ]
  ): ApplicationX2[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], ZTuple4[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2
  ]] = new ApplicationX2[
    F,
    T,
    ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
    ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2]
  ] {
    override def application(context: T): F[
      ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2]
    ] = {
      context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum2), t3)(zsg.PlusInstanceZsgTuple2.contextNum2), t4)(
        PlusInstanceTuple4.contextNum2
      )
    }
  }
  implicit def contextNum3[F[_, _, _], T <: Context3[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3](
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
    ]
  ): ApplicationX3[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], ZTuple4[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2
  ], ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3]] = new ApplicationX3[
    F,
    T,
    ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
    ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
    ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3]
  ] {
    override def application(context: T): F[
      ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3]
    ] = {
      context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum3), t3)(zsg.PlusInstanceZsgTuple2.contextNum3), t4)(
        PlusInstanceTuple4.contextNum3
      )
    }
  }
  implicit def contextNum4[F[_, _, _, _], T <: Context4[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4](
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
    ]
  ): ApplicationX4[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], ZTuple4[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2
  ], ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4]] =
    new ApplicationX4[
      F,
      T,
      ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4]
    ] {
      override def application(context: T): F[
        ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
        ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
        ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
        ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4]
      ] = {
        context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum4), t3)(zsg.PlusInstanceZsgTuple2.contextNum4), t4)(
          PlusInstanceTuple4.contextNum4
        )
      }
    }
  implicit def contextNum5[F[_, _, _, _, _], T <: Context5[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5](
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
    ]
  ): ApplicationX5[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], ZTuple4[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2
  ], ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4], ZTuple4[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5
  ]] = new ApplicationX5[
    F,
    T,
    ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
    ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
    ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
    ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
    ZTuple4[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5]
  ] {
    override def application(context: T): F[
      ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      ZTuple4[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5]
    ] = {
      context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum5), t3)(zsg.PlusInstanceZsgTuple2.contextNum5), t4)(
        PlusInstanceTuple4.contextNum5
      )
    }
  }
  implicit def contextNum6[F[_, _, _, _, _, _], T <: Context6[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6](
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
    ]
  ): ApplicationX6[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], ZTuple4[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2
  ], ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4], ZTuple4[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5
  ], ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6]] = new ApplicationX6[
    F,
    T,
    ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
    ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
    ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
    ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
    ZTuple4[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
    ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6]
  ] {
    override def application(context: T): F[
      ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      ZTuple4[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
      ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6]
    ] = {
      context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum6), t3)(zsg.PlusInstanceZsgTuple2.contextNum6), t4)(
        PlusInstanceTuple4.contextNum6
      )
    }
  }
  implicit def contextNum7[F[_, _, _, _, _, _, _], T <: Context7[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7](
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
    ]
  ): ApplicationX7[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], ZTuple4[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2
  ], ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4], ZTuple4[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5
  ], ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6], ZTuple4[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7]] =
    new ApplicationX7[
      F,
      T,
      ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      ZTuple4[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
      ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6],
      ZTuple4[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7]
    ] {
      override def application(context: T): F[
        ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
        ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
        ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
        ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
        ZTuple4[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
        ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6],
        ZTuple4[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7]
      ] = {
        context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum7), t3)(zsg.PlusInstanceZsgTuple2.contextNum7), t4)(
          PlusInstanceTuple4.contextNum7
        )
      }
    }
  implicit def contextNum8[F[_, _, _, _, _, _, _, _], T <: Context8[
    F
  ], Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1, Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2, Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3, Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4, Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5, Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6, Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7, Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8](
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
    ]
  ): ApplicationX8[F, T, ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1], ZTuple4[
    Tuple1_Context2,
    Tuple2_Context2,
    Tuple3_Context2,
    Tuple4_Context2
  ], ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3], ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4], ZTuple4[
    Tuple1_Context5,
    Tuple2_Context5,
    Tuple3_Context5,
    Tuple4_Context5
  ], ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6], ZTuple4[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7], ZTuple4[
    Tuple1_Context8,
    Tuple2_Context8,
    Tuple3_Context8,
    Tuple4_Context8
  ]] = new ApplicationX8[
    F,
    T,
    ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
    ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
    ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
    ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
    ZTuple4[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
    ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6],
    ZTuple4[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7],
    ZTuple4[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8]
  ] {
    override def application(context: T): F[
      ZTuple4[Tuple1_Context1, Tuple2_Context1, Tuple3_Context1, Tuple4_Context1],
      ZTuple4[Tuple1_Context2, Tuple2_Context2, Tuple3_Context2, Tuple4_Context2],
      ZTuple4[Tuple1_Context3, Tuple2_Context3, Tuple3_Context3, Tuple4_Context3],
      ZTuple4[Tuple1_Context4, Tuple2_Context4, Tuple3_Context4, Tuple4_Context4],
      ZTuple4[Tuple1_Context5, Tuple2_Context5, Tuple3_Context5, Tuple4_Context5],
      ZTuple4[Tuple1_Context6, Tuple2_Context6, Tuple3_Context6, Tuple4_Context6],
      ZTuple4[Tuple1_Context7, Tuple2_Context7, Tuple3_Context7, Tuple4_Context7],
      ZTuple4[Tuple1_Context8, Tuple2_Context8, Tuple3_Context8, Tuple4_Context8]
    ] = {
      context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum8), t3)(zsg.PlusInstanceZsgTuple2.contextNum8), t4)(
        PlusInstanceTuple4.contextNum8
      )
    }
  }
}
