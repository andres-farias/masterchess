package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;
import org.junit.Test;

import java.util.List;

import static cl.azulprofundo.masterchess.model.board.BoardColumnsEnum.*;
import static cl.azulprofundo.masterchess.model.gameplay.ChessColor.WHITE;
import static org.junit.Assert.assertEquals;

public class KnightTest {

    /**
     * This tests de moves from the  lower left corner of the board.
     */
    @Test
    public void testMoves01() {
        BoardPosition leftCorner = new BoardPosition(A, 1);
        Knight whiteKnight = new Knight(WHITE, leftCorner);

        List<BoardPosition> possiblePositionsFromMoves = whiteKnight.getPossiblePositionsFromMoves();
        assertEquals(2, possiblePositionsFromMoves.size());
    }

    /**
     * This tests de moves from the lower right corner of the board.
     */
    @Test
    public void testMoves02() {
        BoardPosition lowerRightCorner = new BoardPosition(H, 1);
        Knight whiteKnight = new Knight(WHITE, lowerRightCorner);

        List<BoardPosition> possiblePositionsFromMoves = whiteKnight.getPossiblePositionsFromMoves();
        assertEquals(2, possiblePositionsFromMoves.size());
    }

    /**
     * This tests de moves from the upper right corner of the board.
     */
    @Test
    public void testMoves03() {
        BoardPosition upperRightCorner = new BoardPosition(H, 8);
        Knight whiteKnight = new Knight(WHITE, upperRightCorner);

        List<BoardPosition> possiblePositionsFromMoves = whiteKnight.getPossiblePositionsFromMoves();
        assertEquals(2, possiblePositionsFromMoves.size());
    }

    /**
     * This tests de moves from the upper right corner of the board.
     */
    @Test
    public void testMoves04() {
        BoardPosition upperRightCorner = new BoardPosition(A, 8);
        Knight whiteKnight = new Knight(WHITE, upperRightCorner);

        List<BoardPosition> possiblePositionsFromMoves = whiteKnight.getPossiblePositionsFromMoves();
        assertEquals(2, possiblePositionsFromMoves.size());
    }

    /**
     * This tests de moves from the upper right corner of the board.
     */
    @Test
    public void testMoves05() {
        BoardPosition central = new BoardPosition(D, 4);
        Knight whiteKnight = new Knight(WHITE, central);

        List<BoardPosition> possiblePositionsFromMoves = whiteKnight.getPossiblePositionsFromMoves();
        assertEquals(8, possiblePositionsFromMoves.size());
    }
}