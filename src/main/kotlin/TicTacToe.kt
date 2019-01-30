class TicTacToe {

    fun callForAction(number: Int): Match {

        return Match()
    }
}

data class Match(val board: Array<String> = emptyArray(), val result: ResultEnum = ResultEnum.DRAW) {}

enum class ResultEnum {
    WIN_X,
    WIN_O,
    DRAW
}
