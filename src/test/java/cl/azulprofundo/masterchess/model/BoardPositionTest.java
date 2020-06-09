package cl.azulprofundo.masterchess.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardPositionTest {

    @Test
    public void testValid() {
        BoardPosition boardPosition = new BoardPosition(BoardColumnsEnum.A, 1);
        assertTrue(boardPosition.isValid());
        assertFalse(boardPosition.isNullPosition());
    }

    @Test
    public void testInvalid() {
        BoardPosition boardPosition = new BoardPosition(null, 1);
        assertFalse(boardPosition.isValid());
    }

    @Test
    public void testIsNull() {
        BoardPosition nullPosition = BoardPosition.getNullPosition();
        assertTrue(nullPosition.isNullPosition());
    }

    @Test
    public void testEquals() {
        BoardPosition boardPosition1 = new BoardPosition(BoardColumnsEnum.A, 1);
        BoardPosition boardPosition2 = new BoardPosition(BoardColumnsEnum.A, 2);
        BoardPosition boardPosition3 = new BoardPosition(BoardColumnsEnum.A, 1);

        assertEquals(boardPosition1, boardPosition3);
        assertNotEquals(boardPosition1, boardPosition2);
        assertNotEquals(boardPosition2, boardPosition3);

    }
}