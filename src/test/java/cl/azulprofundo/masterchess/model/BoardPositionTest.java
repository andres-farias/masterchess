package cl.azulprofundo.masterchess.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardPositionTest {

    @Test
    public void testValid() {
        BoardPosition boardPosition = new BoardPosition(BoardColumnsEnum.A, 1);
        Assert.assertTrue(boardPosition.isValid());
    }

    @Test
    public void testInvalid() {
        BoardPosition boardPosition = new BoardPosition(null, 1);
        Assert.assertFalse(boardPosition.isValid());
    }
}