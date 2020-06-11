package cl.azulprofundo.masterchess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersistenceTestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public PersistenceTestEntity() {
    }

    public PersistenceTestEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.name + "; ID=" + this.id;
    }
}
