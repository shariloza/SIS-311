public class PagoPayPal implements Strategy {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago realizado con PayPal por: " + monto + " Bs");
    }
}
