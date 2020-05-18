package zsg.scala_tuple.tuple_support
import zsg.Application4
import zsg.Context4
import scala.language.higherKinds
trait ScalaTupleImplicits_4_4 {
         given  tupleTagApplicationImplicit_tagNum4_typeParamNum4[
            F[_ , _ , _ , _],
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4,
            Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4
        ]( using 
        t1: F[Plus1_X1 , Plus2_X1 , Plus3_X1 , Plus4_X1] , t2: F[Plus1_X2 , Plus2_X2 , Plus3_X2 , Plus4_X2] , t3: F[Plus1_X3 , Plus2_X3 , Plus3_X3 , Plus4_X3] , t4: F[Plus1_X4 , Plus2_X4 , Plus3_X4 , Plus4_X4])  as  Application4[
            F,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]
        ] = new Application4[
            F,
            Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
            Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
            Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
            Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]
        ] {
            override def application(context: Context4[F]): F[
                Tuple4[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4],
                Tuple4[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4],
                Tuple4[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4],
                Tuple4[Plus4_X1 , Plus4_X2 , Plus4_X3 , Plus4_X4]
            ] = {
                val implicitApplication = implicitly[Application4[F, asuna.NodeTuple2[asuna.ZsgTuple2[Plus1_X1 , Plus1_X2] , asuna.ZsgTuple2[Plus1_X3 , Plus1_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus2_X1 , Plus2_X2] , asuna.ZsgTuple2[Plus2_X3 , Plus2_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus3_X1 , Plus3_X2] , asuna.ZsgTuple2[Plus3_X3 , Plus3_X4]] , asuna.NodeTuple2[asuna.ZsgTuple2[Plus4_X1 , Plus4_X2] , asuna.ZsgTuple2[Plus4_X3 , Plus4_X4]]
                ]]
                context.append(implicitApplication.application(context), context.start)(PlusToTuple4.plus4WithTypeParameter4)
            }
        }
}
object ScalaTupleImplicits_4_4 extends ScalaTupleImplicits_4_4