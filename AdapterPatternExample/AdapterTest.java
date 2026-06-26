public class AdapterTest {
    public static void main(String[] args) {
        PaymentProcessor a = new GatewayAAdapter(new GatewayA());
        PaymentProcessor b = new GatewayBAdapter(new GatewayB());

        // Same method call on both — that's the whole point
        a.processPayment(100.0);
        b.processPayment(500.0);
    }
}