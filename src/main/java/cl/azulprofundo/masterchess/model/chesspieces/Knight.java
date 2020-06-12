package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardColumnsEnum;
import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.gameplay.ChessColor;

import java.util.ArrayList;
import java.util.List;

public class Knight extends ChessPiece {

    public Knight(ChessColor pieceColor) {
        super(pieceColor);
    }

    public Knight(ChessColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    /**
     * There are a maximum of 8 possible moves.
     *
     * @return The list of positions on the board towards which this piece can move to.
     */
    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {

        List<BoardPosition> possiblePositions = new ArrayList<>();

        BoardPosition boardPosition = getBoardPosition();
        int raw = boardPosition.getRaw();
        BoardColumnsEnum column = boardPosition.getColumn();
        int columnValue = column.getValue();

        /* Frontal moves */
        if (raw < 7) {
            if (columnValue < 8) {
                possiblePositions.add(new BoardPosition(BoardColumnsEnum.values()[columnValue + 1], raw + 2));
            }
            if (columnValue > 1) {
                possiblePositions.add(new BoardPosition(BoardColumnsEnum.values()[columnValue - 1], raw + 2));
            }
        }

        /* Backward moves */
        if (raw > 2) {
            if (columnValue < 8) {
                possiblePositions.add(new BoardPosition(BoardColumnsEnum.values()[columnValue + 1], raw - 2));
            }
            if (columnValue > 1) {
                possiblePositions.add(new BoardPosition(BoardColumnsEnum.values()[columnValue - 1], raw - 2));
            }
        }

        /* Left moves */
        if (columnValue > 2) {
            if (raw < 8) {
                possiblePositions.add(new BoardPosition(BoardColumnsEnum.values()[columnValue - 2], raw + 1));
            }
            if (raw > 1) {
                possiblePositions.add(new BoardPosition(BoardColumnsEnum.values()[columnValue - 2], raw - 1));
            }
        }

        /* Right moves */
        if (columnValue < 7) {
            if (raw < 8) {
                possiblePositions.add(new BoardPosition(BoardColumnsEnum.values()[columnValue + 2], raw + 1));
            }
            if (raw > 1) {
                possiblePositions.add(new BoardPosition(BoardColumnsEnum.values()[columnValue + 2], raw - 1));
            }
        }

        return possiblePositions;
    }

    @Override
    protected String getShortName() {
        return "KN";
    }
}
