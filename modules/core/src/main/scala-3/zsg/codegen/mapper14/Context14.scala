package zsg
import scala.language.higherKinds
abstract class Context14[F[_ , _ , _ , _ , _ , _ , _ , _ , _ , _ , _ , _ , _ , _]] {
    def append[
        X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8 , X9 , X10 , X11 , X12 , X13 , X14,
        Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8 , Y9 , Y10 , Y11 , Y12 , Y13 , Y14,
        Z1 , Z2 , Z3 , Z4 , Z5 , Z6 , Z7 , Z8 , Z9 , Z10 , Z11 , Z12 , Z13 , Z14
    ](
        x: F[X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8 , X9 , X10 , X11 , X12 , X13 , X14],
        y: F[Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8 , Y9 , Y10 , Y11 , Y12 , Y13 , Y14]
    )(p: Plus14[
        X1 , X2 , X3 , X4 , X5 , X6 , X7 , X8 , X9 , X10 , X11 , X12 , X13 , X14,
        Y1 , Y2 , Y3 , Y4 , Y5 , Y6 , Y7 , Y8 , Y9 , Y10 , Y11 , Y12 , Y13 , Y14,
        Z1 , Z2 , Z3 , Z4 , Z5 , Z6 , Z7 , Z8 , Z9 , Z10 , Z11 , Z12 , Z13 , Z14
    ]): F[Z1 , Z2 , Z3 , Z4 , Z5 , Z6 , Z7 , Z8 , Z9 , Z10 , Z11 , Z12 , Z13 , Z14]
}