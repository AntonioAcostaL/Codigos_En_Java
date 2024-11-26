package Tarea231;

// Clase Principal para pruebas
public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Persona persona = new Persona("María", 30);
        Estudiante estudiante = new Estudiante("Juan", 20, "Ingeniería");

        // Uso de protected
        estudiante.mostrarInformacion();

        // Uso de private a través de método público
        persona.mostrarDetalles();

        // Acceso directo a protected (permitido porque estamos en el mismo paquete)
        System.out.println("Nombre desde protected: " + estudiante.nombre);

        // Acceso directo a private (NO PERMITIDO, descomentar para ver error)
        // System.out.println("Edad desde private: " + persona.edad); 
    }
}