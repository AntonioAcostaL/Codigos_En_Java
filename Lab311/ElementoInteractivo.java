package Lab311;

// Clase Padre: ElementoInteractivo
public class ElementoInteractivo {
    private String color;
    private int posicionX;
    private int posicionY;

    public ElementoInteractivo(String color, int posicionX, int posicionY) {
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    // Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    // Método para mostrar el estado del objeto
    public void mostrar() {
        System.out.println("Elemento en [" + posicionX + ", " + posicionY + "] con color " + color);
    }
}