package Day_2;
import java.util.List;

public class OrderDirector {
    private final OrderBuilder builder;

    public OrderDirector(OrderBuilder builder) {
        this.builder = builder;
    }
    public Order constructStandardOrder(List<String> items, String address) {
        return builder
                .items(items)
                .shippingAddress(address)
                .build();
    }
    public Order constructPremiumGiftOrder(List<String> items, String address, String note) {
        return builder
                .items(items)
                .shippingAddress(address)
                .giftWrap(true)
                .deliveryNotes(note)
                .isPriority(true)
                .build();
    }
}