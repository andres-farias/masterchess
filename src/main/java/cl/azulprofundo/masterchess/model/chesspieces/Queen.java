package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.gameplay.ChessColor;

import java.util.List;

public class Queen extends ChessPiece {
    public Queen(ChessColor pieceColor) {
        super(pieceColor);
    }

    public Queen(ChessColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        throw new AbstractMethodError();
    }

    @Override
    protected String getShortName() {
        return "QU";
    }
}
