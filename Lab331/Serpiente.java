package Lab331;

// Clase Hija: Serpiente
public class Serpiente extends ElementoInteractivo implements Movible, Puntuable {
    private int longitud;
    private int puntajeActual;

    public Serpiente(String color, int posicionX, int posicionY, int longitud) {
        super(color, posicionX, posicionY);
        this.longitud = longitud;
        this.puntajeActual = 0;
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
    public void mover(int deltaX, int deltaY) {
        posicionX += deltaX;
        posicionY += deltaY;
        System.out.println("Moviendo la serpiente a [" + posicionX + ", " + posicionY + "]");
    }

    @Override
    public void detener() {
        System.out.println("La serpiente ha detenido su movimiento.");
    }

    @Override
    public int calcularPuntaje() {
        return longitud * 10; // Cada segmento vale 10 puntos.
    }

    @Override
    public void actualizarPuntaje(int nuevaPuntuacion) {
        this.puntajeActual = nuevaPuntuacion;
        System.out.println("El puntaje actual es: " + puntajeActual);
    }
}