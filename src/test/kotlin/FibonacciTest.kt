import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FibonacciTest {

    private val fibonacci = Fibonacci()

    @ParameterizedTest(name = "Position {0} should be fibonacci number {1}")
    @CsvSource(
            "0, 0",
            "1, 1",
            "2, 1,",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "8, 21",
            "9, 34"
    )
    fun should_return_fibonazzi_number_for_position(position: Int, expected: Int) {
        val result = fibonacci.callForAction(position)

        assertEquals(expected, result)
    }

}