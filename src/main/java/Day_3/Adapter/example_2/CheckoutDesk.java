package Day_3.Adapter.example_2;

class CheckoutDesk {
    private final LegacyGateway gateway = new LegacyGateway();
    private final PaymentProcessor processor = new LegacyPaymentAdapter(gateway);
    private int payments = 0;

    public String pay(String orderId, int dollars) {
        if (dollars < 0) {
            return "INVALID";
        }
        payments++;
        return processor.pay(orderId, dollars);
    }

    public String receipt(String orderId, int dollars) {
        String result = pay(orderId, dollars);
        return result.equals("INVALID") ? result : "Receipt | " + result;
    }

    public int paymentCount() {
        return payments;
    }

    public int gatewayCallCount() {
        return gateway.callCount();
    }
}
