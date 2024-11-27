package Taller411;

// Clase Hija: Obstaculo
public class Obstaculo extends ElementoInteractivo {
    public Obstaculo(int posicionX, int posicionY) {
        super(posicionX, posicionY);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un obstáculo en [" + posicionX + ", " + posicionY + "]");
    }

    @Override
    public void actualizarEstado() {
        System.out.println("Obstáculo bloquea el paso.");
    }
}
