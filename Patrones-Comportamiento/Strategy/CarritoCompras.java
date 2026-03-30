public class CarritoCompras {
    private Strategy metodoPago;

    public void setMetodoPago(Strategy metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesarPago(double monto) {
        if (metodoPago != null) {
            metodoPago.pagar(monto);
        } else {
            System.out.println("No se selecciono un metodo de pago.");
        }
    }
}
