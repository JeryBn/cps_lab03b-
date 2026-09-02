// StudentRepository.java - Sprint-2 (Colaborador: metodos CRUD)
package pe.edu.tecsup.lab03.repositories;
import pe.edu.tecsup.lab03.entities.StudentEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {
    private List<StudentEntity> students = new ArrayList<>();

    public List<StudentEntity> findAll() { return students; }

    public void save(StudentEntity student) {
        students.add(student);
    }

    public Optional<StudentEntity> findById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst();
    }

    public boolean deleteById(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

    public long count() { return students.size(); }
}
