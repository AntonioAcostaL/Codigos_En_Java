package Lab411;

// Clase Hija: Serpiente
public class Serpiente extends ElementoInteractivo {
    private int longitud;

    public Serpiente(int posicionX, int posicionY, int longitud) {
        super(posicionX, posicionY);
        this.longitud = longitud;
    }

    // Sobrecarga (Nivel 1)
    public void mover(int deltaX, int deltaY) {
        this.posicionX += deltaX;
        this.posicionY += deltaY;
        System.out.println("Moviendo la serpiente a [" + posicionX + ", " + posicionY + "]");
    }

    public void mover(int deltaX) {
        this.posicionX += deltaX;
        System.out.println("Moviendo la serpiente horizontalmente a [" + posicionX + "]");
    }

    // Sobrescritura (Nivel 2)
    @Override
    public void dibujar() {
        System.out.println("Dibujando la serpiente en [" + posicionX + ", " + posicionY + "]");
    }

    @Override
    public void actualizarEstado() {
        System.out.println("Actualizando el estado de la serpiente.");
    }
}