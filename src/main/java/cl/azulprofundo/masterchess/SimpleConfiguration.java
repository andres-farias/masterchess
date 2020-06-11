package cl.azulprofundo.masterchess;

import cl.azulprofundo.masterchess.model.PersistenceTestEntity;
import cl.azulprofundo.masterchess.model.RepositoryTest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(SimpleConfiguration.class, args);
    }

    @Bean
    public CommandLineRunner demo(RepositoryTest repository) {
        return (args) -> {
            repository.save(new PersistenceTestEntity("Largo Winch"));
            repository.save(new PersistenceTestEntity("Elisa Winch"));
            repository.save(new PersistenceTestEntity("Eliana Winch"));

            System.out.println("FIND ALL");
            for (PersistenceTestEntity test: repository.findAll()){
                System.out.println(test.toString());
            }
        };
    }

}