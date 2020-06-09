package cl.azulprofundo.masterchess.workers;

import cl.azulprofundo.masterchess.model.board.BoardState;

/**
 * This class is responsible for analysing a specific board state.
 */
public class Analyzer {

    public boolean isGameOver(BoardState boardState){
        return (boardState.getPossibleMoves().isEmpty());
    }
}
