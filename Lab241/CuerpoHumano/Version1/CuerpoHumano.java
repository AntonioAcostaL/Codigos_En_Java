package Lab241.CuerpoHumano.Version1;
// Clase CuerpoHumano
class CuerpoHumano {
    private String nombre;
    private int edad;
    private double peso; // En kilogramos
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;

    public CuerpoHumano(String nombre, int edad, double peso, Corazon corazon, Pulmon pulmonIzquierdo, Pulmon pulmonDerecho) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.corazon = corazon;
        this.pulmonIzquierdo = pulmonIzquierdo;
        this.pulmonDerecho = pulmonDerecho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmon getPulmonIzquierdo() {
        return pulmonIzquierdo;
    }

    public Pulmon getPulmonDerecho() {
        return pulmonDerecho;
    }

    @Override
    public String toString() {
        return "CuerpoHumano [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso +
               ", Corazon [ritmoCardiaco=" + corazon.getRitmoCardiaco() + 
               ", salud=" + corazon.getSalud() + ", presionArterial=" + corazon.getPresionArterial() + "]" +
               ", PulmonIzquierdo [capacidadPulmonar=" + pulmonIzquierdo.getCapacidadPulmonar() + 
               ", salud=" + pulmonIzquierdo.getSalud() + ", frecuenciaRespiratoria=" + pulmonIzquierdo.getFrecuenciaRespiratoria() + "]" +
               ", PulmonDerecho [capacidadPulmonar=" + pulmonDerecho.getCapacidadPulmonar() + 
               ", salud=" + pulmonDerecho.getSalud() + ", frecuenciaRespiratoria=" + pulmonDerecho.getFrecuenciaRespiratoria() + "]]";
    }
}