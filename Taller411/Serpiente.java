package Taller411;

// Clase Hija: Serpiente
public class Serpiente extends ElementoInteractivo {
    private int longitud;

    public Serpiente(int posicionX, int posicionY, int longitud) {
        super(posicionX, posicionY);
        this.longitud = longitud;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando la serpiente en [" + posicionX + ", " + posicionY + "]");
    }

    @Override
    public void actualizarEstado() {
        System.out.println("La serpiente crece a longitud " + longitud);
    }

    public void mover(int deltaX, int deltaY) {
        posicionX += deltaX;
        posicionY += deltaY;
        System.out.println("Moviendo la serpiente a [" + posicionX + ", " + posicionY + "]");
    }
}