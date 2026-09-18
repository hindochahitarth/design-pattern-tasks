package Day_4.strategy;
public class Main {
    public static void main(String[] args) {
        // Create payment context with PayPal strategy
        PaymentStrategy paypalStrategy = new PayPalStrategy("paypal@example.com", "password");
        PaymentContext paymentContext = new PaymentContext(paypalStrategy);

        // Process payment using PayPal
        paymentContext.processPayment(100.0);

        // Switch to Stripe strate gy
        PaymentStrategy stripeStrategy = new StripeStrategy("stripe-api-key");
        paymentContext.setPaymentStrategy(stripeStrategy);

        // Process payment using Stripe
        paymentContext.processPayment(150.0);

    }
}
