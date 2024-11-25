package Version2;

public class Estudiante {
    // Atributos
    private String nombre;
    private int edad;
    private String matricula;

    // Método setGet para nombre
    public void setGetNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Nombre: " + this.nombre);
    }

    // Método setGet para edad
    public void setGetEdad(int edad) {
        this.edad = edad;
        System.out.println("Edad: " + this.edad);
    }

    // Método setGet para matricula
    public void setGetMatricula(String matricula) {
        this.matricula = matricula;
        System.out.println("Matricula: " + this.matricula);
    }
}
