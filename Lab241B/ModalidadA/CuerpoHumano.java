package Lab241B.ModalidadA;

public class CuerpoHumano {

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

    public static void main(String[] args) {
        // Crear un objeto de CuerpoHumano
        CuerpoHumano cuerpo = new CuerpoHumano();

        // Crear objetos de las clases componentes
        CuerpoHumano.Corazon corazon = cuerpo.new Corazon(72, "O+");
        CuerpoHumano.Pulmon pulmon = cuerpo.new Pulmon(6000, "Sano");
        CuerpoHumano.Higado higado = cuerpo.new Higado(1500, true);

        // Imprimir valores
        System.out.println("Corazón: Latidos por minuto = " + corazon.getLatidosPorMinuto() + ", Tipo de sangre = " + corazon.getTipoSangre());
        System.out.println("Pulmón: Capacidad = " + pulmon.getCapacidad() + "ml, Estado = " + pulmon.getEstado());
        System.out.println("Hígado: Peso = " + higado.getPeso() + "g, Saludable = " + higado.isSaludable());
    }
}
