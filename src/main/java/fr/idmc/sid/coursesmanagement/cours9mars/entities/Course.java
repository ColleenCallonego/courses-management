package fr.idmc.sid.coursesmanagement.cours9mars.entities;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@ToString
public class Course {
    @Id
    private String id;
    private String wording;
    @ManyToOne
    private Professor professor;
    @OneToMany
    private List<Student> students;

    public Course(String wording, Professor professor){
        this.id = UUID.randomUUID().toString();
        this.wording = wording;
        this.professor = professor;
        this.students = new ArrayList<Student>();
    }

    public Course() {

    }
}
