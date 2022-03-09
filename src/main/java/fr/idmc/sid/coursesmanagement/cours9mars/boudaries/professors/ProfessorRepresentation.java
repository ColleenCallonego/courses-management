package fr.idmc.sid.coursesmanagement.cours9mars.boudaries.professors;

import fr.idmc.sid.coursesmanagement.cours9mars.boudaries.courses.CourseResource;
import fr.idmc.sid.coursesmanagement.cours9mars.entities.Course;
import fr.idmc.sid.coursesmanagement.cours9mars.entities.Professor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "professor", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProfessorRepresentation {

    private final ProfessorResource pr;
    private final CourseResource cr;

    public ProfessorRepresentation(ProfessorResource pr, CourseResource cr){
        this.pr = pr;
        this.cr = cr;
    }

    @GetMapping({"{idProfessor}/{wording}"})
    public ResponseEntity<?> getAllStudents(@PathVariable("idProfessor") String idProfessor, @PathVariable("wording") String wording) {
        Optional<Professor> opt = pr.findById(idProfessor);
        if (opt.isPresent()){
            Professor p = opt.get();
            Optional<Course> optCourse = cr.findByWording(wording);
            if (optCourse.isPresent()) {
                Course c = optCourse.get();
                return ResponseEntity.ok(c.getStudents().toString());
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
