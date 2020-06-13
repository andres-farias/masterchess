package cl.azulprofundo.masterchess.model.board;

import java.util.ArrayList;
import java.util.List;

/**
 * This class aims to provide crosscut useful tools for supporting de model programming.
 *
 * @author Andres Farias
 */
public class BoardUtils {

    /**
     * The bord for which this utilities are created
     */
    private ChessBoard board;

    /**
     * The constructor is responsible for initializing this utility with a board.
     *
     * @param board The bord for which the utilities are created.
     */
    public BoardUtils(ChessBoard board) {
        this.board = board;
    }

    /**
     * This method is responsible for returning a diagonal created from a given point till the bord of the board.
     * @param position The position from which the diagonal is build.
     * @return The list of positions
     */
    public static List<BoardPosition> getDiagonalTowardsLeftFrom(BoardPosition position) {

        List<BoardPosition> diagonal = new ArrayList<>();
        BoardPosition current = position;
        while ((current = current.getFrontLeftPosition()) != null) {
            diagonal.add(current);
        }

        return diagonal;
    }

    /**
     * This method is responsible for returning a column with the elements ordered from the lower raw to the greater
     * raw with respect to the board.
     *
     * @param aColumn The name of the column to be retrieved.
     * @return The column requested with all its positions
     */
    public ColumnVector getColumn(BoardColumn aColumn) {

        ColumnVector theColumn = new ColumnVector();
        for (int aRaw = 0; aRaw < 8; aRaw++) {
            theColumn.append(this.board.getPosition(aColumn, aRaw));
        }

        return theColumn;
    }
}
