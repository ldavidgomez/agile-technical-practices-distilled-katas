import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RomanNumeralsTest {

    private val romanNumerals = RomanNumerals()

    @ParameterizedTest
    @CsvSource(
        "1, I",
        "2, II,",
        "3, III",
        "4, IV",
        "5, V",
        "6, VI",
        "7, VII",
        "8, VIII",
        "9, IX"
    )
    fun should_return_roman_unit_when_receive_arabic_unit(arabicNumber: Int, romanNumber: String) {
        val result = romanNumerals.callForAction(arabicNumber)

        assertEquals(romanNumber, result)
    }

    @Test
    fun should_return_X_when_receive_10() {
        //given
        val arabic = 10

        //when
        val result = romanNumerals.callForAction(arabic)

        //then
        assertEquals("X", result)
    }

    @Test
    fun should_return_XI_when_receive_11() {
        //given
        val arabic = 11

        //when
        val result = romanNumerals.callForAction(arabic)

        //then
        assertEquals("XI", result)
    }

}