import java.awt.Point

class TicTacToe {

    fun callForAction(player: String, point: Point, currentBoard: Array<Array<String>>): Match {

        setPointOnBoard(player, point, currentBoard)

        return Match(currentBoard, ResultEnum.NO_RESULT)
    }

    private fun setPointOnBoard(player: String, point: Point, board: Array<Array<String>>): Match {
        for (row in 0..2) {
            for (col in 0..2 ) {
                val currentPoint = Point(row, col)
                if(point.equals(currentPoint) && board[row][col] == "")
                    board[row][col] = player
            }
        }

        return Match(board, ResultEnum.NO_RESULT)
    }
}

data class Match(val board: Array<Array<String>> = arrayOf(arrayOf("","",""), arrayOf("","",""), arrayOf("","","")), val result: ResultEnum = ResultEnum.NO_RESULT) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Match

        if (!board.contentDeepEquals(other.board)) return false
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
