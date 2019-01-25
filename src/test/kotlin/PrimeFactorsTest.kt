import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream


class PrimeFactorsTest {

    private val primeFactors = PrimeFactors()

    @ParameterizedTest
    @MethodSource("generateData")
    fun should_return_prime_factor_when_receive_a_number(number: Int, expected: List<Int>) {
        val result = primeFactors.callForAction(number)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun generateData(): List<Arguments> {
            return listOf(
                Arguments.of(2, listOf(2)),
                Arguments.of(3, listOf(3)),
                Arguments.of(4, listOf(2, 2)),
                Arguments.of(6, listOf(2, 3)),
                Arguments.of(9, listOf(3, 3)),
                Arguments.of(12, listOf(2, 2, 3)),
                Arguments.of(15, listOf(3, 5))
            )
        }
    }

}