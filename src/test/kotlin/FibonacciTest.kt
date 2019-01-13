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
}