package fr.idmc.sid.coursesmanagement.cours2mars.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Person {
    @Id
    private UUID id;
    private String name;
    private String firstname;

    public Person(String name, String firstname) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.firstname = firstname;
    }

    public Person() {

    }
}
