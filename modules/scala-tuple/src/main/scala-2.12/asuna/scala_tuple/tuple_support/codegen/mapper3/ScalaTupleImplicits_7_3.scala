package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_7_3 {
         implicit def  tupleTagApplicationImplicit_tagNum7_typeParamNum3[
            F[_ , _ , _],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7
        ]( implicit 
        t1: Application3[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: Application3[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: Application3[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3] , t4: Application3[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4] , t5: Application3[F, Tag5, Plus1_X5 , Plus2_X5 , Plus3_X5] , t6: Application3[F, Tag6, Plus1_X6 , Plus2_X6 , Plus3_X6] , t7: Application3[F, Tag7, Plus1_X7 , Plus2_X7 , Plus3_X7]): Application3[
            F,
            Tuple7[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7],
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
            Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7]
        ] = new Application3[
            F,
            Tuple7[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7],
            Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
            Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
            Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7]
        ] {
            override def application(context: Context3[F]): F[
                Tuple7[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7],
                Tuple7[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7],
                Tuple7[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7]
            ] = {
                val asunaTuple2F = Application3.lift(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , BuildTag.tag(AppendTag[Tag7])))).application(context)
                context.append(asunaTuple2F, context.start)(PlusToTuple3.plus3WithTypeParameter7)
            }
        }
}
object ScalaTupleImplicits_7_3 extends ScalaTupleImplicits_7_3
