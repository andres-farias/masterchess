package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.gameplay.ChessColor;

import java.util.List;

public class Rock extends ChessPiece {
    public Rock(ChessColor pieceColor) {
        super(pieceColor);
    }

    public Rock(ChessColor color, BoardPosition boardPosition) {
        super(color, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        throw new AbstractMethodError();
    }

    @Override
    protected String getShortName() {
        return "RO";
    }
}
