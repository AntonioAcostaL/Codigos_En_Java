package Lab231;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan");
        estudiante.setEdad(21);
        estudiante.setGenero("Masculino");
        estudiante.setNacionalidad("Mexicana");
        estudiante.setEstadoCivil("Soltero");
        estudiante.setMatricula("A12345");
        estudiante.setCarrera("Ingeniería");

        // Usando métodos
        estudiante.comer("Pizza");
        estudiante.dormir(8);
        estudiante.estudiar("Matemáticas");

        // Mostrando información usando método protected
        estudiante.informacion();
    }
}
