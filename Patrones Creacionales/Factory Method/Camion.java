public class Camion implements Transporte {
    @Override
    public void entregar() {
        System.out.println("Entregando carga por tierra en un Camion.");
    }
}