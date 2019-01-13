import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ThingTest {

    private val thing: Thing = Thing()

    @Test
    fun should_return_1() {
        val expected = "1"
        val result = thing.callForAction(1)

        assertEquals(result, expected)
    }

    @Test
    fun should_return_2() {
        val expected = "2"
        val result = thing.callForAction(2)

        assertEquals(result, expected)
    }

    @Test
    fun should_return_4() {
        val expected = "4"
        val result = thing.callForAction(4)

        assertEquals(result, expected)
    }
}