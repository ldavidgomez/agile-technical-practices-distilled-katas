class PrimeFactors {

    fun callForAction(number: Int): List<Int> {

        return getPrimeFactors(number)

    }

    private fun getPrimeFactors(number: Int): List<Int> {
        if (number < 2) return emptyList()

        val primeFactors = arrayListOf<Int>()
        var remainder = number
        var i = 2
        while (i <= remainder / i) {
            while (remainder % i == 0) {
                primeFactors.add(i)
                remainder /= i
            }

            i++
        }

        if (remainder > 1)
            primeFactors.add(remainder)

        return primeFactors
    }

}