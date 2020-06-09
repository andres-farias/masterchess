package cl.azulprofundo.masterchess.model.board;

import java.util.ArrayList;
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
    public static List<BoardPosition> getAllBoardPositions() {
        List<BoardPosition> boardPositions = new ArrayList<>();
        for (BoardColumnsEnum column : BoardColumnsEnum.values()) {
            for (int raw = 1; raw <= 8; raw++) {
                boardPositions.add(new BoardPosition(column, raw));
            }
        }

        return boardPositions;
    }
}
