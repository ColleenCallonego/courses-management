INSERT INTO professor (id, firstname, lastname, subject) VALUES
    ('1', 'essai','essai', 'maths');

INSERT INTO student (id, firstname, lastname, level) VALUES
    ('2', 'colleen','callonego', 'M2');

INSERT INTO student (id, firstname, lastname, level) VALUES
    ('3', 'gabriel','couroux', 'M2');

INSERT INTO course (id, wording, professor_id) VALUES
    ('4', 'suites','1');

INSERT INTO course_students (course_id, students_id) VALUES
    ('4', '2');

INSERT INTO course_students (course_id, students_id) VALUES
    ('4', '3');