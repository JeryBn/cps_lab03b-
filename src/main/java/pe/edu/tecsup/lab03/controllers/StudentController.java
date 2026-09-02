// StudentController.java - Sprint-2 (Responsable: validacion y endpoints adicionales)
package pe.edu.tecsup.lab03.controllers;
import pe.edu.tecsup.lab03.services.StudentService;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;

public class StudentController {
    private final StudentService service = new StudentService();

    public List<StudentEntity> listStudents() { return service.getAll(); }

    public boolean deleteStudent(int id) {
        return service.getAll().removeIf(s -> s.getId() == id);
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
        return "Modificado por Responsable - Sprint-2";
    }
}
