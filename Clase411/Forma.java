package Clase411;

class Forma {
    public void dibujar() {
        System.out.println("Dibujando una forma genérica");
    }
}

class Circulo extends Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}


