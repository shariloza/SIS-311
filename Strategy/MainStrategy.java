public class MainStrategy {
    public static void main(String[] args) {
        System.out.println("--- PATRON STRATEGY ---");

        CarritoCompras carrito = new CarritoCompras();

        carrito.setMetodoPago(new PagoTarjeta());
        carrito.procesarPago(150);

        carrito.setMetodoPago(new PagoPayPal());
        carrito.procesarPago(220);
    }
}
