package fr.idmc.sid.coursesmanagement.cours2mars.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Course {
    @Id
    private UUID id;
    private String label;
    private Date date;
    private Time time;
    @OneToMany
    private ArrayList<Student> students;
    @ManyToOne
    private Classroom classroom;


    public Course(String label, Date date, Time time, Classroom classroom) {
        this.label = label;
        this.date = date;
        this.time = time;
        this.classroom = classroom;
    }

    public Course() {

    }
}
