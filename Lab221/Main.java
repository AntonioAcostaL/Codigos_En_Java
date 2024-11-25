package Lab221;

public class Main {
    public static void main(String[] args) {
        // Crear tres objetos de tipo Persona
        Persona persona1 = new Persona("María", 25, "Femenino", 1.65, 60);
        Persona persona2 = new Persona("Juan", 30, "Masculino", 1.75, 75);
        Persona persona3 = new Persona("Ana", 22, "Femenino", 1.60, 55);

        // Mostrar información de cada persona
        System.out.println("Datos de María:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Género: " + persona1.getGenero());
        System.out.println("Altura: " + persona1.getAltura());
        System.out.println("Peso: " + persona1.getPeso());

        System.out.println("\nDatos de Juan:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Género: " + persona2.getGenero());
        System.out.println("Altura: " + persona2.getAltura());
        System.out.println("Peso: " + persona2.getPeso());

        System.out.println("\nDatos de Ana:");
        System.out.println("Nombre: " + persona3.getNombre());
        System.out.println("Edad: " + persona3.getEdad());
        System.out.println("Género: " + persona3.getGenero());
        System.out.println("Altura: " + persona3.getAltura());
        System.out.println("Peso: " + persona3.getPeso());

        // Invocar métodos personalizados
        System.out.println("\nActividades de María:");
        Persona.comer("Ensalada");
        persona1.dormir(7);
        persona1.hacerEjercicio("Yoga", 30);

        System.out.println("\nActividades de Juan:");
        Persona.comer("Pizza");
        persona2.dormir(8);
        persona2.hacerEjercicio("Correr", 45);

        System.out.println("\nActividades de Ana:");
        Persona.comer("Fruta");
        persona3.dormir(6);
        persona3.hacerEjercicio("Natación", 60);
    }
}
