package Lab311;

// Clase Hija: NumeroInteractivo
public class NumeroInteractivo extends ElementoInteractivo {
    private int valor;

    public NumeroInteractivo(String color, int posicionX, int posicionY, int valor) {
        super(color, posicionX, posicionY);
        this.valor = valor;
    }

    // Getter y Setter
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Método específico de la clase hija
    public void actualizarPuntaje(int puntos) {
        valor += puntos;
        System.out.println("Puntaje actualizado. Nuevo valor: " + valor);
    }
}
