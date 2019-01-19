class StatsCalculator {

    fun callForAction(sequence: IntArray): Stats {
        return Stats(sequence.min(), sequence.max(), sequence.size,sequence.average() )
    }

}

data class Stats(val min: Int? = 0, val max: Int? = 0, val size: Int? = 0, val average: Double = 0.0)
