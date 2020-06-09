package cl.azulprofundo.masterchess.gameplay;

import cl.azulprofundo.masterchess.model.board.BoardColumnsEnum;
import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.board.BoardState;
import cl.azulprofundo.masterchess.model.chesspieces.*;

import java.util.ArrayList;
import java.util.List;

import static cl.azulprofundo.masterchess.model.board.BoardColumnsEnum.*;
import static cl.azulprofundo.masterchess.model.chesspieces.ChessPieceColor.BLACK;
import static cl.azulprofundo.masterchess.model.chesspieces.ChessPieceColor.WHITE;

/**
 * This class is responsible for creating an initial configuration board.
 */
public class GameStarter {

    public static BoardState getStartingBoard() {

        List<ChessPiece> pieces = new ArrayList<>();

        for (BoardColumnsEnum column : BoardColumnsEnum.values()) {
            pieces.add(new Pawn(WHITE, new BoardPosition(column, 2)));
            pieces.add(new Pawn(BLACK, new BoardPosition(column, 7)));
        }

        pieces.add(new Rock(WHITE, new BoardPosition(A, 1)));
        pieces.add(new Rock(WHITE, new BoardPosition(H, 1)));
        pieces.add(new Rock(BLACK, new BoardPosition(A, 8)));
        pieces.add(new Rock(BLACK, new BoardPosition(H, 8)));

        pieces.add(new Knight(WHITE, new BoardPosition(B, 1)));
        pieces.add(new Knight(WHITE, new BoardPosition(G, 1)));
        pieces.add(new Knight(BLACK, new BoardPosition(B, 8)));
        pieces.add(new Knight(BLACK, new BoardPosition(G, 8)));

        pieces.add(new Bishop(WHITE, new BoardPosition(C, 1)));
        pieces.add(new Bishop(WHITE, new BoardPosition(F, 1)));
        pieces.add(new Bishop(WHITE, new BoardPosition(C, 8)));
        pieces.add(new Bishop(WHITE, new BoardPosition(F, 8)));

        pieces.add(new Queen(WHITE, new BoardPosition(D, 1)));
        pieces.add(new Queen(BLACK, new BoardPosition(D, 8)));

        pieces.add(new King(WHITE, new BoardPosition(E, 1)));
        pieces.add(new King(BLACK, new BoardPosition(E, 8)));

        return new BoardState(pieces);
    }
}
