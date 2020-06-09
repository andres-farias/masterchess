package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

public class Rock extends ChessPiece {
    public Rock(ChessPieceColor pieceColor) {
        super(pieceColor);
    }

    public Rock(ChessPieceColor color, BoardPosition boardPosition) {
        super(color, boardPosition);
    }
}
