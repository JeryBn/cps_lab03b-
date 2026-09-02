// StudentEntity.java - Sprint-2 (Colaborador: mejoras entidad)
package pe.edu.tecsup.lab03.entities;

public class StudentEntity {
    private int id;
    private String name;
    private String email;
    private String carrera;

    public StudentEntity() {}

    public StudentEntity(int id, String name, String email, String carrera) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.carrera = carrera;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    @Override
    public String toString() {
        return "StudentEntity{id=" + id + ", name='" + name + "', email='" + email + "', carrera='" + carrera + "'}";
    }
}
