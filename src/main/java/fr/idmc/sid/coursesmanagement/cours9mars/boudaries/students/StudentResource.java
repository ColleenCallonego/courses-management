package fr.idmc.sid.coursesmanagement.cours9mars.boudaries.students;

import fr.idmc.sid.coursesmanagement.cours9mars.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentResource extends JpaRepository<Student, String> {
}
