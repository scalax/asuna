package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_12_2 {
         implicit def  tupleTagApplicationImplicit_tagNum12_typeParamNum2[
            F[_ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12
        ]( implicit 
        t1: F[Plus1_X1 , Plus2_X1] , t2: F[Plus1_X2 , Plus2_X2] , t3: F[Plus1_X3 , Plus2_X3] , t4: F[Plus1_X4 , Plus2_X4] , t5: F[Plus1_X5 , Plus2_X5] , t6: F[Plus1_X6 , Plus2_X6] , t7: F[Plus1_X7 , Plus2_X7] , t8: F[Plus1_X8 , Plus2_X8] , t9: F[Plus1_X9 , Plus2_X9] , t10: F[Plus1_X10 , Plus2_X10] , t11: F[Plus1_X11 , Plus2_X11] , t12: F[Plus1_X12 , Plus2_X12])  :  Application2[
            F,
            Tuple12[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12],
            Tuple12[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12]
        ] = new Application2[
            F,
            Tuple12[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12],
            Tuple12[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12]
        ] {
            override def application(context: Context2[F]): F[
                Tuple12[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12],
                Tuple12[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12]
            ] = {
                val implicitApplication = implicitly[Application2[F, asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X1 , Plus1_X2] , asuna.ZsgTuple2[Plus1_X3 , Plus1_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X5 , Plus1_X6] , asuna.ZsgTuple2[Plus1_X7 , Plus1_X8]]] , asuna.NodeTuple1[asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X9 , Plus1_X10] , asuna.ZsgTuple2[Plus1_X11 , Plus1_X12]]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X1 , Plus2_X2] , asuna.ZsgTuple2[Plus2_X3 , Plus2_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X5 , Plus2_X6] , asuna.ZsgTuple2[Plus2_X7 , Plus2_X8]]] , asuna.NodeTuple1[asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X9 , Plus2_X10] , asuna.ZsgTuple2[Plus2_X11 , Plus2_X12]]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple2.plus2WithTypeParameter12)
            }
        }
}
object ScalaTupleImplicits_12_2 extends ScalaTupleImplicits_12_2
