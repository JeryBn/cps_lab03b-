// StudentController.java - Sprint-2 (Colaborador: endpoints basicos)
package pe.edu.tecsup.lab03.controllers;
import pe.edu.tecsup.lab03.services.StudentService;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;
import java.util.Optional;

public class StudentController {
    private final StudentService service = new StudentService();

    public List<StudentEntity> listStudents() { return service.getAll(); }

    public void createStudent(StudentEntity student) {
        service.createStudent(student);
    }

    public Optional<StudentEntity> getStudentById(int id) {
        return service.getById(id);
    }

    public String healthCheck() {
        return "StudentController Sprint-2 activo - total: " + service.countStudents();
    }
}
