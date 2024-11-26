package Lab241.Bicicleta.Version1;

// Clase Bicicleta
class Bicicleta {
    private Rueda ruedaDelantera;  // Componente de la bicicleta: Rueda Delantera
    private Rueda ruedaTrasera;     // Componente de la bicicleta: Rueda Trasera
    private Cuadro cuadro;          // Componente de la bicicleta: Cuadro

    // Constructor
    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
    }

    // Métodos Getter y Setter para Rueda Delantera
    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    // Métodos Getter y Setter para Rueda Trasera
    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    // Métodos Getter y Setter para Cuadro
    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    // Método para mostrar la información completa de la bicicleta
    public void mostrarInformacion() {
        System.out.println("Bicicleta con las siguientes características:");
        System.out.println("Cuadro: Material - " + cuadro.getMaterial() + ", Color - " + cuadro.getColor() + ", Tipo - " + cuadro.getTipo());
        System.out.println("Rueda Delantera: Material - " + ruedaDelantera.getMaterial() + ", Tamaño - " + ruedaDelantera.getTamaño() + ", Tipo - " + ruedaDelantera.getTipo());
        System.out.println("Rueda Trasera: Material - " + ruedaTrasera.getMaterial() + ", Tamaño - " + ruedaTrasera.getTamaño() + ", Tipo - " + ruedaTrasera.getTipo());
    }
}
