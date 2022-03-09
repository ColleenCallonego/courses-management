package fr.idmc.sid.coursesmanagement.cours9mars.entities;

import fr.idmc.sid.coursesmanagement.cours9mars.boudaries.courses.CourseResource;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.UUID;

@Entity
@Data
@ToString
public class Professor {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String subject;

    public Professor (String id, String firstname, String lastname, String subject){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
    }

    public Professor() {

    }

}
