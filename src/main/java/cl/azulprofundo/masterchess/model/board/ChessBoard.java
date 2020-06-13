package cl.azulprofundo.masterchess.model.board;

import cl.azulprofundo.masterchess.model.gameplay.Player;

import java.util.HashMap;

import static cl.azulprofundo.masterchess.model.gameplay.ChessColor.BLACK;
import static cl.azulprofundo.masterchess.model.gameplay.ChessColor.WHITE;

/**
 * This entity is responsible for representing a ChessBoard.
 *
 * @author Andrés Farías
 */
public class ChessBoard {

    public static final int MAX_RAW = 8;

    /**
     * The Chess White player
     */
    private Player whitePlayer;

    /**
     * The Chess White player
     */
    private Player blackPlayer;

    /**
     * The squares on the board
     */
    private HashMap<BoardColumn, HashMap<Integer, BoardPosition>> positions;

    /**
     * This constructor is responsible for instantiate all the objects related to the the chess board.
     */
    public ChessBoard() {
        this.whitePlayer = new Player(WHITE);
        this.blackPlayer = new Player(BLACK);

        this.positions = BoardPositionFactory.getAllBoardPositions();
    }

    public Player getWhitePlayer() {
        return whitePlayer;
    }

    public void setWhitePlayer(Player whitePlayer) {
        this.whitePlayer = whitePlayer;
    }

    public Player getBlackPlayer() {
        return blackPlayer;
    }

    public void setBlackPlayer(Player blackPlayer) {
        this.blackPlayer = blackPlayer;
    }

    /**
     * Return the position of the board given its coordinates.
     *
     * @param aColumn The column name of the requested position.
     * @param aRaw    The raw number of the requested position.
     * @return The position on the board.
     */
    public BoardPosition getPosition(BoardColumn aColumn, int aRaw) {
        return this.positions.get(aColumn).get(aRaw);
    }
}
