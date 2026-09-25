package OCP;

public class PaymentProcessor {
    public void checkout(PaymentMethod paymentMethod,double amount){
        paymentMethod.process(amount);
    }
}
