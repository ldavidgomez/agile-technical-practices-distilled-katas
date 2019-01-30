import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.awt.Point

internal class TicTacToeTest{

    private val ticTacToe = TicTacToe()

    @Test
    fun should_return_result_with_empty_board_and_no_result_value(){
        val expected = Match()

        //given
        val player = "X"
        val point = Point(0,0)

        //when
        val result = ticTacToe.callForAction(player, point)

        //then
        assertEquals(expected, result)
    }

}