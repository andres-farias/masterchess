package cl.azulprofundo.masterchess.repositories;

import cl.azulprofundo.masterchess.model.board.BoardState;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This class implements the CRUD operations for the ChessBoard State persistence aspect.
 */
public interface BoardStateRepository extends CrudRepository<BoardState, Long> {
    List<BoardState> findByHashName(String name);
}
