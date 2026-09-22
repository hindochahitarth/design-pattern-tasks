package Day_3.Adapter.example_2;

// Implement LegacyPaymentAdapter here.
public class Main {
    public static void main(String[] args) {
        CheckoutDesk desk=new CheckoutDesk();
        System.out.println("--- Processing Valid Payment ---");
        String receipt1 = desk.receipt("ORD-1001", 50);
        System.out.println(receipt1);

        System.out.println("\n--- Processing Invalid Payment ---");
        String receipt2 = desk.receipt("ORD-1002", -5);
        System.out.println(receipt2);

        System.out.println("\n--- Processing Invalid Payment ---");
        String receipt3 = desk.receipt("ORD-1003", -15);
        System.out.println(receipt3);

        System.out.println("Total payments processed by CheckoutDesk: " + desk.paymentCount());
        System.out.println("Total calls received by LegacyGateway: " + desk.gatewayCallCount());

    }
}
