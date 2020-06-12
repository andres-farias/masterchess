package cl.azulprofundo.masterchess.workers;

import cl.azulprofundo.masterchess.model.gameplay.GameStarter;
import cl.azulprofundo.masterchess.model.board.BoardState;
import cl.azulprofundo.masterchess.repositories.BoardStateRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * This class is responsible for analysing a specific board state.
 */
@Component
public class Analyzer {

    private static final Logger logger = LoggerFactory.getLogger(Analyzer.class);

    @Bean
    public CommandLineRunner chessAnalyzer(BoardStateRepository repository) {
        return (args) -> {
            BoardState startingBoard = GameStarter.getStartingBoard();
            logger.info("BoardState: {}", startingBoard.getHashName());

            repository.save(startingBoard);
            logger.debug("BoardState persisted");
        };
    }
    public boolean isGameOver(BoardState boardState){
        return (boardState.getPossibleMoves().isEmpty());
    }
}
