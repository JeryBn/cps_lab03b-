// StudentService.java - Sprint-2 (Colaborador: logica de negocio)
package pe.edu.tecsup.lab03.services;
import pe.edu.tecsup.lab03.repositories.StudentRepository;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;
import java.util.Optional;

public class StudentService {
    private StudentRepository repo = new StudentRepository();

    public List<StudentEntity> getAll() { return repo.findAll(); }

    public void createStudent(StudentEntity student) {
        if (student.getName() == null || student.getName().isEmpty()) {
            throw new IllegalArgumentException("Nombre requerido");
        }
        repo.save(student);
    }

    public Optional<StudentEntity> getById(int id) {
        return repo.findById(id);
    }

    public boolean deleteStudent(int id) {
        return repo.deleteById(id);
    }

    public long countStudents() { return repo.count(); }
}
