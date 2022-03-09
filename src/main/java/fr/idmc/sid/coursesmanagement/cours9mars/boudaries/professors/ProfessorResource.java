package fr.idmc.sid.coursesmanagement.cours9mars.boudaries.professors;

import fr.idmc.sid.coursesmanagement.cours9mars.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorResource extends JpaRepository<Professor, String> {
}
