import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FibonacciTest {

    private val fibonacci = Fibonacci()

    @Test
    fun should_return_0_for_position_0() {
        val expected = 0
        val result = fibonacci.callForAction(0)

        assertEquals(expected, result)
    }

    @Test
    fun should_return_1_for_position_1() {
        val expected = 1
        val result = fibonacci.callForAction(1)

        assertEquals(expected, result)
    }

    @Test
    fun should_return_1_for_position_3() {
        val expected = 1
        val result = fibonacci.callForAction(3)

        assertEquals(expected, result)
    }

    @Test
    fun should_return_2_for_position_4() {
        val expected = 2
        val result = fibonacci.callForAction(4)

        assertEquals(expected, result)
    }
}