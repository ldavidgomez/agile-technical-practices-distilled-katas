import java.awt.Point

private val winCombos = arrayOf(
    arrayOf(Point(0,0), Point(1,0), Point(2,0)),
    arrayOf(Point(0,1), Point(1,1), Point(2,1)),
    arrayOf(Point(0,2), Point(1,2), Point(2,2)),
    arrayOf(Point(0,0), Point(0,1), Point(0,2)),
    arrayOf(Point(1,0), Point(1,1), Point(1,2)),
    arrayOf(Point(2,0), Point(2,1), Point(2,2)),
    arrayOf(Point(0,0), Point(1,1), Point(2,2)),
    arrayOf(Point(2,0), Point(1,1), Point(0,2))
)

class TicTacToe {

    fun callForAction(player: String, point: Point, currentBoard: Array<Array<String>>): Match {
        val board = setPointOnBoard(player, point, currentBoard)
        val result = setResult(board)

        return Match(board, result)
    }

    private fun setPointOnBoard(player: String, point: Point, board: Array<Array<String>>): Array<Array<String>> {
        for (row in 0..2) {
            for (col in 0..2 ) {
                val currentPoint = Point(row, col)
                if(point == currentPoint && board[col][row] == "")
                    board[col][row] = player
            }
        }

        return board
    }

    private fun setResult(board: Array<Array<String>>): ResultEnum {

        for (row in winCombos) {
            val row1 = row[0]
            val row2 = row[1]
            val row3 = row[2]
            if (!board[row1.y][row1.x].isEmpty()) {
                if (board[row1.y][row1.x] == board[row2.y][row2.x]) {
                    if (board[row1.y][row1.x] == board[row3.y][row3.x]) {
                        return getWinner((board[row1.y][row1.x]))
                    }
                }
            }
        }

        for (row in 0..2) {
            for (col in 0..2 ) {
                if (board[col][row].isEmpty()) {
                    return ResultEnum.NONE
                }
            }
        }

        return ResultEnum.DRAW
    }

    private fun getWinner(result: String): ResultEnum {
        return when(result) {
            "X" -> ResultEnum.WIN_X
            "O" -> ResultEnum.WIN_O
            "" -> ResultEnum.NONE
            else -> ResultEnum.DRAW
        }
    }
}

data class Match(val board: Array<Array<String>> = arrayOf(arrayOf("","",""), arrayOf("","",""), arrayOf("","","")), val result: ResultEnum = ResultEnum.DRAW) {

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

enum class ResultEnum{
    WIN_X,
    WIN_O,
    DRAW,
    NONE
}
