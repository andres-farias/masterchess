package cl.azulprofundo.masterchess.model.chesspieces;

public enum ChessPieceColor {

    BLACK("B"), WHITE("W");

    private String shortName;

    ChessPieceColor(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
