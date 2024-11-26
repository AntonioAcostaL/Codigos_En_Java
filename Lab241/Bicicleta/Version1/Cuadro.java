package Lab241.Bicicleta.Version1;

// Clase Cuadro
class Cuadro {
    private String material;  // Material del cuadro
    private String color;     // Color del cuadro
    private String tipo;      // Tipo de cuadro (por ejemplo, cuadro de aluminio, carbono)

    // Constructor
    public Cuadro(String material, String color, String tipo) {
        this.material = material;
        this.color = color;
        this.tipo = tipo;
    }

    // Métodos Getter y Setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}