package Lab241.CuerpoHumano.Version2;

// Clase Corazon
class Corazon {
    private int ritmoCardiaco; // En latidos por minuto
    private String salud;      // Estado del corazón (ej. saludable, enfermo)
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

// Clase Pulmon
class Pulmon {
    private double capacidadRespiratoria; // En litros
    private String salud;                 // Estado del pulmón
    private int frecuenciaRespiratoria;   // Respiraciones por minuto

    public Pulmon(double capacidadRespiratoria, String salud, int frecuenciaRespiratoria) {
        this.capacidadRespiratoria = capacidadRespiratoria;
        this.salud = salud;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public double getCapacidadRespiratoria() {
        return capacidadRespiratoria;
    }

    public void setCapacidadRespiratoria(double capacidadRespiratoria) {
        this.capacidadRespiratoria = capacidadRespiratoria;
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

// Clase CuerpoHumano
class CuerpoHumano {
    private int edad;
    private String sexo;
    private Corazon corazon;
    private Pulmon pulmonIzquierdo;
    private Pulmon pulmonDerecho;

    public CuerpoHumano(int edad, String sexo, Corazon corazon, Pulmon pulmonIzquierdo, Pulmon pulmonDerecho) {
        this.edad = edad;
        this.sexo = sexo;
        this.corazon = corazon;
        this.pulmonIzquierdo = pulmonIzquierdo;
        this.pulmonDerecho = pulmonDerecho;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        return "CuerpoHumano [edad=" + edad + ", sexo=" + sexo + 
               ", Corazon [ritmoCardiaco=" + corazon.getRitmoCardiaco() + 
               ", salud=" + corazon.getSalud() + ", presionArterial=" + corazon.getPresionArterial() + "]" +
               ", PulmonIzquierdo [capacidadRespiratoria=" + pulmonIzquierdo.getCapacidadRespiratoria() + 
               ", salud=" + pulmonIzquierdo.getSalud() + ", frecuenciaRespiratoria=" + pulmonIzquierdo.getFrecuenciaRespiratoria() + "]" +
               ", PulmonDerecho [capacidadRespiratoria=" + pulmonDerecho.getCapacidadRespiratoria() + 
               ", salud=" + pulmonDerecho.getSalud() + ", frecuenciaRespiratoria=" + pulmonDerecho.getFrecuenciaRespiratoria() + "]]";
    }
}

// Clase Main
public class Main {
    public static void main(String[] args) {
        Corazon corazon = new Corazon(75, "Saludable", 120.8);
        Pulmon pulmonIzquierdo = new Pulmon(3.5, "Saludable", 16);
        Pulmon pulmonDerecho = new Pulmon(3.5, "Saludable", 16);

        CuerpoHumano cuerpo = new CuerpoHumano(25, "Masculino", corazon, pulmonIzquierdo, pulmonDerecho);

        // Mostrar el estado inicial del cuerpo humano
        System.out.println(cuerpo.toString());

        // Modificar un atributo y mostrar los cambios
        cuerpo.getCorazon().setRitmoCardiaco(80);
        System.out.println("\nDespués de ajustar el ritmo cardíaco:");
        System.out.println(cuerpo.toString());
    }
}
