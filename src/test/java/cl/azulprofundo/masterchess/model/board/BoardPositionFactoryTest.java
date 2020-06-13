package cl.azulprofundo.masterchess.model.board;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BoardPositionFactoryTest {

    @Test
    public void testGetAllPositions() {
        HashMap<BoardColumn, HashMap<Integer, BoardPosition>> allBoardPositions = BoardPositionFactory.getAllBoardPositions();

        assertEquals(8, allBoardPositions.size());
    }
}