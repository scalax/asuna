package asuna.scala_tuple.tuple_support
import asuna.Application3
import asuna.Context3
import asuna.AppendTag
import asuna.BuildTag
import scala.language.higherKinds
trait ScalaTupleImplicits_22_3 {
         given  tupleTagApplicationImplicit_tagNum22_typeParamNum3[
            F[_ , _ , _],
            Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19 , Tag20 , Tag21 , Tag22,
            Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22,
            Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21 , Plus2_X22,
            Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21 , Plus3_X22
        ]( given 
        t1: Application3[F, Tag1, Plus1_X1 , Plus2_X1 , Plus3_X1] , t2: Application3[F, Tag2, Plus1_X2 , Plus2_X2 , Plus3_X2] , t3: Application3[F, Tag3, Plus1_X3 , Plus2_X3 , Plus3_X3] , t4: Application3[F, Tag4, Plus1_X4 , Plus2_X4 , Plus3_X4] , t5: Application3[F, Tag5, Plus1_X5 , Plus2_X5 , Plus3_X5] , t6: Application3[F, Tag6, Plus1_X6 , Plus2_X6 , Plus3_X6] , t7: Application3[F, Tag7, Plus1_X7 , Plus2_X7 , Plus3_X7] , t8: Application3[F, Tag8, Plus1_X8 , Plus2_X8 , Plus3_X8] , t9: Application3[F, Tag9, Plus1_X9 , Plus2_X9 , Plus3_X9] , t10: Application3[F, Tag10, Plus1_X10 , Plus2_X10 , Plus3_X10] , t11: Application3[F, Tag11, Plus1_X11 , Plus2_X11 , Plus3_X11] , t12: Application3[F, Tag12, Plus1_X12 , Plus2_X12 , Plus3_X12] , t13: Application3[F, Tag13, Plus1_X13 , Plus2_X13 , Plus3_X13] , t14: Application3[F, Tag14, Plus1_X14 , Plus2_X14 , Plus3_X14] , t15: Application3[F, Tag15, Plus1_X15 , Plus2_X15 , Plus3_X15] , t16: Application3[F, Tag16, Plus1_X16 , Plus2_X16 , Plus3_X16] , t17: Application3[F, Tag17, Plus1_X17 , Plus2_X17 , Plus3_X17] , t18: Application3[F, Tag18, Plus1_X18 , Plus2_X18 , Plus3_X18] , t19: Application3[F, Tag19, Plus1_X19 , Plus2_X19 , Plus3_X19] , t20: Application3[F, Tag20, Plus1_X20 , Plus2_X20 , Plus3_X20] , t21: Application3[F, Tag21, Plus1_X21 , Plus2_X21 , Plus3_X21] , t22: Application3[F, Tag22, Plus1_X22 , Plus2_X22 , Plus3_X22]): Application3[
            F,
            Tuple22[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19 , Tag20 , Tag21 , Tag22],
            Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22],
            Tuple22[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21 , Plus2_X22],
            Tuple22[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21 , Plus3_X22]
        ] = new Application3[
            F,
            Tuple22[Tag1 , Tag2 , Tag3 , Tag4 , Tag5 , Tag6 , Tag7 , Tag8 , Tag9 , Tag10 , Tag11 , Tag12 , Tag13 , Tag14 , Tag15 , Tag16 , Tag17 , Tag18 , Tag19 , Tag20 , Tag21 , Tag22],
            Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22],
            Tuple22[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21 , Plus2_X22],
            Tuple22[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21 , Plus3_X22]
        ] {
            override def application(context: Context3[F]): F[
                Tuple22[Plus1_X1 , Plus1_X2 , Plus1_X3 , Plus1_X4 , Plus1_X5 , Plus1_X6 , Plus1_X7 , Plus1_X8 , Plus1_X9 , Plus1_X10 , Plus1_X11 , Plus1_X12 , Plus1_X13 , Plus1_X14 , Plus1_X15 , Plus1_X16 , Plus1_X17 , Plus1_X18 , Plus1_X19 , Plus1_X20 , Plus1_X21 , Plus1_X22],
                Tuple22[Plus2_X1 , Plus2_X2 , Plus2_X3 , Plus2_X4 , Plus2_X5 , Plus2_X6 , Plus2_X7 , Plus2_X8 , Plus2_X9 , Plus2_X10 , Plus2_X11 , Plus2_X12 , Plus2_X13 , Plus2_X14 , Plus2_X15 , Plus2_X16 , Plus2_X17 , Plus2_X18 , Plus2_X19 , Plus2_X20 , Plus2_X21 , Plus2_X22],
                Tuple22[Plus3_X1 , Plus3_X2 , Plus3_X3 , Plus3_X4 , Plus3_X5 , Plus3_X6 , Plus3_X7 , Plus3_X8 , Plus3_X9 , Plus3_X10 , Plus3_X11 , Plus3_X12 , Plus3_X13 , Plus3_X14 , Plus3_X15 , Plus3_X16 , Plus3_X17 , Plus3_X18 , Plus3_X19 , Plus3_X20 , Plus3_X21 , Plus3_X22]
            ] = {
                val asunaTuple2F = Application3.lift(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag1] , AppendTag[Tag2]) , BuildTag.tag(AppendTag[Tag3] , AppendTag[Tag4])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag5] , AppendTag[Tag6]) , BuildTag.tag(AppendTag[Tag7] , AppendTag[Tag8]))) , BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag9] , AppendTag[Tag10]) , BuildTag.tag(AppendTag[Tag11] , AppendTag[Tag12])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag13] , AppendTag[Tag14]) , BuildTag.tag(AppendTag[Tag15] , AppendTag[Tag16])))) , BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag17] , AppendTag[Tag18]) , BuildTag.tag(AppendTag[Tag19] , AppendTag[Tag20])) , BuildTag.nodeTag(BuildTag.tag(AppendTag[Tag21] , AppendTag[Tag22])))))).application(context)
                context.append(asunaTuple2F, context.start)(PlusToTuple3.plus3WithTypeParameter22)
            }
        }
}
object ScalaTupleImplicits_22_3 extends ScalaTupleImplicits_22_3
