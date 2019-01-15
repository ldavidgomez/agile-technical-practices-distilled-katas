import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StatsCalculatorTest {

    private val statsCalculator = StatsCalculator()
    private val stats: Stats = Stats(0, 0,0,0)

    @Test
    fun should_return_min_value_from_sequence() {
        val result = statsCalculator.callForAction(intArrayOf(6, 9, 15, -2, 92, 11))

        assertEquals(Stats(-2, 0, 0, 0).min, result.min)
    }

    @Test
    fun should_return_max_value_from_sequence() {
        val result = statsCalculator.callForAction(intArrayOf(6, 9, 15, -2, 92, 11))

        assertEquals(Stats(0, 92, 0, 0).max, result.max)
    }

}