package Lab521;

public class Serpiente implements Runnable {
    private int posicionX;
    private int posicionY;
    private int longitud;
    private boolean enMovimiento; // Variable para controlar si el hilo sigue moviéndose

    public Serpiente(int posicionX, int posicionY, int longitud) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.longitud = longitud;
        this.enMovimiento = true; // Hilo activo por defecto
    }

    @Override
    public void run() {
        while (enMovimiento) { // El hilo continuará mientras enMovimiento sea true
            mover();
            try {
                Thread.sleep(100); // Mueve la serpiente cada 100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("La serpiente ha dejado de moverse.");
    }

    public void mover() {
        // Lógica para mover la serpiente
        posicionX++;
        System.out.println("Moviendo la serpiente a [" + posicionX + ", " + posicionY + "]");
    }

    public void iniciarHilo() {
        Thread hiloMovimiento = new Thread(this);
        hiloMovimiento.start();
    }

    // Método para detener el hilo
    public void detenerHilo() {
        enMovimiento = false; // Cambia la variable a false para que el hilo termine
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public int getLongitud() {
        return longitud;
    }
}
