package fr.idmc.sid.coursesmanagement.cours2mars.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Classroom {
    @Id
    private UUID id;
    private int number;
    private int capacity;
    private int floor;
    @OneToMany
    private ArrayList<Course> courses;

    public Classroom(){

    }

    public boolean isReserved(Date date, Time time){
        for (Course c : courses) {
            if (c.getDate().equals(date) && c.getTime().equals(time)){
                return true;
            }
        }
        return false;
    }
}
