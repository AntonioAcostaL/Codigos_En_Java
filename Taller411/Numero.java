package Taller411;

// Clase Hija: Numero
public class Numero extends ElementoInteractivo {
    private int valor;

    public Numero(int posicionX, int posicionY, int valor) {
        super(posicionX, posicionY);
        this.valor = valor;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un número " + valor + " en [" + posicionX + ", " + posicionY + "]");
    }

    @Override
    public void actualizarEstado() {
        System.out.println("Número consumido.");
    }
}