class Thing {
    fun callForAction(number: Int): String {
        if(number.rem(3) == 0) return "fizz"

        return number.toString()
    }
}