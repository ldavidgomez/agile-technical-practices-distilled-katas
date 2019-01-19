import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class StatsCalculatorTest {

    private val statsCalculator = StatsCalculator()
    private val stats: Stats = Stats(0, 0,0,0.0)

    @Test
    fun should_return_min_value_from_sequence() {
        val result = statsCalculator.callForAction(intArrayOf(6, 9, 15, -2, 92, 11))

        assertEquals(Stats(-2, 0, 0, 0.0).min, result.min)
    }

    @Test
    fun should_return_max_value_from_sequence() {
        val result = statsCalculator.callForAction(intArrayOf(6, 9, 15, -2, 92, 11))

        assertEquals(Stats(0, 92, 0, 0.0).max, result.max)
    }

    @Test
    fun should_return_size_value_from_sequence() {
        val result = statsCalculator.callForAction(intArrayOf(6, 9, 15, -2, 92, 11))

        assertEquals(Stats(0, 0, 6, 0.0).size, result.size)
    }

    @Test
    fun should_return_average_value_from_sequence() {
        val result = statsCalculator.callForAction(intArrayOf(6, 9, 15, -2, 92, 11))

        assertEquals(Stats(0, 0, 0, 21.833333333333332).average, result.average)
    }

    @Test
    fun should_return_complete_value_from_sequence() {
        val result = statsCalculator.callForAction(intArrayOf(6, 9, 15, -2, 92, 11))

        assertEquals(Stats(-2, 92, 6, 21.833333333333332), result)
    }

}