package Lab311;

// Clase Principal para pruebas
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase padre
        ElementoInteractivo elemento = new ElementoInteractivo("Rojo", 10, 20);
        elemento.mostrar();

        // Crear un objeto de la clase hija
        NumeroInteractivo numero = new NumeroInteractivo("Azul", 5, 15, 10);
        numero.mostrar();
        numero.actualizarPuntaje(5);

        // Leer y modificar atributos
        System.out.println("Color inicial: " + numero.getColor());
        numero.setColor("Verde");
        System.out.println("Nuevo color: " + numero.getColor());
    }
}
