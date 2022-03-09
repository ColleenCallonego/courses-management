package fr.idmc.sid.coursesmanagement.cours2mars.entities;

import fr.idmc.sid.coursesmanagement.cours2mars.entities.Classroom;
import fr.idmc.sid.coursesmanagement.cours2mars.entities.Course;
import fr.idmc.sid.coursesmanagement.cours2mars.entities.Person;
import lombok.Data;

import javax.persistence.Entity;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
public class Professor extends Person {
    private String schoolteaching;

    public Professor(String name, String firstname, String schoolteaching){
        super(name, firstname);
        this.schoolteaching = schoolteaching;
    }

    public Professor() {

    }

    public boolean addCourse(String label, Date date, Time time, Classroom classroom){
        if (bookClassroom(date, time, classroom)){
            new Course(label, date, time, classroom);
            return true;
        }
        return false;
    }

    public boolean bookClassroom(Date date, Time time, Classroom classroom){
        return classroom.isReserved(date, time);
    }
}
