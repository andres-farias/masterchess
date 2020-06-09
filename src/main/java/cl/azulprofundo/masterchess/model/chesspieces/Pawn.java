package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.BoardPosition;
import cl.azulprofundo.masterchess.model.ChessPieceColor;

import java.util.List;

public class Pawn extends ChessPiece {

    public Pawn(ChessPieceColor color) {
        super(color);
    }

    public Pawn(ChessPieceColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        return null;
    }
}
