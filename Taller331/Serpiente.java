package Taller331;

// Clase Hija: Serpiente
public class Serpiente extends ElementoInteractivo implements Puntuable {
    private int longitud;
    private int puntajeActual;

    public Serpiente(String color, int posicionX, int posicionY, int longitud) {
        super(color, posicionX, posicionY);
        this.longitud = longitud;
        this.puntajeActual = 0; // Inicialmente, la puntuación es 0.
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando la serpiente en [" + posicionX + ", " + posicionY + "] con color " + color);
    }

    @Override
    public void actualizarEstado() {
        System.out.println("Actualizando el estado de la serpiente.");
    }

    @Override
    public int calcularPuntaje() {
        return longitud * 10; // Ejemplo: Cada segmento de longitud vale 10 puntos.
    }

    @Override
    public void actualizarPuntaje(int nuevaPuntuacion) {
        this.puntajeActual = nuevaPuntuacion;
        System.out.println("El puntaje actual es: " + puntajeActual);
    }
}
