// StudentController.java
package pe.edu.tecsup.lab03.controllers;
import pe.edu.tecsup.lab03.services.StudentService;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;

public class StudentController {
    private StudentService service = new StudentService();
    public List<StudentEntity> listStudents() { return service.getAll(); }
}