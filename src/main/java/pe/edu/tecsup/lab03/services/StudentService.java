// StudentService.java
package pe.edu.tecsup.lab03.services;
import pe.edu.tecsup.lab03.repositories.StudentRepository;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.List;

public class StudentService {
    private StudentRepository repo = new StudentRepository();
    public List<StudentEntity> getAll() { return repo.findAll(); }
}