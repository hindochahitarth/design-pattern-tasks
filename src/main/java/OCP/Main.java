package OCP;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor=new PaymentProcessor();
        PaymentMethod card=new CreditCardPayment();
        paymentProcessor.checkout(card,150.00);

        PaymentMethod paypal=new PayPalPayment();
        paymentProcessor.checkout(paypal,45.50);
    }
}
