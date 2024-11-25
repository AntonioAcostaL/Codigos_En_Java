package VersionIA;

// Clase Estudiante
public class EstudianteV2 {
    private String nombre;
    private int promedio;
    private int materias;

    // Constructor
    public EstudianteV2(String nombre, int promedio, int materias) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.materias = materias;
    }

    // Método único para set y get de nombre
    public String setGetNombre(String nuevoNombre) {
        if (nuevoNombre != null) {
            this.nombre = nuevoNombre;
        }
        return this.nombre;
    }

    // Método único para set y get de promedio
    public int setGetPromedio(Integer nuevoPromedio) {
        if (nuevoPromedio != null) {
            this.promedio = nuevoPromedio;
        }
        return this.promedio;
    }

    // Método único para set y get de materias
    public int setGetMaterias(Integer nuevasMaterias) {
        if (nuevasMaterias != null) {
            this.materias = nuevasMaterias;
        }
        return this.materias;
    }
}
