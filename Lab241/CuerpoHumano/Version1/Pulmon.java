package Lab241.CuerpoHumano.Version1;
// Clase Pulmon
class Pulmon {
    private double capacidadPulmonar; // En litros
    private String salud;             // Estado de los pulmones
    private int frecuenciaRespiratoria; // Respiraciones por minuto

    public Pulmon(double capacidadPulmonar, String salud, int frecuenciaRespiratoria) {
        this.capacidadPulmonar = capacidadPulmonar;
        this.salud = salud;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public double getCapacidadPulmonar() {
        return capacidadPulmonar;
    }

    public void setCapacidadPulmonar(double capacidadPulmonar) {
        this.capacidadPulmonar = capacidadPulmonar;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public int getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(int frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }
}