package fr.idmc.sid.coursesmanagement.cours9mars.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.UUID;

@Entity
@Data
@ToString
public class Student {
    @Id
    private UUID id;
    private String firstname;
    private String lastname;
    private String level;
    @OneToMany
    private ArrayList<Course> courses;
}
