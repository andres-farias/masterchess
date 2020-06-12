package cl.azulprofundo.masterchess.model.board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class is responsible for factoring the (singleton) positions of a board.
 */
public class BoardPositionFactory {

    /**
     * This method returns a list with all the positions of a board.
     *
     * @return The list of positions of a board.
     */
    public static HashMap<BoardColumnsEnum, HashMap<Integer, BoardPosition>> getAllBoardPositions() {
        HashMap<BoardColumnsEnum, HashMap<Integer, BoardPosition>> boardPositions = new HashMap<>();
        for (BoardColumnsEnum column : BoardColumnsEnum.values()) {
            HashMap<Integer, BoardPosition> theColumn = new HashMap<>();
            boardPositions.put(column, theColumn);

            for (int raw = 1; raw <= 8; raw++) {
                theColumn.put(raw, new BoardPosition(column, raw));
            }
        }

        return boardPositions;
    }
}
