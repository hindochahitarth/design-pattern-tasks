package Day_3.Task;

public class RetryDecorator extends ShippingDecorator{
    private final int maxAttempt=3;
    protected RetryDecorator(ShippingService wrappedService) {
        super(wrappedService);
    }
    public void shipItem(String itemId,String destination){
        int attempts=0;
        while (attempts < maxAttempt){
            try {
                attempts++;
                super.shipItem(itemId,destination);
                return;
            }
            catch (Exception e){
                System.out.println("{RETRY} Attempt "+attempts+" failed");
                if(attempts>=maxAttempt){
                    throw e;
                }
            }
        }
    }
}
