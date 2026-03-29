public class Barco implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando carga por mar en un Barco.");
    }
}