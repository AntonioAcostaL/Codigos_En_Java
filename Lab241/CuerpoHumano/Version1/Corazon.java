package Lab241.CuerpoHumano.Version1;


// Clase Corazon
class Corazon {
    private int ritmoCardiaco; // En latidos por minuto
    private String salud;      // Estado del corazón (ejemplo: saludable, enfermo)
    private double presionArterial; // En mmHg

    public Corazon(int ritmoCardiaco, String salud, double presionArterial) {
        this.ritmoCardiaco = ritmoCardiaco;
        this.salud = salud;
        this.presionArterial = presionArterial;
    }

    public int getRitmoCardiaco() {
        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public String getSalud() {
        return salud;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public double getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(double presionArterial) {
        this.presionArterial = presionArterial;
    }
}