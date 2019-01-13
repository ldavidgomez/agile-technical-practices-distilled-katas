class Thing {
    fun callForAction(number: Int): String {
        if(number == 3) return "fizz"

        return number.toString()
    }
}