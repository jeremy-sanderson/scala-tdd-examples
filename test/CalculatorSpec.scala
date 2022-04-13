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

    "subtract" should "subtract two positive integers" in {
        val difference = Calculator.subtract(3, 1)
        assert (difference == 2)
    }

    "subtract" should "subtract two negative integers" in {
        val difference = Calculator.subtract(-3, -1)
        assert (difference == -2)
    }    
}