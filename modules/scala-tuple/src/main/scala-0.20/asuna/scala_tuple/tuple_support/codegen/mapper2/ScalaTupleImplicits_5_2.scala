package asuna.scala_tuple.tuple_support
import asuna.Application2
import asuna.Context2
import scala.language.higherKinds
trait ScalaTupleImplicits_5_2 {
given tupleTagApplicationImplicit_tagNum5_typeParamNum2[
F[_  , _ ]
, H1  , H2  , H3  , H4  , H5
, X1_C1  , X1_C2
, X2_C1  , X2_C2
, X3_C1  , X3_C2
, X4_C1  , X4_C2
, X5_C1  , X5_C2
](given t1: Application2[F, H1  , X1_C1  , X1_C2 ]
, t2: Application2[F, H2  , X2_C1  , X2_C2 ]  , t3: Application2[F, H3  , X3_C1  , X3_C2 ]  , t4: Application2[F, H4  , X4_C1  , X4_C2 ]  , t5: Application2[F, H5  , X5_C1  , X5_C2 ] )
: Application2[
F,
(H1  , H2  , H3  , H4  , H5 )  , (X1_C1  , X2_C1  , X3_C1  , X4_C1  , X5_C1 )  , (X1_C2  , X2_C2  , X3_C2  , X4_C2  , X5_C2 ) ] =
{ (context: Context2[F]) =>
context.append(
context.append(
context.append(
context.append(t5.application(context), t4.application(context))(HListPlus2.plusWithTypeParameter1)
, t3.application(context))(HListPlus2.plusWithTypeParameter2)
, t2.application(context))(HListPlus2.plusWithTypeParameter3)
, t1.application(context))(PlusToTuple2.plusWithTypeParameter4)
}
}