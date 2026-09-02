// StudentController.java - Sprint-2 (Merge Colaborador + Responsable)
package pe.edu.tecsup.lab03.controllers;
import pe.edu.tecsup.lab03.services.StudentService;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;
import java.util.Optional;

public class StudentController {
    private final StudentService service = new StudentService();

    public List<StudentEntity> listStudents() { return service.getAll(); }

    // Colaborador: CRUD basico
    public void createStudent(StudentEntity student) {
        service.createStudent(student);
    }

    public Optional<StudentEntity> getStudentById(int id) {
        return service.getById(id);
    }

    public String healthCheck() {
        return "StudentController Sprint-2 activo - total: " + service.countStudents();
    }

    // Responsable: validacion y endpoints adicionales
    public boolean deleteStudent(int id) {
        return service.deleteStudent(id);
    }

    public String updateStudent(int id, String newName) {
        for (StudentEntity s : service.getAll()) {
            if (s.getId() == id) {
                s.setName(newName);
                return "Actualizado: " + s.getName();
            }
        }
        return "No encontrado";
    }

    public String infoResponsable() {
        return "Modificado por Responsable - Sprint-2 - Merge OK";
    }
}
