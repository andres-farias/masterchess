package cl.azulprofundo.masterchess.model.board;

import cl.azulprofundo.masterchess.model.chesspieces.ChessPieceMove;
import cl.azulprofundo.masterchess.model.chesspieces.Knight;
import cl.azulprofundo.masterchess.model.exceptions.EmptyBoardPositionException;
import org.junit.Test;

import java.util.Arrays;

import static cl.azulprofundo.masterchess.model.board.BoardColumn.*;
import static cl.azulprofundo.masterchess.model.gameplay.ChessColor.WHITE;
import static java.util.Collections.singletonList;
import static org.junit.Assert.*;

public class BoardStateTest {

    @Test
    public void testIsEmpty() {
        BoardPosition upperRightCorner = new BoardPosition(A, 8);
        BoardPosition centralPosition = new BoardPosition(D, 4);
        Knight whiteKnight = new Knight(WHITE, centralPosition);

        BoardState boardState = new BoardState(singletonList(whiteKnight));

        assertFalse(boardState.isEmpty(centralPosition));
        assertTrue(boardState.isEmpty(upperRightCorner));
    }

    @Test
    public void testGetPieceAt() throws EmptyBoardPositionException {
        BoardPosition centralPosition = new BoardPosition(D, 4);
        Knight whiteKnight = new Knight(WHITE, centralPosition);

        BoardState boardState = new BoardState(singletonList(whiteKnight));

        assertEquals(boardState.getPieceAt(centralPosition), whiteKnight);
    }

    @Test(expected = EmptyBoardPositionException.class)
    public void testGetPieceAtException() throws EmptyBoardPositionException {
        BoardPosition upperRightCorner = new BoardPosition(A, 8);
        BoardPosition centralPosition = new BoardPosition(D, 4);
        Knight whiteKnight = new Knight(WHITE, centralPosition);

        BoardState boardState = new BoardState(singletonList(whiteKnight));

        boardState.getPieceAt(upperRightCorner);
    }

    @Test
    public void testIsValidMove() {
        BoardPosition upperLeftCorner = new BoardPosition(A, 8);
        Knight whiteKnight = new Knight(WHITE, upperLeftCorner);
        ChessPieceMove validMove = new ChessPieceMove(whiteKnight, new BoardPosition(B, 6));

        BoardState boardState = new BoardState(singletonList(whiteKnight));
        assertTrue(boardState.isValidMove(validMove));
    }

    @Test
    public void testIsNotValidMove() {
        BoardPosition upperLeftCorner = new BoardPosition(A, 8);
        Knight whiteKnight = new Knight(WHITE, upperLeftCorner);

        BoardPosition targetPosition = new BoardPosition(B, 6);
        Knight whiteKnight2 = new Knight(WHITE, targetPosition);

        ChessPieceMove invalidMove = new ChessPieceMove(whiteKnight, targetPosition);
        ChessPieceMove invalidMove2 = new ChessPieceMove(whiteKnight2, upperLeftCorner);

        BoardState boardState = new BoardState(Arrays.asList(whiteKnight, whiteKnight2));
        assertFalse(boardState.isValidMove(invalidMove));
        assertFalse(boardState.isValidMove(invalidMove2));
    }

    @Test
    public void testGetPossiblesMove() {
        BoardPosition upperLeftCorner = new BoardPosition(A, 8);
        Knight whiteKnight = new Knight(WHITE, upperLeftCorner);

        BoardState boardState = new BoardState(singletonList(whiteKnight));
        assertEquals(2, boardState.getPossibleMoves().size());

    }
}