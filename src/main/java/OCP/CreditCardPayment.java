package OCP;

public class CreditCardPayment  implements PaymentMethod{
    @Override
    public void process(double amount) {
        System.out.println("Charging $ "+amount+" via Credit Card ");
    }
}
