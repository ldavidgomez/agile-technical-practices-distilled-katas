import java.awt.Point

class TicTacToe {

    fun callForAction(player: String, point: Point): Match {

        return Match()
    }
}

data class Match(val board: Array<String> = emptyArray(), val result: ResultEnum = ResultEnum.NO_RESULT) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Match

        if (!board.contentEquals(other.board)) return false
        if (result != other.result) return false

        return true
    }

    override fun hashCode(): Int {
        var result1 = board.contentHashCode()
        result1 = 31 * result1 + result.hashCode()
        return result1
    }
}

enum class ResultEnum {
    WIN_X,
    WIN_O,
    DRAW,
    NO_RESULT
}
