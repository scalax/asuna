package zsg.scala_tuple.tuple_support
import zsg.Application5
import zsg.Context5
import scala.language.higherKinds
trait ScalaTupleImplicits_5_5 {
         implicit def  tupleTagApplicationImplicit_tagNum5_typeParamNum5[
            F[_ , _ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5,
            Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5
        ]( implicit 
        t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1 , Plus5_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2 , Plus5_X2] , t3: F[Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3 , Plus5_X3] , t4: F[Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4 , Plus5_X4] , t5: F[Plus1_X5 , Plus2_X5 , Plus3_X5 , Plus4_X5 , Plus5_X5])  :  Application5[
            F,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
            Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5],
            Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5],
            Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5]
        ] = new Application5[
            F,
            Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
            Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
            Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5],
            Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5],
            Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5]
        ] {
            override def application(context: Context5[F]): F[
                Tuple5[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5],
                Tuple5[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5],
                Tuple5[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5],
                Tuple5[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4 , Plus4_X5],
                Tuple5[Plus5_X1 , Plus5_X2 , Plus5_X3 , Plus5_X4 , Plus5_X5]
            ] = {
                val implicitApplication = implicitly[Application5[F, asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X1 , Plus1_X2] , asuna.ZsgTuple2[Plus1_X3 , Plus1_X4]] , asuna.NodeTuple1[asuna.ZsgTuple1[Plus1_X5]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X1 , Plus2_X2] , asuna.ZsgTuple2[Plus2_X3 , Plus2_X4]] , asuna.NodeTuple1[asuna.ZsgTuple1[Plus2_X5]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus3_X1 , Plus3_X2] , asuna.ZsgTuple2[Plus3_X3 , Plus3_X4]] , asuna.NodeTuple1[asuna.ZsgTuple1[Plus3_X5]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus4_X1 , Plus4_X2] , asuna.ZsgTuple2[Plus4_X3 , Plus4_X4]] , asuna.NodeTuple1[asuna.ZsgTuple1[Plus4_X5]]] , asuna.NodeTuple2[asuna.NodeTuple2[asuna.ZsgTuple2[Plus5_X1 , Plus5_X2] , asuna.ZsgTuple2[Plus5_X3 , Plus5_X4]] , asuna.NodeTuple1[asuna.ZsgTuple1[Plus5_X5]]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple5.plus5WithTypeParameter5)
            }
        }
}
object ScalaTupleImplicits_5_5 extends ScalaTupleImplicits_5_5