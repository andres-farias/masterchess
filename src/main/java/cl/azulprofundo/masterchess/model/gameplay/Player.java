package cl.azulprofundo.masterchess.model.gameplay;

/**
 * This class represents the player of a chess game.
 * @author Andrés Farías
 */
public class Player {

    /** The player's color */
    private ChessColor color;

    public Player(ChessColor color) {
        this.color = color;
    }

    public ChessColor getColor() {
        return color;
    }
}
