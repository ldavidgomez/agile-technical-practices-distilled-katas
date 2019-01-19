class RomanNumerals {

    private val units = arrayListOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
    private val tenths = arrayListOf("X", "XX", "XXX", "LX", "L", "LX", "LXX", "LXXX", "XC")

    private val romans = arrayListOf(units, tenths)

    fun callForAction(number: Int): String {
        val numbersArray = number.toString().toCharArray()

        return numbersArray.reversed().mapIndexed{ index, c ->
            when(c.toString().toInt()) {
                0 -> ""
                else -> romans[index][c.toString().toInt() - 1]
            }
        }.joinToString("")

    }
}