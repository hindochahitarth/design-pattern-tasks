package Day_4.strategy;

public class StripeStrategy implements PaymentStrategy{
    private String apiKey;

    public StripeStrategy(String apiKey){
        this.apiKey=apiKey;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment Processed via Stripe "+amount);
    }
}
