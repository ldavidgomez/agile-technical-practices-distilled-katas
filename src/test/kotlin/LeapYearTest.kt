import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LeapYearTest {

    private val leapYear = LeapYear()

    @Test
    fun should_return_false() {
        val expected = false
        val result = leapYear.callForAction(1)

        assertEquals(expected, result)
    }

    @Test
    fun should_return_true() {
        val expected = true
        val result = leapYear.callForAction(4)

        assertEquals(expected, result)
    }
}