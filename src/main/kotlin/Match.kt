import Enums.ResultEnum

data class Match(
    val board: Array<Array<String>> = arrayOf(
        arrayOf("", "", ""),
        arrayOf("", "", ""),
        arrayOf("", "", "")
    ), val result: ResultEnum = ResultEnum.DRAW
) {

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