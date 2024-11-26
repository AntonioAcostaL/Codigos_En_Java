package Lab231IA;

// Clase principal para demostrar los niveles de acceso en Java
public class Persona {
    // Atributos demográficos con diferentes niveles de acceso
    public String nombre;        // Público: accesible desde cualquier lugar
    protected int edad;          // Protegido: accesible en la misma clase, paquete y herencia
    private String genero;       // Privado: accesible solo dentro de esta clase
    public String nacionalidad;  // Público: accesible desde cualquier lugar
    private double altura;       // Privado: accesible solo dentro de esta clase

    // Constructor para inicializar los valores
    public Persona(String nombre, int edad, String genero, String nacionalidad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.altura = altura;
    }

    // Método público para mostrar la información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);  // Accedemos al atributo privado dentro de la clase
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Altura: " + altura + " metros");
    }

    // Método protegido (se puede acceder desde clases hijas o dentro del mismo paquete)
    protected void correr(int distancia) {
        System.out.println(nombre + " corrió " + distancia + " metros.");
    }

    // Método privado (accesible solo dentro de esta clase)
    private void dormir(int horas) {
        System.out.println(nombre + " durmió por " + horas + " horas.");
    }

    // Método público para invocar el método privado
    public void llamarDormir(int horas) {
        dormir(horas); // Llamada al método privado desde un método público
    }
}
