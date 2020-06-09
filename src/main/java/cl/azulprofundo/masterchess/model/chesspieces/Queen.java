package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

public class Queen extends ChessPiece {
    public Queen(ChessPieceColor pieceColor) {
        super(pieceColor);
    }

    public Queen(ChessPieceColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }
}
