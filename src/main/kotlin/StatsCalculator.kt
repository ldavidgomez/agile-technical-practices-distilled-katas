class StatsCalculator {

    fun callForAction(sequence: IntArray): Stats {
        return Stats(sequence.min(), sequence.max(), 0,0 )
    }

}

data class Stats(val min: Int? = 0, val max: Int? = 0, val size: Int? = 0, val average: Int? = 0)
