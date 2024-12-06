package Lab521; 

public class Juego {
    private Puntaje puntaje;
    private Serpiente serpiente;

    public Juego() {
        this.puntaje = new Puntaje();
        this.serpiente = new Serpiente(0, 0, 1);
    }

    public void iniciarJuego() {
        System.out.println("¡El juego ha comenzado!");
        serpiente.iniciarHilo(); // Inicia el hilo de movimiento de la serpiente
    }

    public void detenerJuego() {
        System.out.println("¡Juego terminado!");
        serpiente.detenerHilo(); // Detiene el hilo de la serpiente
    }

    public static void main(String[] args) {
        // Crear un objeto Juego y empezar el juego
        Juego juego = new Juego();
        juego.iniciarJuego();

        // Simulación de incrementar el puntaje
        try {
            Thread.sleep(5000); // El juego corre por 5 segundos
            juego.puntaje.incrementarPuntaje(10);
            System.out.println("Puntaje actual: " + juego.puntaje.obtenerPuntaje());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Detenemos el juego
        juego.detenerJuego();
    }
}
