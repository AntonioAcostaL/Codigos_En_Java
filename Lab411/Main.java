package Lab411;

// Clase Principal para Probar Polimorfismo
public class Main {
    public static void main(String[] args) {
        // Nivel 1: Sobrecarga
        Serpiente serpiente = new Serpiente(5, 10, 3);
        serpiente.mover(3, 2); // Sobrecarga con dos parámetros
        serpiente.mover(4);    // Sobrecarga con un parámetro

        // Nivel 2: Sobrescritura
        serpiente.dibujar();
        serpiente.actualizarEstado();

        Numero numero = new Numero(2, 4, 7);
        numero.dibujar();
        numero.actualizarEstado();

        // Nivel 3: Polimorfismo Dinámico
        ElementoInteractivo elemento = serpiente; // Referencia polimórfica
        elemento.dibujar(); // Ejecuta Serpiente.dibujar()

        elemento = numero; // Cambio a otro tipo concreto
        elemento.dibujar(); // Ejecuta Numero.dibujar()
    }
}