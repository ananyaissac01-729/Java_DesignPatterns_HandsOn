public class GatewayAAdapter implements PaymentProcessor {
    private GatewayA gatewayA;

    public GatewayAAdapter(GatewayA gatewayA) {
        this.gatewayA = gatewayA;
    }

    @Override
    public void processPayment(double amt) {
        gatewayA.makePayment(amt);
    }
}