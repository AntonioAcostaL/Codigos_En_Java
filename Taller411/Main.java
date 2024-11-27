package Taller411;

// Clase Principal para Pruebas
public class Main {
    public static void main(String[] args) {
        ElementoInteractivo serpiente = new Serpiente(5, 10, 3);
        ElementoInteractivo numero = new Numero(2, 4, 7);
        ElementoInteractivo obstaculo = new Obstaculo(8, 6);

        serpiente.dibujar();
        numero.dibujar();
        obstaculo.dibujar();

        serpiente.actualizarEstado();
        numero.actualizarEstado();
        obstaculo.actualizarEstado();
    }
}