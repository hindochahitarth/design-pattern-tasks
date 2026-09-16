package Day_2;
// File: OrderBuilder.java
import java.util.List;

public interface OrderBuilder {
    OrderBuilder items(List<String> items);
    OrderBuilder shippingAddress(String shippingAddress);
    OrderBuilder giftWrap(boolean giftWrap);
    OrderBuilder discountCode(String discountCode);
    OrderBuilder deliveryNotes(String deliveryNotes);
    OrderBuilder isPriority(boolean isPriority);
    Order build();
}

