package Version2;

public class Main {
    public static void main(String[] args) {
        // Crear tres objetos Estudiante
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        // Configurar y desplegar datos de los estudiantes usando setGet
        estudiante1.setGetNombre("Ana");
        estudiante1.setGetEdad(20);
        estudiante1.setGetMatricula("A001");

        estudiante2.setGetNombre("Luis");
        estudiante2.setGetEdad(22);
        estudiante2.setGetMatricula("B002");

        estudiante3.setGetNombre("Marta");
        estudiante3.setGetEdad(21);
        estudiante3.setGetMatricula("C003");
    }
}
