class RomanNumerals {
    fun callForAction(number: Int): String {
        return when(number) {
            1 -> "I"
            2 -> "II"
            else -> "III"
        }
    }
}