import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class ThingTest {

    private val thing: Thing = Thing()

    @ParameterizedTest(name = "String of {0} should be {1}")
    @CsvSource("1, 1", "2, 2", "4, 4")
    fun should_return_non_fizzbuzz_string (number: Int, expected: String) {
        val result = thing.callForAction(number)

        assertEquals(expected, result)
    }

    @ParameterizedTest(name = "String of {0} should be Fizz")
    @CsvSource("3", "6", "9")
    fun should_return_fizz_string(number: Int) {
        val expected = "Fizz"
        val result = thing.callForAction(number)

        assertEquals(expected, result)
    }

    @ParameterizedTest(name = "String of {0} should be Buzz")
    @CsvSource("5", "10", "20")
    fun should_return_buzz_string(number: Int) {
        val expected = "Buzz"
        val result = thing.callForAction(number)

        assertEquals(expected, result)
    }

    @ParameterizedTest(name = "String of {0} should be FizzBuzz")
    @CsvSource("15", "30", "45")
    fun should_return_fizzbuzz_string(number: Int) {
        val expected = "FizzBuzz"
        val result = thing.callForAction(number)

        assertEquals(expected, result)
    }
}