package Clase321;

public abstract class ElementoInteractivo {
    protected String color;
    protected int posicionX;
    protected int posicionY;

    public ElementoInteractivo(String color, int posicionX, int posicionY) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public abstract void dibujar();
    public abstract void actualizarEstado();
}
