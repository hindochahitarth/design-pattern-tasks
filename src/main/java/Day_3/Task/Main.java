package Day_3.Task;

public class Main {
    public static void main(String[] args) {
        ThirdPartyShippingLib thirdPartyShippingLib=new ThirdPartyShippingLib();
        ShippingService baseService=new ShippingAdapter(thirdPartyShippingLib);

        ShippingService stackedService=new LoggingDecorator(
                new RetryDecorator(baseService)
        );
        stackedService.shipItem("12345","Canal Road");
    }
}
