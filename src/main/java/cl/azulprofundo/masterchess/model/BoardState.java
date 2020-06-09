package cl.azulprofundo.masterchess.model;

import cl.azulprofundo.masterchess.model.chesspieces.ChessPiece;

import java.util.Collection;
import java.util.List;

/**
 * This class represents the state of the chess board with a particular configuration.
 */
public class BoardState {

    /** The state of the board is defined by the pieces that are actually on it */
    private final List<ChessPiece> pieces;

    public BoardState(List<ChessPiece> pieces) {
        this.pieces = pieces;
    }

    public Collection<ChessPiece> getPieces() {
        return pieces;
    }
}
