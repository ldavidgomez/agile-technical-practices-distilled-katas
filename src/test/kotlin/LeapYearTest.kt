import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class LeapYearTest {

    private val leapYear = LeapYear()

    @ParameterizedTest(name = "Boolean of {0} should be {1}")
    @CsvSource(
        "1, false",
        "4, true",
        "100, false,",
        "400, true",
        "2001, false",
        "1996, true",
        "1900, false",
        "2000, true")
    fun should_return_true_for_leap_year_else_false(year: Int, expected: Boolean) {
        val result = leapYear.callForAction(year)

        assertEquals(expected, result)
    }
}