package zsg
import scala.language.higherKinds
class ZTuple4[  I1   ,  I2   ,  I3   ,  I4 ](  val i1: I1   ,  val i2: I2   ,  val i3: I3   ,  val i4: I4 ) extends zsg.TupleTag
object ZTuple4 {
             inline given   [F[  _ ], T <: Context1[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
        ]
            )  as   ApplicationX1[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
]  = new  ApplicationX1[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
]   {
                override def application(context: T):  F[
         ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
]  = {
                    context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum1), t3)(zsg.PlusInstanceZsgTuple2.contextNum1), t4)(PlusInstanceTuple4.contextNum1)
                }
            }
             inline given   [F[  _   ,  _ ], T <: Context2[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
        ]
            )  as   ApplicationX2[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
]  = new  ApplicationX2[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
]   {
                override def application(context: T):  F[
         ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
         ,  ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
]  = {
                    context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum2), t3)(zsg.PlusInstanceZsgTuple2.contextNum2), t4)(PlusInstanceTuple4.contextNum2)
                }
            }
             inline given   [F[  _   ,  _   ,  _ ], T <: Context3[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
        ]
            )  as   ApplicationX3[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
]  = new  ApplicationX3[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
]   {
                override def application(context: T):  F[
         ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
         ,  ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
         ,  ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
]  = {
                    context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum3), t3)(zsg.PlusInstanceZsgTuple2.contextNum3), t4)(PlusInstanceTuple4.contextNum3)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
        ]
            )  as   ApplicationX4[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
]  = new  ApplicationX4[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
]   {
                override def application(context: T):  F[
         ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
         ,  ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
         ,  ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
         ,  ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
]  = {
                    context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum4), t3)(zsg.PlusInstanceZsgTuple2.contextNum4), t4)(PlusInstanceTuple4.contextNum4)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
        ]
            )  as   ApplicationX5[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
        , ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
]  = new  ApplicationX5[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
        , ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
]   {
                override def application(context: T):  F[
         ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
         ,  ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
         ,  ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
         ,  ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
         ,  ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
]  = {
                    context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum5), t3)(zsg.PlusInstanceZsgTuple2.contextNum5), t4)(PlusInstanceTuple4.contextNum5)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
        ]
            )  as   ApplicationX6[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
        , ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
        , ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
]  = new  ApplicationX6[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
        , ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
        , ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
]   {
                override def application(context: T):  F[
         ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
         ,  ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
         ,  ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
         ,  ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
         ,  ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
         ,  ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
]  = {
                    context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum6), t3)(zsg.PlusInstanceZsgTuple2.contextNum6), t4)(PlusInstanceTuple4.contextNum6)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
        ]
            )  as   ApplicationX7[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
        , ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
        , ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
        , ZTuple4[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7 ]
]  = new  ApplicationX7[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
        , ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
        , ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
        , ZTuple4[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7 ]
]   {
                override def application(context: T):  F[
         ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
         ,  ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
         ,  ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
         ,  ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
         ,  ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
         ,  ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
         ,  ZTuple4[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7 ]
]  = {
                    context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum7), t3)(zsg.PlusInstanceZsgTuple2.contextNum7), t4)(PlusInstanceTuple4.contextNum7)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8 
]   (
                 using  
          inline  t1: F[
                 Tuple1_Context1
                 ,  Tuple1_Context2
                 ,  Tuple1_Context3
                 ,  Tuple1_Context4
                 ,  Tuple1_Context5
                 ,  Tuple1_Context6
                 ,  Tuple1_Context7
                 ,  Tuple1_Context8
        ]
         ,   inline  t2: F[
                 Tuple2_Context1
                 ,  Tuple2_Context2
                 ,  Tuple2_Context3
                 ,  Tuple2_Context4
                 ,  Tuple2_Context5
                 ,  Tuple2_Context6
                 ,  Tuple2_Context7
                 ,  Tuple2_Context8
        ]
         ,   inline  t3: F[
                 Tuple3_Context1
                 ,  Tuple3_Context2
                 ,  Tuple3_Context3
                 ,  Tuple3_Context4
                 ,  Tuple3_Context5
                 ,  Tuple3_Context6
                 ,  Tuple3_Context7
                 ,  Tuple3_Context8
        ]
         ,   inline  t4: F[
                 Tuple4_Context1
                 ,  Tuple4_Context2
                 ,  Tuple4_Context3
                 ,  Tuple4_Context4
                 ,  Tuple4_Context5
                 ,  Tuple4_Context6
                 ,  Tuple4_Context7
                 ,  Tuple4_Context8
        ]
            )  as   ApplicationX8[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
        , ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
        , ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
        , ZTuple4[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7 ]
        , ZTuple4[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8 ]
]  = new  ApplicationX8[F, T
        , ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
        , ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
        , ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
        , ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
        , ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
        , ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
        , ZTuple4[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7 ]
        , ZTuple4[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8 ]
]   {
                override def application(context: T):  F[
         ZTuple4[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1 ]
         ,  ZTuple4[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2 ]
         ,  ZTuple4[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3 ]
         ,  ZTuple4[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4 ]
         ,  ZTuple4[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5 ]
         ,  ZTuple4[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6 ]
         ,  ZTuple4[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7 ]
         ,  ZTuple4[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8 ]
]  = {
                    context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum8), t3)(zsg.PlusInstanceZsgTuple2.contextNum8), t4)(PlusInstanceTuple4.contextNum8)
                }
            }
}
