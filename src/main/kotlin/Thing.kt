class Thing {
    fun callForAction(number: Int): String {
        if(number.rem(3) == 0) return "Fizz"
        if(number.rem(5) == 0) return "Buzz"

        return number.toString()
    }
}