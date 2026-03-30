public class ClientApp {
    public static void main(String[] args) {
        // 1. Instanciamos el servicio incompatible
        StripeService stripe = new StripeService();
        
        // 2. Lo "envolvemos" con nuestro adaptador
        PaymentProcessor processor = new StripeAdapter(stripe);
        
        // 3. Lo usamos con la interfaz estándar (espera dólares)
        processor.pay(50); 
        // Salida en consola: "Pago procesado por Stripe: 5000.0 centavos."
    }
}
