package fr.idmc.sid.coursesmanagement.cours9mars.boudaries.courses;

import fr.idmc.sid.coursesmanagement.cours9mars.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseResource extends JpaRepository<Course, String> {
    Optional<Course> findByWording(String wording);
}
