package Lab241.Bicicleta.Version1;

// Clase Rueda
class Rueda {
    private String material;  // Material de la rueda
    private int tamaño;       // Tamaño de la rueda
    private String tipo;      // Tipo de rueda (por ejemplo, de montaña, de carretera)

    // Constructor
    public Rueda(String material, int tamaño, String tipo) {
        this.material = material;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    // Métodos Getter y Setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
