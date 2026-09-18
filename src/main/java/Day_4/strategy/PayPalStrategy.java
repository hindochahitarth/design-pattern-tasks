package Day_4.strategy;

public class PayPalStrategy implements PaymentStrategy{
    private String email;
    private String password;

    public PayPalStrategy(String email,String password){
        this.email=email;
        this.password=password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment Processed via paypal :"+amount);
    }
}
