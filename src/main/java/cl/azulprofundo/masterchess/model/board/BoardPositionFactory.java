package cl.azulprofundo.masterchess.model.board;

import java.util.HashMap;

/**
 * This class is responsible for factoring the (singleton) positions of a board.
 */
public class BoardPositionFactory {

    /**
     * This method returns a list with all the positions of a board.
     *
     * @return The list of positions of a board.
     */
    public static HashMap<BoardColumn, HashMap<Integer, BoardPosition>> getAllBoardPositions() {
        HashMap<BoardColumn, HashMap<Integer, BoardPosition>> boardPositions = new HashMap<>();
        for (BoardColumn column : BoardColumn.values()) {
            HashMap<Integer, BoardPosition> theColumn = new HashMap<>();
            boardPositions.put(column, theColumn);

            for (int raw = 1; raw <= 8; raw++) {
                theColumn.put(raw, new BoardPosition(column, raw));
            }
        }

        return boardPositions;
    }
}
