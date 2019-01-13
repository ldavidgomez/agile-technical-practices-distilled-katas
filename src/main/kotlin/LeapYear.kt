class LeapYear {
    fun callForAction(year: Int): Boolean {
        if(year.rem(4) == 0) return true

        return false
    }
}