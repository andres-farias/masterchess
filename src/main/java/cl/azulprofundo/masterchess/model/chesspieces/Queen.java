package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

import java.util.List;

public class Queen extends ChessPiece {
    public Queen(ChessPieceColor pieceColor) {
        super(pieceColor);
    }

    public Queen(ChessPieceColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        throw new AbstractMethodError();
    }
}
