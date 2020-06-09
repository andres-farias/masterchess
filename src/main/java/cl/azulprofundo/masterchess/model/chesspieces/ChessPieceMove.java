package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;

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
