package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.board.BoardUtils;
import cl.azulprofundo.masterchess.model.gameplay.ChessColor;

import java.util.ArrayList;
import java.util.List;

/**
 * This class aims to implements the Bishop behaviour.
 *
 * @author Andrés Farías
 */
public class Bishop extends ChessPiece {

    public Bishop(ChessColor pieceColor) {
        super(pieceColor);
    }

    public Bishop(ChessColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }


    /**
     * This method is responsible for returning all possible positions that can be reached by this piece, ignoring an
     * specific board configuration state.
     * <p>
     * To determine the possible movements, it will be constructed using the four possible movement directions.
     * On the other hand, the bishop does not recognise the direction of the board, so it's simple.
     * TODO: Finish this
     *
     * @return The list of possible positions to move.
     */
    public static List<BoardPosition> getReachableSquaresFrom(BoardPosition position) {
        List<BoardPosition> positions = new ArrayList<>();

        BoardUtils.getDiagonalTowardsLeftFrom(position); // FIXME: HERE NOW

        return positions;
    }

    /**
     * This method is responsible for returning the possible positions that can be reached by this piece.
     * <p>
     * To determine the possible movements, it will be constructed using the four possible movement directions.
     * Furthermore, the bishop can't jump over pieces, and therefore, possible positions are delimited with pieces on
     * the way.
     * <p>
     * On the other hand, the bishop does not recognise the direction of the board, so it's simple.
     *
     * @return The list of possible positions to move.
     */
    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {
        List<BoardPosition> positions = null; // Bishop.getReachableSquares();

        /* TODO: Finish this method */

        return positions;
    }

    @Override
    protected String getShortName() {
        return "BI";
    }
}
