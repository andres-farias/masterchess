package cl.azulprofundo.masterchess.model.board;

import static cl.azulprofundo.masterchess.model.board.BoardColumn.A;
import static cl.azulprofundo.masterchess.model.board.ChessBoard.MAX_RAW;

public class BoardPosition {

    private static final BoardPosition nullPosition = new NullBoardPosition();

    private final BoardColumn column;
    private final int raw;

    public static BoardPosition getNullPosition() {
        return nullPosition;
    }

    public static class NullBoardPosition extends BoardPosition {
        public NullBoardPosition() {
            super(A, 1);
        }

        @Override
        public boolean isNullPosition() {
            return true;
        }
    }

    /**
     * This method is responsible for providing the base functionality to calculate other things like diagonals.
     *
     * @return The position next diagonal to a square. If there is no such square, for all the squares on the column
     * "A" and raw 8, this method will return <code>null</code>.
     * <p>
     * Por instance: <code>getFrontLeftPosition(A2) --> B1</code>
     */
    public BoardPosition getFrontLeftPosition() {
        BoardColumn column = this.getColumn();
        int raw = this.getRaw();
        if (column.equals(A) || raw == 8) {
            return getNullPosition();
        }

        return new BoardPosition(BoardColumn.values()[column.getValue() - 1], raw + 1);
    }

    /**
     * This basic constructor validates the arguments are ok.
     *
     * @param column The column on the board for this square.
     * @param raw    The raw on the board for this square.
     */
    public BoardPosition(BoardColumn column, int raw) {

        if (raw > MAX_RAW || raw < 1) {
            throw new IndexOutOfBoundsException("A raw can't be greater than " + MAX_RAW + " or be less than 0");
        }

        this.column = column;
        this.raw = raw;
    }

    public boolean isValid() {
        return (this.raw > 0 && this.raw <= 8) && (this.column != null);
    }

    public boolean isNullPosition() {
        return false;
    }

    public BoardColumn getColumn() {
        return column;
    }

    public int getRaw() {
        return raw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoardPosition that = (BoardPosition) o;

        if (raw != that.raw) return false;
        return column == that.column;
    }

    @Override
    public String toString() {
        return column.name() + raw;
    }
}
