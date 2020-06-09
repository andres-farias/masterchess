package cl.azulprofundo.masterchess.model.board;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BoardPositionFactoryTest {

    @Test
    public void testGetAllPositions() {
        List<BoardPosition> allBoardPositions = BoardPositionFactory.getAllBoardPositions();

        assertEquals(8*8, allBoardPositions.size());
    }
}