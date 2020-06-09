package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

import java.util.List;

public class Rock extends ChessPiece {
    public Rock(ChessPieceColor pieceColor) {
        super(pieceColor);
    }

    public Rock(ChessPieceColor color, BoardPosition boardPosition) {
        super(color, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        throw new AbstractMethodError();
    }
}
