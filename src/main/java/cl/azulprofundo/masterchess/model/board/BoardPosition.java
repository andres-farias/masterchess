package cl.azulprofundo.masterchess.model.board;

public class BoardPosition {

    private static final BoardPosition nullPosition = new NullBoardPosition();

    private final BoardColumnsEnum column;
    private final int raw;

    public BoardPosition(BoardColumnsEnum column, int raw) {
        this.column = column;
        this.raw = raw;
    }

    public static BoardPosition getNullPosition() {
        return nullPosition;
    }

    public boolean isValid(){
        return (this.raw > 0 && this.raw <= 8) && (this.column != null);
    }

    public boolean isNullPosition(){
        return false;
    }

    private static class NullBoardPosition extends BoardPosition {
        public NullBoardPosition() {
            super(BoardColumnsEnum.A, 1);
        }

        @Override
        public boolean isNullPosition() {
            return true;
        }
    }

    public BoardColumnsEnum getColumn() {
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
}
