package Taller411;

// Superclase: ElementoInteractivo
public abstract class ElementoInteractivo {
    protected int posicionX;
    protected int posicionY;

    public ElementoInteractivo(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public abstract void dibujar();
    public abstract void actualizarEstado();
}