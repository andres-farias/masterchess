package cl.azulprofundo.masterchess.model.board;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardUtilsTest {

    private ChessBoard board;

    @Before
    public void setUp() {
        board = new ChessBoard();
    }

    @Test
    public void testCreation() {
        assertNotNull(board.getWhitePlayer());
        assertNotNull(board.getBlackPlayer());
    }

    @Test
    public void testGetColumn() {

        ChessBoard board = new ChessBoard();
        BoardUtils boardUtils = new BoardUtils(board);

        for (BoardColumn column : BoardColumn.values()) {
            ColumnVector theColumn = boardUtils.getColumn(column);

            assertEquals(8, theColumn.size());
        }

    }
}