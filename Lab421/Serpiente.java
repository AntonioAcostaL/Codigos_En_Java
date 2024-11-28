package Lab421;

public class Serpiente extends ElementoInteractivo {
    private int longitud;

    public Serpiente(int posicionX, int posicionY, int longitud) {
        super(posicionX, posicionY);
        this.longitud = longitud;
    }

    // Cohesión dentro de la clase: Métodos relacionados con el comportamiento de la serpiente
    public void mover(int deltaX, int deltaY) {
        posicionX += deltaX;
        posicionY += deltaY;
        System.out.println("Moviendo la serpiente a [" + posicionX + ", " + posicionY + "]");
    }

    public void cambiarLongitud(int nuevaLongitud) {
        this.longitud = nuevaLongitud;
        System.out.println("La longitud de la serpiente ahora es " + longitud);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando la serpiente en [" + posicionX + ", " + posicionY + "]");
    }

    @Override
    public void actualizarEstado() {
        System.out.println("Actualizando el estado de la serpiente.");
    }
}