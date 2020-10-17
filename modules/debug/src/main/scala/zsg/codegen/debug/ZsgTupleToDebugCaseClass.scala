package zsg.debug
import scala.annotation.implicitNotFound
@implicitNotFound(
  msg = "\nYou receive this message perhaps your case class have more than 64 fields.\n  Change\n" +
    "DebugInstance.fromTuple(content).infer\n" +
    "  to\n" +
    "DebugInstance.fromTuple(content.i1).infer\n" +
    "DebugInstance.fromTuple(content.i2).infer\n" +
    "  if it's field's count is between 65 and 128.\n" +
    "  Change it to\n" +
    "DebugInstance.fromTuple(content.i1.i1).infer\n" +
    "DebugInstance.fromTuple(content.i1.i2).infer\n" +
    "DebugInstance.fromTuple(content.i2.i1).infer\n" +
    "  if it's field's count is between 129 and 196\n" +
    "  Change it to\n" +
    "DebugInstance.fromTuple(content.i1.i1).infer\n" +
    "DebugInstance.fromTuple(content.i1.i2).infer\n" +
    "DebugInstance.fromTuple(content.i2.i1).infer\n" +
    "DebugInstance.fromTuple(content.i2.i2).infer\n" +
    "  if it's field's count is between 197 and 253"
)
trait ZsgTupleToDebugCaseClass[T, C] {
  def tupleToCaseClass(tuple: T): C
}
object ZsgTupleToDebugCaseClass
    extends DebugCaseClass2Instance
    with DebugCaseClass3Instance
    with DebugCaseClass4Instance
    with DebugCaseClass5Instance
    with DebugCaseClass6Instance
    with DebugCaseClass7Instance
    with DebugCaseClass8Instance
    with DebugCaseClass9Instance
    with DebugCaseClass10Instance
    with DebugCaseClass11Instance
    with DebugCaseClass12Instance
    with DebugCaseClass13Instance
    with DebugCaseClass14Instance
    with DebugCaseClass15Instance
    with DebugCaseClass16Instance
    with DebugCaseClass17Instance
    with DebugCaseClass18Instance
    with DebugCaseClass19Instance
    with DebugCaseClass20Instance
    with DebugCaseClass21Instance
    with DebugCaseClass22Instance
