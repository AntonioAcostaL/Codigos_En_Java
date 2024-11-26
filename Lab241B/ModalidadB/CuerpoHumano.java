package Lab241B.ModalidadB;


public class CuerpoHumano {

    private Corazon corazon;
    private Pulmon pulmon;
    private Higado higado;

    // Clase anidada Corazon
    public class Corazon {
        private int latidosPorMinuto;
        private String tipoSangre;

        public Corazon(int latidosPorMinuto, String tipoSangre) {
            this.latidosPorMinuto = latidosPorMinuto;
            this.tipoSangre = tipoSangre;
        }

        public int getLatidosPorMinuto() {
            return latidosPorMinuto;
        }

        public void setLatidosPorMinuto(int latidosPorMinuto) {
            this.latidosPorMinuto = latidosPorMinuto;
        }

        public String getTipoSangre() {
            return tipoSangre;
        }

        public void setTipoSangre(String tipoSangre) {
            this.tipoSangre = tipoSangre;
        }
    }

    // Clase anidada Pulmon
    public class Pulmon {
        private int capacidad;
        private String estado;

        public Pulmon(int capacidad, String estado) {
            this.capacidad = capacidad;
            this.estado = estado;
        }

        public int getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }

    // Clase anidada Higado
    public class Higado {
        private int peso;
        private boolean saludable;

        public Higado(int peso, boolean saludable) {
            this.peso = peso;
            this.saludable = saludable;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public boolean isSaludable() {
            return saludable;
        }

        public void setSaludable(boolean saludable) {
            this.saludable = saludable;
        }
    }

    public CuerpoHumano() {
        this.corazon = new Corazon(72, "O+");
        this.pulmon = new Pulmon(6000, "Sano");
        this.higado = new Higado(1500, true);
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Pulmon getPulmon() {
        return pulmon;
    }

    public Higado getHigado() {
        return higado;
    }

    public static void main(String[] args) {
        // Crear un objeto del tipo CuerpoHumano
        CuerpoHumano cuerpo = new CuerpoHumano();

        // Imprimir valores
        System.out.println("Corazón: Latidos por minuto = " + cuerpo.getCorazon().getLatidosPorMinuto() + ", Tipo de sangre = " + cuerpo.getCorazon().getTipoSangre());
        System.out.println("Pulmón: Capacidad = " + cuerpo.getPulmon().getCapacidad() + "ml, Estado = " + cuerpo.getPulmon().getEstado());
        System.out.println("Hígado: Peso = " + cuerpo.getHigado().getPeso() + "g, Saludable = " + cuerpo.getHigado().isSaludable());
    }
}
