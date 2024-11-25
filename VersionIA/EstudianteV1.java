package VersionIA;

// Clase Estudiante
public class EstudianteV1 {
    private String nombre;
    private int promedio;
    private int materias;

    // Constructor
    public EstudianteV1(String nombre, int promedio, int materias) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.materias = materias;
    }

    // Métodos get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para promedio
    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    // Métodos get y set para materias
    public int getMaterias() {
        return materias;
    }

    public void setMaterias(int materias) {
        this.materias = materias;
    }
}

