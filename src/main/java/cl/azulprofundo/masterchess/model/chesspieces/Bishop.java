package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardColumnsEnum;
import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.gameplay.ChessColor;

import java.util.ArrayList;
import java.util.List;

import static cl.azulprofundo.masterchess.model.board.BoardColumnsEnum.A;

public class Bishop extends ChessPiece {
    public Bishop(ChessColor pieceColor) {
        super(pieceColor);
    }

    public Bishop(ChessColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    /**
     * This method is responsible for returning the possible positions that can be reached by this piece.
     * TODO: Finish this
     * @return The list of possible positions to move.
     */
    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        List<BoardPosition> positions = new ArrayList<>();

        return positions;
    }

    @Override
    protected String getShortName() {
        return "BI";
    }
}
