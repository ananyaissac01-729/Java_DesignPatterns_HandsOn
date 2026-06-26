public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment("1234567890123456"));
        context.executePayment(2500.0);

        context.setStrategy(new PayPalPayment("suzza@example.com"));
        context.executePayment(1500.0);
    }
}