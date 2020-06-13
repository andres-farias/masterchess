package cl.azulprofundo.masterchess.model.chesspieces;

import cl.azulprofundo.masterchess.model.board.BoardColumn;
import cl.azulprofundo.masterchess.model.board.BoardPosition;
import cl.azulprofundo.masterchess.model.gameplay.ChessColor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static cl.azulprofundo.masterchess.model.board.BoardColumn.*;

public class Knight extends ChessPiece {

    public Knight(ChessColor pieceColor) {
        super(pieceColor);
    }

    public Knight(ChessColor pieceColor, BoardPosition boardPosition) {
        super(pieceColor, boardPosition);
    }

    /**
     * There are a maximum of 8 possible moves.
     *
     * @return The list of positions on the board towards which this piece can move to.
     */
    @Override
    public List<BoardPosition> getPossiblePositionsFromMoves() {

        BoardPosition[] boardPositions = {getFrontLeftJump(), getFrontRightJump(), getBackLeftJump(),
                getBackRightJump(), getLeftUpJump(), getLeftDownJump(), getRightUpJump(), getRightDownJump()};
        List<BoardPosition> positions = new ArrayList<>(Arrays.asList(boardPositions));
        positions.removeIf(BoardPosition::isNullPosition);

        return positions;
    }

    /**
     * This method is responsible for returning a specific Knight move: Left Up Jump.
     *
     * @return The left up jump <code>{@link BoardPosition}</code> of this horse or a
     * <code>{@link cl.azulprofundo.masterchess.model.board.BoardPosition.NullBoardPosition}</code>. instance.
     */
    protected BoardPosition getLeftUpJump() {
        BoardPosition currentPosition = this.getBoardPosition();
        try {
            return new BoardPosition(currentPosition.getColumn().prev().prev(), currentPosition.getRaw() + 1);
        } catch (IndexOutOfBoundsException iof) {
            return BoardPosition.getNullPosition();
        }
    }
    /**
     * This method is responsible for returning a specific Knight move: Left Down Jump.
     *
     * @return The left down jump <code>{@link BoardPosition}</code> of this horse or a
     * <code>{@link cl.azulprofundo.masterchess.model.board.BoardPosition.NullBoardPosition}</code>. instance.
     */
    protected BoardPosition getLeftDownJump() {
        BoardPosition currentPosition = this.getBoardPosition();
        try {
            return new BoardPosition(currentPosition.getColumn().prev().prev(), currentPosition.getRaw() - 1);
        } catch (IndexOutOfBoundsException iof) {
            return BoardPosition.getNullPosition();
        }
    }

    /**
     * This method is responsible for returning a specific Knight move: Right Up Jump.
     *
     * @return The left up jump <code>{@link BoardPosition}</code> of this horse or a
     * <code>{@link cl.azulprofundo.masterchess.model.board.BoardPosition.NullBoardPosition}</code>. instance.
     */
    protected BoardPosition getRightUpJump() {
        BoardPosition currentPosition = this.getBoardPosition();
        try {
            return new BoardPosition(currentPosition.getColumn().next().next(), currentPosition.getRaw() + 1);
        } catch (IndexOutOfBoundsException iof) {
            return BoardPosition.getNullPosition();
        }
    }
    /**
     * This method is responsible for returning a specific Knight move: Right Down Jump.
     *
     * @return The left down jump <code>{@link BoardPosition}</code> of this horse or a
     * <code>{@link cl.azulprofundo.masterchess.model.board.BoardPosition.NullBoardPosition}</code>. instance.
     */
    protected BoardPosition getRightDownJump() {
        BoardPosition currentPosition = this.getBoardPosition();
        try {
            return new BoardPosition(currentPosition.getColumn().next().next(), currentPosition.getRaw() - 1);
        } catch (IndexOutOfBoundsException iof) {
            return BoardPosition.getNullPosition();
        }
    }

    /**
     * This method is responsible for returning a specific Knight move: Front Right Jump.
     *
     * @return The front right jump <code>{@link BoardPosition}</code> of this horse or a
     * <code>{@link cl.azulprofundo.masterchess.model.board.BoardPosition.NullBoardPosition}</code>. instance.
     */
    protected BoardPosition getFrontRightJump() {
        BoardPosition currentPosition = this.getBoardPosition();
        try {
            return new BoardPosition(currentPosition.getColumn().next(), currentPosition.getRaw() + 2);
        } catch (IndexOutOfBoundsException iof) {
            return BoardPosition.getNullPosition();
        }
    }

    /**
     * This method is responsible for returning a specific Knight move: Front Left Jump.
     *
     * @return The front left jump <code>{@link BoardPosition}</code> of this horse or a
     * <code>{@link cl.azulprofundo.masterchess.model.board.BoardPosition.NullBoardPosition}</code>. instance.
     */
    protected BoardPosition getFrontLeftJump() {
        BoardPosition currentPosition = this.getBoardPosition();
        try {
            return new BoardPosition(currentPosition.getColumn().prev(), currentPosition.getRaw() + 2);
        } catch (IndexOutOfBoundsException iof) {
            return BoardPosition.getNullPosition();
        }
    }

    /**
     * This method is responsible for returning a specific Knight move: Back Right Jump.
     *
     * @return The front right jump <code>{@link BoardPosition}</code> of this horse or a
     * <code>{@link cl.azulprofundo.masterchess.model.board.BoardPosition.NullBoardPosition}</code>. instance.
     */
    protected BoardPosition getBackRightJump() {
        BoardPosition currentPosition = this.getBoardPosition();
        try {
            return new BoardPosition(currentPosition.getColumn().next(), currentPosition.getRaw() - 2);
        } catch (IndexOutOfBoundsException iof) {
            return BoardPosition.getNullPosition();
        }
    }

    /**
     * This method is responsible for returning a specific Knight move: Front Left Jump.
     *
     * @return The front left jump <code>{@link BoardPosition}</code> of this horse or a
     * <code>{@link cl.azulprofundo.masterchess.model.board.BoardPosition.NullBoardPosition}</code>. instance.
     */
    public BoardPosition getBackLeftJump() {
        BoardPosition currentPosition = this.getBoardPosition();
        try {
            return new BoardPosition(currentPosition.getColumn().prev(), currentPosition.getRaw() - 2);
        } catch (IndexOutOfBoundsException iof) {
            return BoardPosition.getNullPosition();
        }
    }

    @Override
    protected String getShortName() {
        return "KN";
    }
}
