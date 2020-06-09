package cl.azulprofundo.masterchess.gameplay;

import cl.azulprofundo.masterchess.model.board.BoardState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameStarterTest {

    @Test
    public void testStartingBoard() {
        BoardState startingBoardState = GameStarter.getStartingBoard();

        assertEquals(startingBoardState.getPieces().size(), 16 * 2);
    }
}