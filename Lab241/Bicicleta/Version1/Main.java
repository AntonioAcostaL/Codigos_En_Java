package Lab241.Bicicleta.Version1;

// Clase principal para crear un objeto de la clase Bicicleta
public class Main {
    public static void main(String[] args) {
        // Crear objetos de las partes de la bicicleta
        Rueda ruedaDelantera = new Rueda("Aluminio", 26, "Montaña");
        Rueda ruedaTrasera = new Rueda("Aluminio", 26, "Montaña");
        Cuadro cuadro = new Cuadro("Aluminio", "Rojo", "De montaña");

        // Crear objeto de la bicicleta con sus componentes
        Bicicleta bicicleta = new Bicicleta(ruedaDelantera, ruedaTrasera, cuadro);

        // Mostrar la información de la bicicleta
        bicicleta.mostrarInformacion();
    }
}