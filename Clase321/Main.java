package Clase321;

public class Main {
    public static void main(String[] args) {
        // Crear una serpiente
        Serpiente serpiente = new Serpiente("Verde", 10, 20, 5);

        // Dibujar la serpiente
        serpiente.dibujar();

        // Mover la serpiente
        serpiente.mover(5, -3);

        // Actualizar el estado
        serpiente.actualizarEstado();

        // Detener el movimiento
        serpiente.detener();
    }
}
