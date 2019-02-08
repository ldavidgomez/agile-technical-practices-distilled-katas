import java.awt.Point

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
                if(point.equals(currentPoint) && board[col][row] == "")
                    board[col][row] = player
            }
        }

        return board
    }

    private fun setResult(board: Array<Array<String>>): ResultEnum {

        val winCombos = arrayOf(
            arrayOf(Point(0,0), Point(1,0), Point(2,0)),
            arrayOf(Point(0,1), Point(1,1), Point(2,1)),
            arrayOf(Point(0,2), Point(1,2), Point(2,2)),
            arrayOf(Point(0,0), Point(0,1), Point(0,2)),
            arrayOf(Point(1,0), Point(1,1), Point(1,2)),
            arrayOf(Point(2,0), Point(2,1), Point(2,2)),
            arrayOf(Point(0,0), Point(1,1), Point(2,2)),
            arrayOf(Point(2,0), Point(1,1), Point(0,2))
        )

        for (row in winCombos) {
            val a = row[0]
            val b = row[1]
            val c = row[2]
            if (!board[a.y][a.x].isNullOrEmpty()) {
                if (board[a.y][a.x].equals(board[b.y][b.x])) {
                    if (board[a.y][a.x].equals(board[c.y][c.x])) {
                        return getWinner((board[a.y][a.x]))
                    }
                }
            }
        }

        for (row in winCombos) {
            val a = row[0]
            val b = row[1]
            val c = row[2]
            if (board[a.y][a.x].isNullOrEmpty()) {
                return ResultEnum.NONE
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
