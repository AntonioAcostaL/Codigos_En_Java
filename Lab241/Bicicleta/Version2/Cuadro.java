package Lab241.Bicicleta.Version2;

// Clase Cuadro
class Cuadro {
    private String tamaño;
    private String material;

    public Cuadro(String tamaño, String material) {
        this.tamaño = tamaño;
        this.material = material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}