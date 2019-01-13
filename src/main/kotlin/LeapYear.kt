class LeapYear {
    fun callForAction(year: Int): Boolean {
        if(year.rem(4) == 0 && (year.rem(100) != 0 || year.rem(400) == 0)) return true

        return false
    }
}