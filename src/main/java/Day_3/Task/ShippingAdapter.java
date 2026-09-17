package Day_3.Task;

public class ShippingAdapter implements ShippingService{
    private final ThirdPartyShippingLib thirdPartyShippingLib;

    public ShippingAdapter(ThirdPartyShippingLib thirdPartyShippingLib) {
        this.thirdPartyShippingLib = thirdPartyShippingLib;
    }

    @Override
    public void shipItem(String itemId, String destination) {
        int productCode =Integer.parseInt(itemId);
        thirdPartyShippingLib.dispatch(productCode,destination);

    }
}
