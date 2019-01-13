class Fibonacci {

    fun callForAction(position: Int): Int {


        if(position == 0) return 0
        if(position == 1) return 1

        return callForAction(position - 1) + callForAction(position - 2)
    }

}