// StudentRepository.java
package pe.edu.tecsup.lab03.repositories;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private List<StudentEntity> students = new ArrayList<>();
    public List<StudentEntity> findAll() { return students; }
}