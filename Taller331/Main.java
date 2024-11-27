package Taller331;

// Clase Principal para Pruebas
public class Main {
    public static void main(String[] args) {
        // Crear una serpiente
        Serpiente serpiente = new Serpiente("Verde", 10, 20, 5);

        // Dibujar la serpiente
        serpiente.dibujar();

        // Calcular y actualizar el puntaje
        int puntaje = serpiente.calcularPuntaje();
        serpiente.actualizarPuntaje(puntaje);

        // Actualizar el estado
        serpiente.actualizarEstado();
    }
}