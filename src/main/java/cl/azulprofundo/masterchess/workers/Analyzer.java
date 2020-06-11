package cl.azulprofundo.masterchess.workers;

import cl.azulprofundo.masterchess.gameplay.GameStarter;
import cl.azulprofundo.masterchess.model.board.BoardState;
import cl.azulprofundo.masterchess.repositories.BoardStateRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * This class is responsible for analysing a specific board state.
 */
@Component
public class Analyzer {

    @Bean
    public CommandLineRunner chessAnalyzer(BoardStateRepository repository) {
        return (args) -> {
            System.out.println("CHESS ANALYZER");
            BoardState startingBoard = GameStarter.getStartingBoard();

            // repository.save(startingBoard);
            System.out.println("BoardState: " + startingBoard.getHashName());
            System.out.println();
            System.out.println("FIND ALL STATES");
            for (BoardState test: repository.findAll()){
                System.out.println(test.toString());
            }
        };
    }
    public boolean isGameOver(BoardState boardState){
        return (boardState.getPossibleMoves().isEmpty());
    }
}
