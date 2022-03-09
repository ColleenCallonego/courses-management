package fr.idmc.sid.coursesmanagement.cours9mars;

import fr.idmc.sid.coursesmanagement.cours9mars.boudaries.courses.CourseResource;
import fr.idmc.sid.coursesmanagement.cours9mars.boudaries.professors.ProfessorResource;
import fr.idmc.sid.coursesmanagement.cours9mars.boudaries.students.StudentResource;
import fr.idmc.sid.coursesmanagement.cours9mars.entities.Course;
import fr.idmc.sid.coursesmanagement.cours9mars.entities.Professor;
import fr.idmc.sid.coursesmanagement.cours9mars.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class CoursesManagementApplication {

	public static void main(String[] args) {
		// pour tester : http://localhost:8082/professor/1/suites
		SpringApplication.run(CoursesManagementApplication.class, args);
	}

}
