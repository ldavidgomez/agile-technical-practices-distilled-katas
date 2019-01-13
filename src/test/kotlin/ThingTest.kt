import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ThingTest {

    private val thing: Thing = Thing()

    @ParameterizedTest(name = "String of {0} should be {1}")
    @CsvSource("1, 1", "2, 2", "4, 4")
    fun should_return_non_fizzbuzz_string (number: Int, expected: String) {
        val result = thing.callForAction(number)

        assertEquals(result, expected)
    }

    @Test
    fun should_return_fizz_string() {
        val expected = "fizz"
        val result = thing.callForAction(3)

        assertEquals(result, expected)
    }
}