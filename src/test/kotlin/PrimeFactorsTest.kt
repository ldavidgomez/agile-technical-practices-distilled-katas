import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PrimeFactorsTest {

    private val primeFactors = PrimeFactors()

    @Test
    fun should_return_prime_factor_when_receive_a_number() {
        val result = primeFactors.callForAction(2)
        assertEquals(arrayListOf(2), result)
    }
}