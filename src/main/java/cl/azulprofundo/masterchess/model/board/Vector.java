package cl.azulprofundo.masterchess.model.board;

import java.util.ArrayList;
import java.util.List;

/**
 * This class abstracts an special concept which does not have name so far in reality. This is the abstraction tha
 * represents a raw, a column, or a sequence of squares for a movement.
 *
 * @author Andrés Farías
 */
public class Vector {

    /** The sequences of squares */
    List<BoardPosition> positions;

    public Vector() {
        this.positions = new ArrayList<>();
    }

    public Vector(List<BoardPosition> positions) {
        this.positions = positions;
    }

    public void append(BoardPosition aPosition) {
        positions.add(aPosition);
    }

    public int size() {
        return this.positions.size();
    }
}
