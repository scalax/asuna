package zsg
import scala.language.higherKinds
abstract class Context1[F[_]] {
  def append[
    X1,
    Y1,
    Z1
  ](
    x: F[X1],
    y: F[Y1]
  )(
    p: Plus1[
      X1,
      Y1,
      Z1
    ]
  ): F[Z1]
}
