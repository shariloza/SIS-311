public class StripeAdapter implements PaymentProcessor {
    private StripeService stripeService;

    // Inyectamos el servicio que queremos adaptar
    public StripeAdapter(StripeService stripeService) {
        this.stripeService = stripeService;
    }

    @Override
    public void pay(int dollars) {
        // Tratamiento/Adaptación de los datos: Convertimos dólares a centavos
        double cents = dollars * 100;
        
        // Delegamos la ejecución al método del Adaptee
        stripeService.makePayment(cents);
    }
}
