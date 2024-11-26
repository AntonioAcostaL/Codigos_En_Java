package Lab241.Bicicleta.Version2;

// Clase Main
public class Main {
    public static void main(String[] args) {
        Cuadro cuadro = new Cuadro("Mediano", "Aluminio");
        Rueda ruedaDelantera = new Rueda("26 pulgadas", "Montaña");
        Rueda ruedaTrasera = new Rueda("26 pulgadas", "Montaña");
        
        Bicicleta bicicleta = new Bicicleta("Rojo", cuadro, ruedaDelantera, ruedaTrasera);
        
        System.out.println(bicicleta.toString());
    }
}