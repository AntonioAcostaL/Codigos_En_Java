package Lab331;

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

        // Mover y detener la serpiente
        serpiente.mover(3, 2);
        serpiente.detener();

        // Actualizar el estado
        serpiente.actualizarEstado();
    }
}