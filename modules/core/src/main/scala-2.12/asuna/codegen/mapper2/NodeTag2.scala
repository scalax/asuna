package asuna
import debug._
final class NodeTag2[T1 <: TupleTag  , T2 <: TupleTag ] extends TupleTag {
def find1: T1 = throw new Exception("Debuging...")
def find2: T2 = throw new Exception("Debuging...")
def debug[F[_ ]   , X1_C1  , X2_C1  ](c: Context1[F])(implicit
app1: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 1. Please change .debug(context1) to .find1.debug(context1) to continue.`,
F, T1  , X1_C1 ]
, app2: asuna.debug.NodeDebugApplication1[`The implicit not founded property's index is 2. Please change .debug(context1) to .find2.debug(context1) to continue.`,
F , T2  , X2_C1 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum1(app1  , app2 ).application(c)
}
def debug[F[_  , _ ]   , X1_C1  , X2_C1    , X1_C2  , X2_C2  ](c: Context2[F])(implicit
app1: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 1. Please change .debug(context2) to .find1.debug(context2) to continue.`,
F, T1  , X1_C1  , X1_C2 ]
, app2: asuna.debug.NodeDebugApplication2[`The implicit not founded property's index is 2. Please change .debug(context2) to .find2.debug(context2) to continue.`,
F , T2  , X2_C1  , X2_C2 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ]  , AsunaTuple2[X1_C2  , X2_C2 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum2(app1  , app2 ).application(c)
}
def debug[F[_  , _  , _ ]   , X1_C1  , X2_C1    , X1_C2  , X2_C2    , X1_C3  , X2_C3  ](c: Context3[F])(implicit
app1: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 1. Please change .debug(context3) to .find1.debug(context3) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3 ]
, app2: asuna.debug.NodeDebugApplication3[`The implicit not founded property's index is 2. Please change .debug(context3) to .find2.debug(context3) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ]  , AsunaTuple2[X1_C2  , X2_C2 ]  , AsunaTuple2[X1_C3  , X2_C3 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum3(app1  , app2 ).application(c)
}
def debug[F[_  , _  , _  , _ ]   , X1_C1  , X2_C1    , X1_C2  , X2_C2    , X1_C3  , X2_C3    , X1_C4  , X2_C4  ](c: Context4[F])(implicit
app1: asuna.debug.NodeDebugApplication4[`The implicit not founded property's index is 1. Please change .debug(context4) to .find1.debug(context4) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3  , X1_C4 ]
, app2: asuna.debug.NodeDebugApplication4[`The implicit not founded property's index is 2. Please change .debug(context4) to .find2.debug(context4) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3  , X2_C4 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ]  , AsunaTuple2[X1_C2  , X2_C2 ]  , AsunaTuple2[X1_C3  , X2_C3 ]  , AsunaTuple2[X1_C4  , X2_C4 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum4(app1  , app2 ).application(c)
}
def debug[F[_  , _  , _  , _  , _ ]   , X1_C1  , X2_C1    , X1_C2  , X2_C2    , X1_C3  , X2_C3    , X1_C4  , X2_C4    , X1_C5  , X2_C5  ](c: Context5[F])(implicit
app1: asuna.debug.NodeDebugApplication5[`The implicit not founded property's index is 1. Please change .debug(context5) to .find1.debug(context5) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5 ]
, app2: asuna.debug.NodeDebugApplication5[`The implicit not founded property's index is 2. Please change .debug(context5) to .find2.debug(context5) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ]  , AsunaTuple2[X1_C2  , X2_C2 ]  , AsunaTuple2[X1_C3  , X2_C3 ]  , AsunaTuple2[X1_C4  , X2_C4 ]  , AsunaTuple2[X1_C5  , X2_C5 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum5(app1  , app2 ).application(c)
}
def debug[F[_  , _  , _  , _  , _  , _ ]   , X1_C1  , X2_C1    , X1_C2  , X2_C2    , X1_C3  , X2_C3    , X1_C4  , X2_C4    , X1_C5  , X2_C5    , X1_C6  , X2_C6  ](c: Context6[F])(implicit
app1: asuna.debug.NodeDebugApplication6[`The implicit not founded property's index is 1. Please change .debug(context6) to .find1.debug(context6) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6 ]
, app2: asuna.debug.NodeDebugApplication6[`The implicit not founded property's index is 2. Please change .debug(context6) to .find2.debug(context6) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ]  , AsunaTuple2[X1_C2  , X2_C2 ]  , AsunaTuple2[X1_C3  , X2_C3 ]  , AsunaTuple2[X1_C4  , X2_C4 ]  , AsunaTuple2[X1_C5  , X2_C5 ]  , AsunaTuple2[X1_C6  , X2_C6 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum6(app1  , app2 ).application(c)
}
def debug[F[_  , _  , _  , _  , _  , _  , _ ]   , X1_C1  , X2_C1    , X1_C2  , X2_C2    , X1_C3  , X2_C3    , X1_C4  , X2_C4    , X1_C5  , X2_C5    , X1_C6  , X2_C6    , X1_C7  , X2_C7  ](c: Context7[F])(implicit
app1: asuna.debug.NodeDebugApplication7[`The implicit not founded property's index is 1. Please change .debug(context7) to .find1.debug(context7) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7 ]
, app2: asuna.debug.NodeDebugApplication7[`The implicit not founded property's index is 2. Please change .debug(context7) to .find2.debug(context7) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ]  , AsunaTuple2[X1_C2  , X2_C2 ]  , AsunaTuple2[X1_C3  , X2_C3 ]  , AsunaTuple2[X1_C4  , X2_C4 ]  , AsunaTuple2[X1_C5  , X2_C5 ]  , AsunaTuple2[X1_C6  , X2_C6 ]  , AsunaTuple2[X1_C7  , X2_C7 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum7(app1  , app2 ).application(c)
}
def debug[F[_  , _  , _  , _  , _  , _  , _  , _ ]   , X1_C1  , X2_C1    , X1_C2  , X2_C2    , X1_C3  , X2_C3    , X1_C4  , X2_C4    , X1_C5  , X2_C5    , X1_C6  , X2_C6    , X1_C7  , X2_C7    , X1_C8  , X2_C8  ](c: Context8[F])(implicit
app1: asuna.debug.NodeDebugApplication8[`The implicit not founded property's index is 1. Please change .debug(context8) to .find1.debug(context8) to continue.`,
F, T1  , X1_C1  , X1_C2  , X1_C3  , X1_C4  , X1_C5  , X1_C6  , X1_C7  , X1_C8 ]
, app2: asuna.debug.NodeDebugApplication8[`The implicit not founded property's index is 2. Please change .debug(context8) to .find2.debug(context8) to continue.`,
F , T2  , X2_C1  , X2_C2  , X2_C3  , X2_C4  , X2_C5  , X2_C6  , X2_C7  , X2_C8 ] ):
F[AsunaTuple2[X1_C1  , X2_C1 ]  , AsunaTuple2[X1_C2  , X2_C2 ]  , AsunaTuple2[X1_C3  , X2_C3 ]  , AsunaTuple2[X1_C4  , X2_C4 ]  , AsunaTuple2[X1_C5  , X2_C5 ]  , AsunaTuple2[X1_C6  , X2_C6 ]  , AsunaTuple2[X1_C7  , X2_C7 ]  , AsunaTuple2[X1_C8  , X2_C8 ] ] = {
NodeTag2.noteTagApplicationImplicit_tagNum2_typeParamNum8(app1  , app2 ).application(c)
}
}
final object NodeTag2 extends support.NodeTag2ApplicationCompanion
