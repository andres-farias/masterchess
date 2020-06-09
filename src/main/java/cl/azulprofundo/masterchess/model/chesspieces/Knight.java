package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

public class Knight extends ChessPiece {
    public Knight(ChessPieceColor pieceColor) {
        super(pieceColor);
    }

    public Knight(ChessPieceColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }
}
