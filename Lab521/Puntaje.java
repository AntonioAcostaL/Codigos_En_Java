package Lab521;

public class Puntaje {
    private int puntuacion;

    public Puntaje() {
        this.puntuacion = 0;
    }

    // Método sincronizado para incrementar el puntaje
    public synchronized void incrementarPuntaje(int puntos) {
        this.puntuacion += puntos;
    }

    public synchronized int obtenerPuntaje() {
        return puntuacion;
    }
}
