package zsg
import scala.language.higherKinds
class ZNode3[  I1 <: zsg.TupleTag   ,  I2 <: zsg.TupleTag   ,  I3 <: zsg.TupleTag ](  val i1: I1   ,  val i2: I2   ,  val i3: I3 ) extends zsg.TupleTag
object ZNode3 {
             inline given   [F[  _ ], T <: Context1[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX1[F, T
                , Tuple1_Context1
        ]
         ,   inline  t2: ApplicationX1[F, T
                , Tuple2_Context1
        ]
         ,   inline  t3: ApplicationX1[F, T
                , Tuple3_Context1
        ]
            )  as   ApplicationX1[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
]  = new  ApplicationX1[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
]   {
                override def application(context: T):  F[
         ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
]  = {
                    context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum1), t3.application(context))(PlusInstanceTuple3.nodeContextNum1)
                }
            }
             inline given   [F[  _   ,  _ ], T <: Context2[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX2[F, T
                , Tuple1_Context1
                , Tuple1_Context2
        ]
         ,   inline  t2: ApplicationX2[F, T
                , Tuple2_Context1
                , Tuple2_Context2
        ]
         ,   inline  t3: ApplicationX2[F, T
                , Tuple3_Context1
                , Tuple3_Context2
        ]
            )  as   ApplicationX2[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
]  = new  ApplicationX2[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
]   {
                override def application(context: T):  F[
         ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
         ,  ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
]  = {
                    context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum2), t3.application(context))(PlusInstanceTuple3.nodeContextNum2)
                }
            }
             inline given   [F[  _   ,  _   ,  _ ], T <: Context3[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX3[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
        ]
         ,   inline  t2: ApplicationX3[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
        ]
         ,   inline  t3: ApplicationX3[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
        ]
            )  as   ApplicationX3[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
]  = new  ApplicationX3[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
]   {
                override def application(context: T):  F[
         ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
         ,  ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
         ,  ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
]  = {
                    context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum3), t3.application(context))(PlusInstanceTuple3.nodeContextNum3)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: Context4[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX4[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
        ]
         ,   inline  t2: ApplicationX4[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
        ]
         ,   inline  t3: ApplicationX4[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
        ]
            )  as   ApplicationX4[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
]  = new  ApplicationX4[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
]   {
                override def application(context: T):  F[
         ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
         ,  ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
         ,  ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
         ,  ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
]  = {
                    context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum4), t3.application(context))(PlusInstanceTuple3.nodeContextNum4)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context5[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX5[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
        ]
         ,   inline  t2: ApplicationX5[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
        ]
         ,   inline  t3: ApplicationX5[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
        ]
            )  as   ApplicationX5[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
        , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
]  = new  ApplicationX5[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
        , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
]   {
                override def application(context: T):  F[
         ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
         ,  ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
         ,  ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
         ,  ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
         ,  ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
]  = {
                    context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum5), t3.application(context))(PlusInstanceTuple3.nodeContextNum5)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context6[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX6[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
        ]
         ,   inline  t2: ApplicationX6[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
        ]
         ,   inline  t3: ApplicationX6[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
        ]
            )  as   ApplicationX6[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
        , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
        , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
]  = new  ApplicationX6[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
        , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
        , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
]   {
                override def application(context: T):  F[
         ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
         ,  ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
         ,  ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
         ,  ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
         ,  ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
         ,  ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
]  = {
                    context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum6), t3.application(context))(PlusInstanceTuple3.nodeContextNum6)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context7[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag 
         , Tuple1_Context7 <: TupleTag  , Tuple2_Context7 <: TupleTag  , Tuple3_Context7 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX7[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
                , Tuple1_Context7
        ]
         ,   inline  t2: ApplicationX7[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
                , Tuple2_Context7
        ]
         ,   inline  t3: ApplicationX7[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
                , Tuple3_Context7
        ]
            )  as   ApplicationX7[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
        , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
        , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
        , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7 ]
]  = new  ApplicationX7[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
        , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
        , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
        , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7 ]
]   {
                override def application(context: T):  F[
         ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
         ,  ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
         ,  ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
         ,  ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
         ,  ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
         ,  ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
         ,  ZNode3[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7 ]
]  = {
                    context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum7), t3.application(context))(PlusInstanceTuple3.nodeContextNum7)
                }
            }
             inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: Context8[F]
         , Tuple1_Context1 <: TupleTag  , Tuple2_Context1 <: TupleTag  , Tuple3_Context1 <: TupleTag 
         , Tuple1_Context2 <: TupleTag  , Tuple2_Context2 <: TupleTag  , Tuple3_Context2 <: TupleTag 
         , Tuple1_Context3 <: TupleTag  , Tuple2_Context3 <: TupleTag  , Tuple3_Context3 <: TupleTag 
         , Tuple1_Context4 <: TupleTag  , Tuple2_Context4 <: TupleTag  , Tuple3_Context4 <: TupleTag 
         , Tuple1_Context5 <: TupleTag  , Tuple2_Context5 <: TupleTag  , Tuple3_Context5 <: TupleTag 
         , Tuple1_Context6 <: TupleTag  , Tuple2_Context6 <: TupleTag  , Tuple3_Context6 <: TupleTag 
         , Tuple1_Context7 <: TupleTag  , Tuple2_Context7 <: TupleTag  , Tuple3_Context7 <: TupleTag 
         , Tuple1_Context8 <: TupleTag  , Tuple2_Context8 <: TupleTag  , Tuple3_Context8 <: TupleTag 
]   (
                 using  
          inline  t1: ApplicationX8[F, T
                , Tuple1_Context1
                , Tuple1_Context2
                , Tuple1_Context3
                , Tuple1_Context4
                , Tuple1_Context5
                , Tuple1_Context6
                , Tuple1_Context7
                , Tuple1_Context8
        ]
         ,   inline  t2: ApplicationX8[F, T
                , Tuple2_Context1
                , Tuple2_Context2
                , Tuple2_Context3
                , Tuple2_Context4
                , Tuple2_Context5
                , Tuple2_Context6
                , Tuple2_Context7
                , Tuple2_Context8
        ]
         ,   inline  t3: ApplicationX8[F, T
                , Tuple3_Context1
                , Tuple3_Context2
                , Tuple3_Context3
                , Tuple3_Context4
                , Tuple3_Context5
                , Tuple3_Context6
                , Tuple3_Context7
                , Tuple3_Context8
        ]
            )  as   ApplicationX8[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
        , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
        , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
        , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7 ]
        , ZNode3[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8 ]
]  = new  ApplicationX8[F, T
        , ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
        , ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
        , ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
        , ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
        , ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
        , ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
        , ZNode3[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7 ]
        , ZNode3[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8 ]
]   {
                override def application(context: T):  F[
         ZNode3[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1 ]
         ,  ZNode3[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2 ]
         ,  ZNode3[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3 ]
         ,  ZNode3[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4 ]
         ,  ZNode3[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5 ]
         ,  ZNode3[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6 ]
         ,  ZNode3[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7 ]
         ,  ZNode3[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8 ]
]  = {
                    context.append(context.append(t1.application(context), t2.application(context))(zsg.PlusInstanceZsgTuple2.contextNum8), t3.application(context))(PlusInstanceTuple3.nodeContextNum8)
                }
            }
}
