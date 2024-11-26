package Lab231;

public class Persona {
    // Atributos
    protected String nombre; // Modificador protected
    private int edad; // Modificador private
    public String genero;
    public String nacionalidad;
    public String estadoCivil;

    // Métodos set y get para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // Métodos set y get para edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    // Métodos set y get para genero
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    // Métodos set y get para nacionalidad
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    // Métodos set y get para estadoCivil
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    // Métodos adicionales
    public void comer(String comida) {
        System.out.println("Comiendo: " + comida);
    }

    public void dormir(int horas) {
        System.out.println("Durmiendo por " + horas + " horas.");
    }

    private void tomarShower(String hora) {
        System.out.println("Tomando una ducha a las " + hora);
    }

    // Método protected
    protected void informacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Género: " + genero);
    }
}
