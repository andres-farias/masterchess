package cl.azulprofundo.masterchess.model;

public class BoardPosition {
    private static final BoardPosition nullPosition = new NullBoardPosition();
    private BoardColumnsEnum column;
    private int raw;

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
}
