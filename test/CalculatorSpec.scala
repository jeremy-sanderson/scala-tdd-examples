import simple.math.Calculator
import org.scalatest.flatspec.AnyFlatSpec

class CalculatorSpec extends AnyFlatSpec {
    "add" should "add two positive integers" in {
        val sum = Calculator.add(1, 2)
        assert(sum == 3)
    }

    "add" should "add two negative integers" in {
        val sum = Calculator.add(-1, -2)
        assert(sum == -3)
    }
}