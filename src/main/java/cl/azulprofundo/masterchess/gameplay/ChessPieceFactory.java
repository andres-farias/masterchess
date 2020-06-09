package cl.azulprofundo.masterchess.gameplay;

import cl.azulprofundo.masterchess.model.chesspieces.ChessPieceColor;
import cl.azulprofundo.masterchess.model.chesspieces.*;

import java.util.ArrayList;
import java.util.List;

import static cl.azulprofundo.masterchess.model.chesspieces.ChessPieceColor.BLACK;
import static cl.azulprofundo.masterchess.model.chesspieces.ChessPieceColor.WHITE;

/**
 * This class manages the pieces of a game (instantiating the few 16x2 pieces).
 */
public class ChessPieceFactory {

    /**
     * This method creates a list of all the pieces that are necessary to start a chess game, without setting them a
     * specific position.
     *
     * @return A list of all the chess pieces.
     */
    public static List<ChessPiece> getAllPieces() {

        List<ChessPiece> pieces = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(WHITE));
            pieces.add(new Pawn(BLACK));
        }

        for (int i = 0; i < 2; i++) {
            pieces.add(new Rock(WHITE));
            pieces.add(new Rock(BLACK));

            pieces.add(new Knight(WHITE));
            pieces.add(new Knight(BLACK));

            pieces.add(new Bishop(WHITE));
            pieces.add(new Bishop(BLACK));
        }

        for (ChessPieceColor color : ChessPieceColor.values()) {
            pieces.add(new Queen(color));
            pieces.add(new King(color));
        }

        return pieces;
    }
}
