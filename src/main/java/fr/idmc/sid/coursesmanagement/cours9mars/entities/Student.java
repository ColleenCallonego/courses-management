package fr.idmc.sid.coursesmanagement.cours9mars.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
public class Student {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String level;
    @OneToMany
    private List<Course> courses;

    public Student (String firstname, String lastname, String level){
        this.id = UUID.randomUUID().toString();
        this.firstname = firstname;
        this.lastname = lastname;
        this.level = level;
        this.courses = new ArrayList<Course>();
    }

    public Student() {

    }
}
