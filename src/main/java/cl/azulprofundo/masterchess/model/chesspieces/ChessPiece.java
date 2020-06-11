package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardPosition;

import java.util.List;

/**
 * The basic info that must be provided for any chess piece is its color.
 */
public abstract class ChessPiece {

    private final ChessPieceColor color;
    private BoardPosition boardPosition;

    public ChessPiece(ChessPieceColor pieceColor) {
        this(pieceColor, BoardPosition.getNullPosition());
    }

    public ChessPiece(ChessPieceColor pieceColor, BoardPosition boardPosition) {
        this.color = pieceColor;
        this.boardPosition = boardPosition;
    }

    public ChessPieceColor getColor() {
        return color;
    }

    public BoardPosition getBoardPosition() {
        return boardPosition;
    }

    public abstract List<BoardPosition> getPossiblePositionsFromMoves();

    /**
     * This method is responsible for construct the hash for this piece, which is the short name for the piece,
     * followed by the two characters that determine its position.
     *
     * @return The unique hash associated for this piece and its position.
     */
    public String getHash() {
        return getShortName() + this.color.getShortName() + this.boardPosition.toString();
    }

    /**
     * This method is responsible for defining the short name for each piece which is constructed using two
     * representative letters.
     * <p>
     * For example, the a Knight piece should return: 'KN' and the King 'KI'.
     *
     * @return The piece' short name.
     */
    protected abstract String getShortName();
}
