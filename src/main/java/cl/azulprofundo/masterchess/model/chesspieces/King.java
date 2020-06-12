package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.gameplay.ChessColor;

import java.util.List;

public class King extends ChessPiece {
    public King(ChessColor pieceColor) {
        super(pieceColor);
    }

    public King(ChessColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        throw new AbstractMethodError();
    }

    @Override
    protected String getShortName() {
        return "KI";
    }
}
