class StatsCalculator {

    fun callForAction(sequence: IntArray): Stats {
        return Stats(-2, 0, 0,0 )
    }

}

data class Stats(val min: Int, val max: Int, val size: Int, val average: Int)
