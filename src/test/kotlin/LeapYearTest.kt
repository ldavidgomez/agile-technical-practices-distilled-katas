import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LeapYearTest {

    private val leapYear = LeapYear()

    @Test
    fun should_return_false_for_year_1() {
        val expected = false
        val result = leapYear.callForAction(1)

        assertEquals(expected, result)
    }

    @Test
    fun should_return_true_for_year_4() {
        val expected = true
        val result = leapYear.callForAction(4)

        assertEquals(expected, result)
    }


}