package Tarea231;

// Clase Principal
class Persona {
    // Atributos
    protected String nombre; // Atributo protected
    private int edad; // Atributo private

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos
    protected void mostrarNombre() { // Método protected
        System.out.println("Nombre: " + nombre);
    }

    private void mostrarEdad() { // Método private
        System.out.println("Edad: " + edad);
    }

    // Método público para acceder al método privado
    public void mostrarDetalles() {
        mostrarEdad(); // Invoca al método privado dentro de la clase
    }
}

// Clase Hija para demostrar protected
class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public void mostrarInformacion() {
        // Puede acceder a atributos y métodos protected de la clase base
        mostrarNombre();
        System.out.println("Carrera: " + carrera);
    }
}