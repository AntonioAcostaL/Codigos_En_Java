package Lab241.Bicicleta.Version2;
// Clase Rueda
class Rueda {
    private String tamaño;
    private String tipo;

    public Rueda(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}