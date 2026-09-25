package OCP;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void process(double amount) {
        System.out.println("Charging $ "+amount+" via PayPal Method");
    }
}
