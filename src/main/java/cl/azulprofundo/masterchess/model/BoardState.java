package cl.azulprofundo.masterchess.model;

import cl.azulprofundo.masterchess.model.chesspieces.ChessPiece;
import cl.azulprofundo.masterchess.model.exceptions.EmptyBoardPositionException;

import java.util.*;

/**
 * This class represents the state of the chess board with a particular configuration.
 */
public class BoardState {

    /**
     * The state of the board is defined by the pieces that are actually on it
     */
    private final List<ChessPiece> pieces;

    public BoardState(List<ChessPiece> pieces) {
        this.pieces = pieces;
    }

    public Collection<ChessPiece> getPieces() {
        return pieces;
    }

    /**
     * This method is responsible for returning a collection of moves that can legally be performed from this board
     * state.
     *
     * @return A collection of moves that are possible on this specific board configuration.
     */
    public Collection<ChessPieceMove> getPossibleMoves() {

        ArrayList<ChessPieceMove> moves = new ArrayList<>();
        for (ChessPiece piece : pieces) {
            List<BoardPosition> positions = piece.getPossiblePositionsFromMoves();

            for (BoardPosition position : positions) {
                ChessPieceMove chessPieceMove = new ChessPieceMove(piece, position);
                if (isValidMove(chessPieceMove)) {
                    moves.add(chessPieceMove);
                }
            }
        }

        return moves;
    }

    /**
     * This method is responsible for determining if a given move is valid on this configuration.
     *
     * @param chessPieceMove The move subject to validation.
     * @return <code>true</code> if the move is valid and <code>false</code> otherwise.
     */
    private boolean isValidMove(ChessPieceMove chessPieceMove) {

        BoardPosition destination = chessPieceMove.getTargetPosition();
        if (isEmpty(destination)) {
            return true;
        }

        ChessPiece pieceAtDestination;
        try {
            pieceAtDestination = getPieceAt(destination);
        } catch (EmptyBoardPositionException e) {
            e.printStackTrace();
            throw new RuntimeException("Impossible Situation!", e);
        }

        return !pieceAtDestination.getColor().equals(chessPieceMove.getPiece().getColor());
    }

    private ChessPiece getPieceAt(BoardPosition destination) throws EmptyBoardPositionException {

        for (ChessPiece piece : pieces) {
            if (piece.getBoardPosition().equals(destination)) {
                return piece;
            }
        }

        throw new EmptyBoardPositionException();
    }

    boolean isEmpty(BoardPosition position) {

        for (ChessPiece piece : pieces) {
            if (piece.getBoardPosition().equals(position)) {
                return false;
            }
        }

        return true;
    }
}
