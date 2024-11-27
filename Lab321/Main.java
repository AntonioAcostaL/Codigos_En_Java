package Lab321;

// Clase Principal para Pruebas
public class Main {
    public static void main(String[] args) {
        // Crear una serpiente
        Serpiente serpiente = new Serpiente("Verde", 10, 20, 5);

        // Usar los métodos
        serpiente.dibujar();
        serpiente.mover(3, 2);
        serpiente.actualizarEstado();
        serpiente.detener();
    }
}