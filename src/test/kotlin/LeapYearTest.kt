import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LeapYearTest {

    private val leapYear = LeapYear()

    @Test
    fun should_return_false() {
        val expected = false
        val result = leapYear.callForAction(2001)
        
        assertEquals(expected, result)
    }
}