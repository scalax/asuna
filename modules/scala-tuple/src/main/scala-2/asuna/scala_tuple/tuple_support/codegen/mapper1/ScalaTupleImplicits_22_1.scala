package asuna.scala_tuple.tuple_support
import asuna.Application1
import asuna.Context1
import scala.language.higherKinds
trait ScalaTupleImplicits_22_1 {
         implicit def  tupleTagApplicationImplicit_tagNum22_typeParamNum1[
            F[_],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22
        ]( implicit 
        t1: F[Plus1_X1] , t2: F[Plus1_X2] , t3: F[Plus1_X3] , t4: F[Plus1_X4] , t5: F[Plus1_X5] , t6: F[Plus1_X6] , t7: F[Plus1_X7] , t8: F[Plus1_X8] , t9: F[Plus1_X9] , t10: F[Plus1_X10] , t11: F[Plus1_X11] , t12: F[Plus1_X12] , t13: F[Plus1_X13] , t14: F[Plus1_X14] , t15: F[Plus1_X15] , t16: F[Plus1_X16] , t17: F[Plus1_X17] , t18: F[Plus1_X18] , t19: F[Plus1_X19] , t20: F[Plus1_X20] , t21: F[Plus1_X21] , t22: F[Plus1_X22])  :  Application1[
            F,
            Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22]
        ] = new Application1[
            F,
            Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22]
        ] {
            override def application(context: Context1[F]): F[
                Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22]
            ] = {
                val implicitApplication = implicitly[Application1[F, asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X1 , Plus1_X2] , asuna.ZsgTuple2[Plus1_X3 , Plus1_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X5 , Plus1_X6] , asuna.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X9 , Plus1_X10] , asuna.ZsgTuple2[Plus1_X11 , Plus1_X12]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X13 , Plus1_X14] , asuna.ZsgTuple2[Plus1_X15 , Plus1_X16]]]] , asuna.NodeTuple1[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X17 , Plus1_X18] , asuna.ZsgTuple2[Plus1_X19 , Plus1_X20]] , asuna.NodeTuple1[asuna.ZsgTuple2[Plus1_X21 , Plus1_X22]]]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple1.plus1WithTypeParameter22)
            }
        }
}
object ScalaTupleImplicits_22_1 extends ScalaTupleImplicits_22_1
