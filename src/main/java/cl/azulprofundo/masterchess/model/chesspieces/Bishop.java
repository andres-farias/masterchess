package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

import java.util.List;

public class Bishop extends ChessPiece {
    public Bishop(ChessPieceColor pieceColor) {
        super(pieceColor);
    }

    public Bishop(ChessPieceColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        throw new AbstractMethodError();
    }
}
