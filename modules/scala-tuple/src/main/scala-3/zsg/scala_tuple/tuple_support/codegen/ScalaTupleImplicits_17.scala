package zsg.scala_tuple.tuple_support
import scala.language.higherKinds
trait ScalaTupleImplicits_17 {
         inline given   [F[  _ ], T <: zsg.Context1[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1 
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
         ,   inline  t5: F[
                 Tuple5_Context1
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
        ]
        )  as   zsg.ApplicationX1[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
]  = new  zsg.ApplicationX1[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
]   {
            override def application(context: T):  F[
         Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum1), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1))(zsg.PlusInstanceZsgTuple2.contextNum1), t17)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_17.contextNum1)
            }
        }
         inline given   [F[  _   ,  _ ], T <: zsg.Context2[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2 
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
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
        ]
        )  as   zsg.ApplicationX2[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
]  = new  zsg.ApplicationX2[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
]   {
            override def application(context: T):  F[
         Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
         ,  Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum2), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2))(zsg.PlusInstanceZsgTuple2.contextNum2), t17)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_17.contextNum2)
            }
        }
         inline given   [F[  _   ,  _   ,  _ ], T <: zsg.Context3[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3 
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
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
        ]
        )  as   zsg.ApplicationX3[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
]  = new  zsg.ApplicationX3[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
]   {
            override def application(context: T):  F[
         Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
         ,  Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
         ,  Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum3), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3))(zsg.PlusInstanceZsgTuple2.contextNum3), t17)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_17.contextNum3)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _ ], T <: zsg.Context4[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4 
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
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
        ]
        )  as   zsg.ApplicationX4[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
]  = new  zsg.ApplicationX4[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
]   {
            override def application(context: T):  F[
         Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
         ,  Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
         ,  Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
         ,  Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum4), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4))(zsg.PlusInstanceZsgTuple2.contextNum4), t17)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_17.contextNum4)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context5[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5  , Tuple13_Context5  , Tuple14_Context5  , Tuple15_Context5  , Tuple16_Context5  , Tuple17_Context5 
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
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
                 ,  Tuple13_Context5
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
                 ,  Tuple14_Context5
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
                 ,  Tuple15_Context5
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
                 ,  Tuple16_Context5
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
                 ,  Tuple17_Context5
        ]
        )  as   zsg.ApplicationX5[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
        , Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
]  = new  zsg.ApplicationX5[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
        , Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
]   {
            override def application(context: T):  F[
         Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
         ,  Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
         ,  Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
         ,  Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
         ,  Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum5), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5))(zsg.PlusInstanceZsgTuple2.contextNum5), t17)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_17.contextNum5)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context6[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5  , Tuple13_Context5  , Tuple14_Context5  , Tuple15_Context5  , Tuple16_Context5  , Tuple17_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6  , Tuple13_Context6  , Tuple14_Context6  , Tuple15_Context6  , Tuple16_Context6  , Tuple17_Context6 
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
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
                 ,  Tuple13_Context5
                 ,  Tuple13_Context6
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
                 ,  Tuple14_Context5
                 ,  Tuple14_Context6
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
                 ,  Tuple15_Context5
                 ,  Tuple15_Context6
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
                 ,  Tuple16_Context5
                 ,  Tuple16_Context6
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
                 ,  Tuple17_Context5
                 ,  Tuple17_Context6
        ]
        )  as   zsg.ApplicationX6[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
        , Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
        , Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
]  = new  zsg.ApplicationX6[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
        , Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
        , Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
]   {
            override def application(context: T):  F[
         Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
         ,  Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
         ,  Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
         ,  Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
         ,  Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
         ,  Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum6), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6))(zsg.PlusInstanceZsgTuple2.contextNum6), t17)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_17.contextNum6)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context7[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5  , Tuple13_Context5  , Tuple14_Context5  , Tuple15_Context5  , Tuple16_Context5  , Tuple17_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6  , Tuple13_Context6  , Tuple14_Context6  , Tuple15_Context6  , Tuple16_Context6  , Tuple17_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7  , Tuple13_Context7  , Tuple14_Context7  , Tuple15_Context7  , Tuple16_Context7  , Tuple17_Context7 
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
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
                 ,  Tuple13_Context5
                 ,  Tuple13_Context6
                 ,  Tuple13_Context7
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
                 ,  Tuple14_Context5
                 ,  Tuple14_Context6
                 ,  Tuple14_Context7
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
                 ,  Tuple15_Context5
                 ,  Tuple15_Context6
                 ,  Tuple15_Context7
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
                 ,  Tuple16_Context5
                 ,  Tuple16_Context6
                 ,  Tuple16_Context7
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
                 ,  Tuple17_Context5
                 ,  Tuple17_Context6
                 ,  Tuple17_Context7
        ]
        )  as   zsg.ApplicationX7[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
        , Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
        , Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
        , Tuple17[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7 ]
]  = new  zsg.ApplicationX7[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
        , Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
        , Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
        , Tuple17[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7 ]
]   {
            override def application(context: T):  F[
         Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
         ,  Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
         ,  Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
         ,  Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
         ,  Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
         ,  Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
         ,  Tuple17[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum7), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7))(zsg.PlusInstanceZsgTuple2.contextNum7), t17)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_17.contextNum7)
            }
        }
         inline given   [F[  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _   ,  _ ], T <: zsg.Context8[F]
         , Tuple1_Context1  , Tuple2_Context1  , Tuple3_Context1  , Tuple4_Context1  , Tuple5_Context1  , Tuple6_Context1  , Tuple7_Context1  , Tuple8_Context1  , Tuple9_Context1  , Tuple10_Context1  , Tuple11_Context1  , Tuple12_Context1  , Tuple13_Context1  , Tuple14_Context1  , Tuple15_Context1  , Tuple16_Context1  , Tuple17_Context1 
         , Tuple1_Context2  , Tuple2_Context2  , Tuple3_Context2  , Tuple4_Context2  , Tuple5_Context2  , Tuple6_Context2  , Tuple7_Context2  , Tuple8_Context2  , Tuple9_Context2  , Tuple10_Context2  , Tuple11_Context2  , Tuple12_Context2  , Tuple13_Context2  , Tuple14_Context2  , Tuple15_Context2  , Tuple16_Context2  , Tuple17_Context2 
         , Tuple1_Context3  , Tuple2_Context3  , Tuple3_Context3  , Tuple4_Context3  , Tuple5_Context3  , Tuple6_Context3  , Tuple7_Context3  , Tuple8_Context3  , Tuple9_Context3  , Tuple10_Context3  , Tuple11_Context3  , Tuple12_Context3  , Tuple13_Context3  , Tuple14_Context3  , Tuple15_Context3  , Tuple16_Context3  , Tuple17_Context3 
         , Tuple1_Context4  , Tuple2_Context4  , Tuple3_Context4  , Tuple4_Context4  , Tuple5_Context4  , Tuple6_Context4  , Tuple7_Context4  , Tuple8_Context4  , Tuple9_Context4  , Tuple10_Context4  , Tuple11_Context4  , Tuple12_Context4  , Tuple13_Context4  , Tuple14_Context4  , Tuple15_Context4  , Tuple16_Context4  , Tuple17_Context4 
         , Tuple1_Context5  , Tuple2_Context5  , Tuple3_Context5  , Tuple4_Context5  , Tuple5_Context5  , Tuple6_Context5  , Tuple7_Context5  , Tuple8_Context5  , Tuple9_Context5  , Tuple10_Context5  , Tuple11_Context5  , Tuple12_Context5  , Tuple13_Context5  , Tuple14_Context5  , Tuple15_Context5  , Tuple16_Context5  , Tuple17_Context5 
         , Tuple1_Context6  , Tuple2_Context6  , Tuple3_Context6  , Tuple4_Context6  , Tuple5_Context6  , Tuple6_Context6  , Tuple7_Context6  , Tuple8_Context6  , Tuple9_Context6  , Tuple10_Context6  , Tuple11_Context6  , Tuple12_Context6  , Tuple13_Context6  , Tuple14_Context6  , Tuple15_Context6  , Tuple16_Context6  , Tuple17_Context6 
         , Tuple1_Context7  , Tuple2_Context7  , Tuple3_Context7  , Tuple4_Context7  , Tuple5_Context7  , Tuple6_Context7  , Tuple7_Context7  , Tuple8_Context7  , Tuple9_Context7  , Tuple10_Context7  , Tuple11_Context7  , Tuple12_Context7  , Tuple13_Context7  , Tuple14_Context7  , Tuple15_Context7  , Tuple16_Context7  , Tuple17_Context7 
         , Tuple1_Context8  , Tuple2_Context8  , Tuple3_Context8  , Tuple4_Context8  , Tuple5_Context8  , Tuple6_Context8  , Tuple7_Context8  , Tuple8_Context8  , Tuple9_Context8  , Tuple10_Context8  , Tuple11_Context8  , Tuple12_Context8  , Tuple13_Context8  , Tuple14_Context8  , Tuple15_Context8  , Tuple16_Context8  , Tuple17_Context8 
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
         ,   inline  t5: F[
                 Tuple5_Context1
                 ,  Tuple5_Context2
                 ,  Tuple5_Context3
                 ,  Tuple5_Context4
                 ,  Tuple5_Context5
                 ,  Tuple5_Context6
                 ,  Tuple5_Context7
                 ,  Tuple5_Context8
        ]
         ,   inline  t6: F[
                 Tuple6_Context1
                 ,  Tuple6_Context2
                 ,  Tuple6_Context3
                 ,  Tuple6_Context4
                 ,  Tuple6_Context5
                 ,  Tuple6_Context6
                 ,  Tuple6_Context7
                 ,  Tuple6_Context8
        ]
         ,   inline  t7: F[
                 Tuple7_Context1
                 ,  Tuple7_Context2
                 ,  Tuple7_Context3
                 ,  Tuple7_Context4
                 ,  Tuple7_Context5
                 ,  Tuple7_Context6
                 ,  Tuple7_Context7
                 ,  Tuple7_Context8
        ]
         ,   inline  t8: F[
                 Tuple8_Context1
                 ,  Tuple8_Context2
                 ,  Tuple8_Context3
                 ,  Tuple8_Context4
                 ,  Tuple8_Context5
                 ,  Tuple8_Context6
                 ,  Tuple8_Context7
                 ,  Tuple8_Context8
        ]
         ,   inline  t9: F[
                 Tuple9_Context1
                 ,  Tuple9_Context2
                 ,  Tuple9_Context3
                 ,  Tuple9_Context4
                 ,  Tuple9_Context5
                 ,  Tuple9_Context6
                 ,  Tuple9_Context7
                 ,  Tuple9_Context8
        ]
         ,   inline  t10: F[
                 Tuple10_Context1
                 ,  Tuple10_Context2
                 ,  Tuple10_Context3
                 ,  Tuple10_Context4
                 ,  Tuple10_Context5
                 ,  Tuple10_Context6
                 ,  Tuple10_Context7
                 ,  Tuple10_Context8
        ]
         ,   inline  t11: F[
                 Tuple11_Context1
                 ,  Tuple11_Context2
                 ,  Tuple11_Context3
                 ,  Tuple11_Context4
                 ,  Tuple11_Context5
                 ,  Tuple11_Context6
                 ,  Tuple11_Context7
                 ,  Tuple11_Context8
        ]
         ,   inline  t12: F[
                 Tuple12_Context1
                 ,  Tuple12_Context2
                 ,  Tuple12_Context3
                 ,  Tuple12_Context4
                 ,  Tuple12_Context5
                 ,  Tuple12_Context6
                 ,  Tuple12_Context7
                 ,  Tuple12_Context8
        ]
         ,   inline  t13: F[
                 Tuple13_Context1
                 ,  Tuple13_Context2
                 ,  Tuple13_Context3
                 ,  Tuple13_Context4
                 ,  Tuple13_Context5
                 ,  Tuple13_Context6
                 ,  Tuple13_Context7
                 ,  Tuple13_Context8
        ]
         ,   inline  t14: F[
                 Tuple14_Context1
                 ,  Tuple14_Context2
                 ,  Tuple14_Context3
                 ,  Tuple14_Context4
                 ,  Tuple14_Context5
                 ,  Tuple14_Context6
                 ,  Tuple14_Context7
                 ,  Tuple14_Context8
        ]
         ,   inline  t15: F[
                 Tuple15_Context1
                 ,  Tuple15_Context2
                 ,  Tuple15_Context3
                 ,  Tuple15_Context4
                 ,  Tuple15_Context5
                 ,  Tuple15_Context6
                 ,  Tuple15_Context7
                 ,  Tuple15_Context8
        ]
         ,   inline  t16: F[
                 Tuple16_Context1
                 ,  Tuple16_Context2
                 ,  Tuple16_Context3
                 ,  Tuple16_Context4
                 ,  Tuple16_Context5
                 ,  Tuple16_Context6
                 ,  Tuple16_Context7
                 ,  Tuple16_Context8
        ]
         ,   inline  t17: F[
                 Tuple17_Context1
                 ,  Tuple17_Context2
                 ,  Tuple17_Context3
                 ,  Tuple17_Context4
                 ,  Tuple17_Context5
                 ,  Tuple17_Context6
                 ,  Tuple17_Context7
                 ,  Tuple17_Context8
        ]
        )  as   zsg.ApplicationX8[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
        , Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
        , Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
        , Tuple17[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7 ]
        , Tuple17[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8   ,  Tuple13_Context8   ,  Tuple14_Context8   ,  Tuple15_Context8   ,  Tuple16_Context8   ,  Tuple17_Context8 ]
]  = new  zsg.ApplicationX8[F, T
        , Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
        , Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
        , Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
        , Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
        , Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
        , Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
        , Tuple17[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7 ]
        , Tuple17[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8   ,  Tuple13_Context8   ,  Tuple14_Context8   ,  Tuple15_Context8   ,  Tuple16_Context8   ,  Tuple17_Context8 ]
]   {
            override def application(context: T):  F[
         Tuple17[  Tuple1_Context1   ,  Tuple2_Context1   ,  Tuple3_Context1   ,  Tuple4_Context1   ,  Tuple5_Context1   ,  Tuple6_Context1   ,  Tuple7_Context1   ,  Tuple8_Context1   ,  Tuple9_Context1   ,  Tuple10_Context1   ,  Tuple11_Context1   ,  Tuple12_Context1   ,  Tuple13_Context1   ,  Tuple14_Context1   ,  Tuple15_Context1   ,  Tuple16_Context1   ,  Tuple17_Context1 ]
         ,  Tuple17[  Tuple1_Context2   ,  Tuple2_Context2   ,  Tuple3_Context2   ,  Tuple4_Context2   ,  Tuple5_Context2   ,  Tuple6_Context2   ,  Tuple7_Context2   ,  Tuple8_Context2   ,  Tuple9_Context2   ,  Tuple10_Context2   ,  Tuple11_Context2   ,  Tuple12_Context2   ,  Tuple13_Context2   ,  Tuple14_Context2   ,  Tuple15_Context2   ,  Tuple16_Context2   ,  Tuple17_Context2 ]
         ,  Tuple17[  Tuple1_Context3   ,  Tuple2_Context3   ,  Tuple3_Context3   ,  Tuple4_Context3   ,  Tuple5_Context3   ,  Tuple6_Context3   ,  Tuple7_Context3   ,  Tuple8_Context3   ,  Tuple9_Context3   ,  Tuple10_Context3   ,  Tuple11_Context3   ,  Tuple12_Context3   ,  Tuple13_Context3   ,  Tuple14_Context3   ,  Tuple15_Context3   ,  Tuple16_Context3   ,  Tuple17_Context3 ]
         ,  Tuple17[  Tuple1_Context4   ,  Tuple2_Context4   ,  Tuple3_Context4   ,  Tuple4_Context4   ,  Tuple5_Context4   ,  Tuple6_Context4   ,  Tuple7_Context4   ,  Tuple8_Context4   ,  Tuple9_Context4   ,  Tuple10_Context4   ,  Tuple11_Context4   ,  Tuple12_Context4   ,  Tuple13_Context4   ,  Tuple14_Context4   ,  Tuple15_Context4   ,  Tuple16_Context4   ,  Tuple17_Context4 ]
         ,  Tuple17[  Tuple1_Context5   ,  Tuple2_Context5   ,  Tuple3_Context5   ,  Tuple4_Context5   ,  Tuple5_Context5   ,  Tuple6_Context5   ,  Tuple7_Context5   ,  Tuple8_Context5   ,  Tuple9_Context5   ,  Tuple10_Context5   ,  Tuple11_Context5   ,  Tuple12_Context5   ,  Tuple13_Context5   ,  Tuple14_Context5   ,  Tuple15_Context5   ,  Tuple16_Context5   ,  Tuple17_Context5 ]
         ,  Tuple17[  Tuple1_Context6   ,  Tuple2_Context6   ,  Tuple3_Context6   ,  Tuple4_Context6   ,  Tuple5_Context6   ,  Tuple6_Context6   ,  Tuple7_Context6   ,  Tuple8_Context6   ,  Tuple9_Context6   ,  Tuple10_Context6   ,  Tuple11_Context6   ,  Tuple12_Context6   ,  Tuple13_Context6   ,  Tuple14_Context6   ,  Tuple15_Context6   ,  Tuple16_Context6   ,  Tuple17_Context6 ]
         ,  Tuple17[  Tuple1_Context7   ,  Tuple2_Context7   ,  Tuple3_Context7   ,  Tuple4_Context7   ,  Tuple5_Context7   ,  Tuple6_Context7   ,  Tuple7_Context7   ,  Tuple8_Context7   ,  Tuple9_Context7   ,  Tuple10_Context7   ,  Tuple11_Context7   ,  Tuple12_Context7   ,  Tuple13_Context7   ,  Tuple14_Context7   ,  Tuple15_Context7   ,  Tuple16_Context7   ,  Tuple17_Context7 ]
         ,  Tuple17[  Tuple1_Context8   ,  Tuple2_Context8   ,  Tuple3_Context8   ,  Tuple4_Context8   ,  Tuple5_Context8   ,  Tuple6_Context8   ,  Tuple7_Context8   ,  Tuple8_Context8   ,  Tuple9_Context8   ,  Tuple10_Context8   ,  Tuple11_Context8   ,  Tuple12_Context8   ,  Tuple13_Context8   ,  Tuple14_Context8   ,  Tuple15_Context8   ,  Tuple16_Context8   ,  Tuple17_Context8 ]
]  = {
                context.append(context.append(context.append(context.append(context.append(t1, t2)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t3, t4)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(t5, t6)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t7, t8)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(context.append(t9, t10)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t11, t12)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(context.append(t13, t14)(zsg.PlusInstanceZsgTuple2.contextNum8), context.append(t15, t16)(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8))(zsg.PlusInstanceZsgTuple2.contextNum8), t17)(zsg.scala_tuple.tuple_support.PlusInstanceScalaTuple_17.contextNum8)
            }
        }
}
