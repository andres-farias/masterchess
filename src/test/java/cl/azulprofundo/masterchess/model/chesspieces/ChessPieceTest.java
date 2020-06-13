package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;
import org.junit.Test;

import static cl.azulprofundo.masterchess.model.board.BoardColumn.A;
import static cl.azulprofundo.masterchess.model.gameplay.ChessColor.BLACK;
import static cl.azulprofundo.masterchess.model.gameplay.ChessColor.WHITE;
import static org.junit.Assert.assertEquals;

public class ChessPieceTest {

    @Test
    public void getShortName() {
        assertEquals("KN", new Knight(BLACK).getShortName());
        assertEquals("KN", new Knight(WHITE).getShortName());

        assertEquals("PW", new Pawn(BLACK).getShortName());
        assertEquals("PW", new Pawn(WHITE).getShortName());

        assertEquals("RO", new Rock(BLACK).getShortName());
        assertEquals("RO", new Rock(WHITE).getShortName());

        assertEquals("BI", new Bishop(BLACK).getShortName());
        assertEquals("BI", new Bishop(WHITE).getShortName());

        assertEquals("QU", new Queen(BLACK).getShortName());
        assertEquals("QU", new Queen(WHITE).getShortName());

        assertEquals("KI", new King(BLACK).getShortName());
        assertEquals("KI", new King(WHITE).getShortName());
    }

    @Test
    public void testGetHash() {
        assertEquals("KIWA1", new King(WHITE).getHash());
        assertEquals("KIWA5", new King(WHITE, new BoardPosition(A, 5)).getHash());
    }
}