package Clase321;

public class Serpiente extends ElementoInteractivo implements Movible {
    private int longitud;

    public Serpiente(String color, int posicionX, int posicionY, int longitud) {
        super(color, posicionX, posicionY);
        this.longitud = longitud;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando la serpiente en [" + posicionX + ", " + posicionY + "]");
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
}
