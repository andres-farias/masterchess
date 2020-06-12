package cl.azulprofundo.masterchess.model.gameplay;

/**
 * This enumeration represents the two existing colors on the Chess, which applies to chess pieces, players, and chess
 * squares.
 *
 * @author Andrés Farías
 */
public enum ChessColor {

    BLACK("B"), WHITE("W");

    private final String shortName;

    ChessColor(String shortName) {
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
