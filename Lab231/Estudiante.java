package Lab231;

public class Estudiante extends Persona {
    private String matricula;
    private String carrera;

    // Métodos set y get para matricula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    // Métodos set y get para carrera
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    // Método específico de Estudiante
    public void estudiar(String materia) {
        System.out.println("Estudiando: " + materia);
    }
}
