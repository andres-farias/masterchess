package cl.azulprofundo.masterchess.repositories;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryTest extends CrudRepository<PersistenceTestEntity, Long> {

    List<PersistenceTestEntity> findByName(String name);

    PersistenceTestEntity findById(long id);
}
