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

    "multiply" should "multiply two single digit numbers"  in {
        val product = Calculator.multiply(3, 4)
        assert (product == 12)
    }

    "multiply" should "multiply two double digit numbers"  in {
        val product = Calculator.multiply(40, 30)
        assert (product == 1200)
    }

    "modulus" should "find remainder of division for two integers" in {
        val modulus = Calculator.modulus(20, 7)
        assert (modulus == 6)
    }

    "modulus" should "be 0 for exact multiples of second parameter" in {
        val modulus = Calculator.modulus(27, 3)
        assert (modulus == 0)
    }
}