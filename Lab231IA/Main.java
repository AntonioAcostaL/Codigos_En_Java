package Lab231IA;

// Clase principal para probar los niveles de acceso
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Persona
        Persona persona = new Persona("Ana López", 25, "Femenino", "Mexicana", 1.65);

        // Mostrar los atributos públicos y privados a través de un método público
        System.out.println("Datos de la persona:");
        persona.mostrarInformacion();

        // Invocar un método protegido
        System.out.println("\nInvocando método protegido:");
        persona.correr(500); // Método protegido, accesible desde la clase principal porque está en el mismo paquete

        // Invocar un método privado a través de un método público
        System.out.println("\nInvocando método privado:");
        persona.llamarDormir(8); // Método público que llama al método privado
    }
}
