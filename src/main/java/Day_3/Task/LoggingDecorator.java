package Day_3.Task;

public class LoggingDecorator extends ShippingDecorator{

    public LoggingDecorator(ShippingService wrappedService) {
        super(wrappedService);
    }
    public void shipItem(String itemId,String destination){
        System.out.println("Starting shipment process for item : "+itemId);
        super.shipItem(itemId,destination);
        System.out.println("Finished Shipment process ");
    }
}
