import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class RomanNumeralsTest {

    private val romanNumerals = RomanNumerals()

    @Test
    fun should_return_I_when_receive_1() {
        //given
        val arabic = 1

        //when
        val result = romanNumerals.callForAction(arabic)

        //then
        assertEquals("I", result)
    }

    @Test
    fun should_return_II_when_receive_2() {
        //given
        val arabic = 2

        //when
        val result = romanNumerals.callForAction(arabic)

        //then
        assertEquals("II", result)
    }

    @Test
    fun should_return_III_when_receive_3() {
        //given
        val arabic = 3

        //when
        val result = romanNumerals.callForAction(arabic)

        //then
        assertEquals("III", result)
    }

    @Test
    fun should_return_IV_when_receive_4() {
        //given
        val arabic = 4

        //when
        val result = romanNumerals.callForAction(arabic)

        //then
        assertEquals("IV", result)
    }

    @Test
    fun should_return_V_when_receive_5() {
        //given
        val arabic = 5

        //when
        val result = romanNumerals.callForAction(arabic)

        //then
        assertEquals("V", result)
    }

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

        //then
        assertEquals(romanNumber, result)
    }

}