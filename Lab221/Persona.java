package Lab221;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private String genero;
    private double altura;
    private double peso;

    // Constructor
    public Persona(String nombre, int edad, String genero, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos Set y Get
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    // Métodos personalizados
    public static void comer(String comida) {
        System.out.println("Estoy comiendo: " + comida);
    }

    public void dormir(int horas) {
        System.out.println(nombre + " durmió " + horas + " horas.");
    }

    public void hacerEjercicio(String tipoEjercicio, int duracion) {
        System.out.println(nombre + " hizo " + tipoEjercicio + " durante " + duracion + " minutos.");
    }
}
