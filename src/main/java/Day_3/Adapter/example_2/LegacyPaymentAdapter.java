package Day_3.Adapter.example_2;

class LegacyPaymentAdapter implements PaymentProcessor{
    private LegacyGateway legacyGateway;
    public LegacyPaymentAdapter(LegacyGateway legacyGateway){
        this.legacyGateway=legacyGateway;
    }
    public String pay(String orderId,int dollars){
        return legacyGateway.makeCharge(dollars*100,orderId,true);
    }
}
