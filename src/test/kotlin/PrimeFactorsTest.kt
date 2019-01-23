import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PrimeFactorsTest {

    private val primeFactors = PrimeFactors()

    @ParameterizedTest
    @CsvSource("2, [2]")
    fun should_return_prime_factor_when_receive_a_number(number: Int, expected: ArrayList<Int>) {
        val result = primeFactors.callForAction(2)
        assertEquals(arrayListOf(2), result)
    }
}