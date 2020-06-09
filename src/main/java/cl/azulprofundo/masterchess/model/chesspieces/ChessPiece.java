package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

/**
 * The basic info that must be provided for any chess piece is its color.
 */
public abstract class ChessPiece {

    private final ChessPieceColor color;
    private BoardPosition boardPosition;

    public ChessPiece(ChessPieceColor pieceColor) {
        this(pieceColor, BoardPosition.getNullPosition());
    }

    public ChessPiece(ChessPieceColor pieceColor, BoardPosition boardPosition) {
        this.color = pieceColor;
        this.boardPosition = boardPosition;
    }

    public ChessPieceColor getColor() {
        return color;
    }
}
