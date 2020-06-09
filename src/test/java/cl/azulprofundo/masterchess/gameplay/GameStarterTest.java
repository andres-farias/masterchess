package cl.azulprofundo.masterchess.gameplay;

import cl.azulprofundo.masterchess.model.BoardState;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameStarterTest {

    @Test
    public void testStartingBoard() {
        BoardState startingBoardState = GameStarter.getStartingBoard();

        Assert.assertTrue(startingBoardState.getPieces().size() == 16*2);
    }
}