package zsg.scala_tuple.tuple_support
import zsg.ApplicationX2
import zsg.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_19_2 {
         implicit def tupleTagApplicationImplicit_tagNum19_typeParamNum2  [
            F[_ , _],
            T <: Context2[F],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19
        ]( implicit 
               t1: F[  Plus1_X1   ,  Plus2_X1 ]   ,   t2: F[  Plus1_X2   ,  Plus2_X2 ]   ,   t3: F[  Plus1_X3   ,  Plus2_X3 ]   ,   t4: F[  Plus1_X4   ,  Plus2_X4 ]   ,   t5: F[  Plus1_X5   ,  Plus2_X5 ]   ,   t6: F[  Plus1_X6   ,  Plus2_X6 ]   ,   t7: F[  Plus1_X7   ,  Plus2_X7 ]   ,   t8: F[  Plus1_X8   ,  Plus2_X8 ]   ,   t9: F[  Plus1_X9   ,  Plus2_X9 ]   ,   t10: F[  Plus1_X10   ,  Plus2_X10 ]   ,   t11: F[  Plus1_X11   ,  Plus2_X11 ]   ,   t12: F[  Plus1_X12   ,  Plus2_X12 ]   ,   t13: F[  Plus1_X13   ,  Plus2_X13 ]   ,   t14: F[  Plus1_X14   ,  Plus2_X14 ]   ,   t15: F[  Plus1_X15   ,  Plus2_X15 ]   ,   t16: F[  Plus1_X16   ,  Plus2_X16 ]   ,   t17: F[  Plus1_X17   ,  Plus2_X17 ]   ,   t18: F[  Plus1_X18   ,  Plus2_X18 ]   ,   t19: F[  Plus1_X19   ,  Plus2_X19 ] 
        )  :  ApplicationX2[
            F,
            T,
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
            Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19]
        ] = new ApplicationX2[
            F,
            T,
            Tuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19],
            Tuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19]
        ] {
            override def application(context: T) = {
                context.append(ApplicationFetchContent.app2[F, T, zsg.ZTuple19[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19] , zsg.ZTuple19[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19]].application(context), context.start)(PlusToTuple2.plus2WithTypeParameter19)
            }
        }
}
object ScalaTupleImplicits_19_2 extends ScalaTupleImplicits_19_2
