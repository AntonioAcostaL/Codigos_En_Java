package VersionIA;

// Clase Main
public class MainV1 {
    public static void main(String[] args) {
        // Crear objetos de Estudiante
        EstudianteV1 est1 = new EstudianteV1("Juan", 85, 5);
        EstudianteV1 est2 = new EstudianteV1("Ana", 90, 6);
        EstudianteV1 est3 = new EstudianteV1("Luis", 78, 4);

        // Mostrar información de cada estudiante
        System.out.println(est1.getNombre() + " tiene un promedio de " + est1.getPromedio() + " y cursa " + est1.getMaterias() + " materias.");
        System.out.println(est2.getNombre() + " tiene un promedio de " + est2.getPromedio() + " y cursa " + est2.getMaterias() + " materias.");
        System.out.println(est3.getNombre() + " tiene un promedio de " + est3.getPromedio() + " y cursa " + est3.getMaterias() + " materias.");

        // Modificar datos usando set
        est1.setPromedio(88);
        System.out.println("El nuevo promedio de " + est1.getNombre() + " es " + est1.getPromedio());
    }
}
