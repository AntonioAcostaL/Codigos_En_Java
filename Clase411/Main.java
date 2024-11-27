package Clase411;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de sobrecarga
        Calculadora calc = new Calculadora();
        System.out.println("Suma de 2 números: " + calc.sumar(5, 10));
        System.out.println("Suma de 2 números decimales: " + calc.sumar(5.5, 10.5));
        System.out.println("Suma de 3 números: " + calc.sumar(1, 2, 3));

        // Ejemplo de sobrescritura
        Animal miAnimal = new Perro();
        miAnimal.sonido();

        // Ejemplo de enlace dinámico
        Forma miForma = new Circulo();
        miForma.dibujar();
    }
}
