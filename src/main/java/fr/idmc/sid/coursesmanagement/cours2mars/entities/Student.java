package fr.idmc.sid.coursesmanagement.cours2mars.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
@Data
public class Student extends Person {
    private String promotion;

    public Student(String name, String firstname, String promotion){
        super(name, firstname);
        this.promotion = promotion;
    }

    public Student() {

    }

    public void courseRegistration(Course course){
        ArrayList<Student> list = course.getStudents();
        list.add(this);
        course.setStudents(list);
    }
}
