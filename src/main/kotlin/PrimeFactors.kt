class PrimeFactors {

    fun callForAction(number: Int): ArrayList<Int> {

        getPrimeFactors(number)

        return arrayListOf(number)
    }

    private fun getPrimeFactors(number: Int): ArrayList<Int> {
        val primes = ArrayList<Int>()
        for (i in number.minus(1) ..1) {
            if(i.rem(number) == 0) {
                primes.add(i)
                getPrimeFactors(i -1 )
                println(i)
            }
        }
        return primes
    }

}