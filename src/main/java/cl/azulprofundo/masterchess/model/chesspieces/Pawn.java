package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.gameplay.ChessColor;

import java.util.List;

public class Pawn extends ChessPiece {

    public Pawn(ChessColor color) {
        super(color);
    }

    public Pawn(ChessColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        return null;
    }

    @Override
    protected String getShortName() {
        return "PW";
    }
}
