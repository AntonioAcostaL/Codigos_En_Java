package VersionIA;

// Clase Main
public class MainV2 {
    public static void main(String[] args) {
        // Crear objetos de Estudiante
        EstudianteV2 est1 = new EstudianteV2("Juan", 85, 5);
        EstudianteV2 est2 = new EstudianteV2("Ana", 90, 6);
        EstudianteV2 est3 = new EstudianteV2("Luis", 78, 4);

        // Utilizar el método setGet
        System.out.println(est1.setGetNombre(null) + " tiene un promedio de " + est1.setGetPromedio(null) + " y cursa " + est1.setGetMaterias(null) + " materias.");
        System.out.println(est2.setGetNombre(null) + " tiene un promedio de " + est2.setGetPromedio(null) + " y cursa " + est2.setGetMaterias(null) + " materias.");
        System.out.println(est3.setGetNombre(null) + " tiene un promedio de " + est3.setGetPromedio(null) + " y cursa " + est3.setGetMaterias(null) + " materias.");

        // Modificar datos usando setGet
        est1.setGetPromedio(88);
        System.out.println("El nuevo promedio de " + est1.setGetNombre(null) + " es " + est1.setGetPromedio(null));
    }
}