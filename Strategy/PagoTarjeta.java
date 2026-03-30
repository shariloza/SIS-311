public class PagoTarjeta implements Strategy {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago realizado con tarjeta por: " + monto + " Bs");
    }
}
