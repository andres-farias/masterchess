package cl.azulprofundo.masterchess.model.board;

public enum BoardColumn {

    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7);

    private final int value;

    BoardColumn(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    /**
     * This method is responsible to return the previous constant to <code>this</code> one.
     *
     * @return The constant with the right previous value.
     */
    public BoardColumn prev() {
        if (value == 0) {
            throw new IndexOutOfBoundsException("There is no previous constant to A");
        }

        return values()[value-1];
    }

    /**
     * This method is responsible to return the <b>next<b> constant to <code>this</code> one.
     *
     * @return The constant with the right next value.
     */
    public BoardColumn next() {
        if (this.equals(H)) {
            throw new IndexOutOfBoundsException("There is no next constant to H");
        }

        return values()[value+1];
    }
}
