package cl.azulprofundo.masterchess.model.board;

import org.junit.Test;

import static cl.azulprofundo.masterchess.model.board.BoardColumn.A;
import static cl.azulprofundo.masterchess.model.board.BoardColumn.B;
import static org.junit.Assert.*;

public class ColumnsEnumTestVector {

    @Test
    public void testPreviousConstant() {
        assertEquals(A, B.prev());
    }
}