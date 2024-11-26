package Lab241.CuerpoHumano.Version1;
// Clase Main
public class Main {
    public static void main(String[] args) {
        Corazon corazon = new Corazon(70, "Saludable", 120.80);
        Pulmon pulmonIzquierdo = new Pulmon(2.5, "Saludable", 16);
        Pulmon pulmonDerecho = new Pulmon(2.5, "Saludable", 16);

        CuerpoHumano cuerpo = new CuerpoHumano("Juan Perez", 30, 70.5, corazon, pulmonIzquierdo, pulmonDerecho);

        System.out.println(cuerpo.toString());
    }
}