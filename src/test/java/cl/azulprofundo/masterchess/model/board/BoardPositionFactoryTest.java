package cl.azulprofundo.masterchess.model.board;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class BoardPositionFactoryTest {

    @Test
    public void testGetAllPositions() {
        HashMap<BoardColumnsEnum, HashMap<Integer, BoardPosition>> allBoardPositions = BoardPositionFactory.getAllBoardPositions();

        assertEquals(8, allBoardPositions.size());
    }
}