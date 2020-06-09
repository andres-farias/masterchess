package cl.azulprofundo.masterchess.model;

import cl.azulprofundo.masterchess.model.chesspieces.ChessPiece;

public class ChessPieceMove {

    private final ChessPiece piece;
    private final BoardPosition targetPosition;

    public ChessPieceMove(ChessPiece piece, BoardPosition targetPosition) {
        this.piece = piece;
        this.targetPosition = targetPosition;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public BoardPosition getTargetPosition() {
        return targetPosition;
    }
}
