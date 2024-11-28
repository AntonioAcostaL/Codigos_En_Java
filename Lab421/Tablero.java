package Lab421;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
    private List<ElementoInteractivo> elementos;

    public Tablero() {
        this.elementos = new ArrayList<>();
    }

    // Acoplamiento: Agregando elementos al tablero
    public void agregarElemento(ElementoInteractivo e) {
        elementos.add(e);
    }

    public void actualizarTablero() {
        for (ElementoInteractivo e : elementos) {
            e.actualizarEstado();
            e.dibujar();
        }
    }
}