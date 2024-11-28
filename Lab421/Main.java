package Lab421;

public class Main {
    public static void main(String[] args) {
        Serpiente serpiente = new Serpiente(5, 10, 3);
        Numero numero = new Numero(2, 4, 7);

        Tablero tablero = new Tablero();
        tablero.agregarElemento(serpiente);
        tablero.agregarElemento(numero);

        serpiente.mover(3, 2);
        serpiente.cambiarLongitud(5);

        tablero.actualizarTablero();
    }
}

