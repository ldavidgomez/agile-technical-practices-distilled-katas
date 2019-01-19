class RomanNumerals {

    private val units = arrayListOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

    fun callForAction(number: Int): String {
        return units[number - 1]
    }
}