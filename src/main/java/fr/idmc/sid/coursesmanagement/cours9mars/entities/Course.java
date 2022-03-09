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
public class Course {
    @Id
    private UUID id;
    private String wording;
    @ManyToOne
    private Professor professor;
    @OneToMany
    private ArrayList<Student> students;

}
