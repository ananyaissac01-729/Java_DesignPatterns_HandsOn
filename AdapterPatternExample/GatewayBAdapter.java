public class GatewayBAdapter implements PaymentProcessor {
    private GatewayB gatewayB;

    public GatewayBAdapter(GatewayB gatewayB) {
        this.gatewayB = gatewayB;
    }

    @Override
    public void processPayment(double amt) {
        gatewayB.pay(amt);
    }
}
