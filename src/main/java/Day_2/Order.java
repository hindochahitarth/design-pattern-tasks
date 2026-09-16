package Day_2;
import java.util.ArrayList;
import java.util.List;

public class Order {
    // Required fields
    private final List<String> items;
    private final String shippingAddress;

    // Optional fields
    private final boolean giftWrap;
    private final String discountCode;
    private final String deliveryNotes;
    private final boolean isPriority;

    // Private constructor accepting the builder
    private Order(Builder builder) {
        this.items = List.copyOf(builder.items); // Defensive copy for immutability
        this.shippingAddress = builder.shippingAddress;
        this.giftWrap = builder.giftWrap;
        this.discountCode = builder.discountCode;
        this.deliveryNotes = builder.deliveryNotes;
        this.isPriority = builder.isPriority;
    }

    // Getters
    public List<String> getItems() { return items; }
    public String getShippingAddress() { return shippingAddress; }
    public boolean isGiftWrap() { return giftWrap; }
    public String getDiscountCode() { return discountCode; }
    public String getDeliveryNotes() { return deliveryNotes; }
    public boolean isPriority() { return isPriority; }

    // Concrete Builder Implementation
    public static class Builder implements OrderBuilder {
        private List<String> items = new ArrayList<>();
        private String shippingAddress;
        private boolean giftWrap = false;
        private String discountCode = "0";
        private String deliveryNotes = "";
        private boolean isPriority = false;

        @Override
        public OrderBuilder items(List<String> items) {
            this.items = items;
            return this;
        }

        @Override
        public OrderBuilder shippingAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        @Override
        public OrderBuilder giftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        @Override
        public OrderBuilder discountCode(String discountCode) {
            this.discountCode = discountCode;
            return this;
        }

        @Override
        public OrderBuilder deliveryNotes(String deliveryNotes) {
            this.deliveryNotes = deliveryNotes;
            return this;
        }

        @Override
        public OrderBuilder isPriority(boolean isPriority) {
            this.isPriority = isPriority;
            return this;
        }

        @Override
        public Order build() {
            // Requirement Check: Strict validation on execution
            if (this.items == null || this.items.isEmpty()) {
                throw new IllegalStateException("Validation error: Order must contain at least one item.");
            }
            if (this.shippingAddress == null || this.shippingAddress.trim().isEmpty()) {
                throw new IllegalStateException("Validation error: Shipping address is required.");
            }
            return new Order(this);
        }
    }
}

