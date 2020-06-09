package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

import java.util.List;

public class King extends ChessPiece {
    public King(ChessPieceColor pieceColor) {
        super(pieceColor);
    }

    public King(ChessPieceColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        throw new AbstractMethodError();
    }
}
