package Lab241.Bicicleta.Version2;

// Clase Bicicleta
class Bicicleta {
    private String color;
    private Cuadro cuadro;
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;

    public Bicicleta(String color, Cuadro cuadro, Rueda ruedaDelantera, Rueda ruedaTrasera) {
        this.color = color;
        this.cuadro = cuadro;
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    @Override
    public String toString() {
        return "Bicicleta [color=" + color + 
               ", cuadro=" + cuadro.getTamaño() + " (" + cuadro.getMaterial() + ")" +
               ", ruedaDelantera=" + ruedaDelantera.getTamaño() + " (" + ruedaDelantera.getTipo() + ")" +
               ", ruedaTrasera=" + ruedaTrasera.getTamaño() + " (" + ruedaTrasera.getTipo() + ")]";
    }
}