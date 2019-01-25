import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream



    class PrimeFactorsTest {

    private val primeFactors = PrimeFactors()

    @ParameterizedTest
    @MethodSource("generateData")
    fun should_return_prime_factor_when_receive_a_number(number: Int, expected: ArrayList<Int>) {
        val result = primeFactors.callForAction(2)
        assertEquals(expected, result)
    }

    companion object {
        @JvmStatic
        fun generateData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(2, arrayListOf(2)),
                Arguments.of(3, arrayListOf(3)),
                Arguments.of(4, arrayListOf(2, 2))
            )
        }
    }

}