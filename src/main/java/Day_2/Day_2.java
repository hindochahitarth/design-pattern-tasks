package Day_2;

import java.util.List;

public class Day_2 {
    public static void main(String[] args) {
        ProfileBuilder builder=new UserProfile.Builder();

        UserProfile user=builder
                .email("user@example.com")
                .username("User 1")
                .age(30)
                .build();
        System.out.println("User "+user.getUsername());

        OrderBuilder orderBuilder=new Order.Builder();
        OrderDirector director=new OrderDirector(orderBuilder);

        Order holidayGift = director.constructPremiumGiftOrder(
                List.of("Tablet", "Headphones"),
                "456 Oak Ave, Mumbai",
                "Leave at the front desk please."
        );
        System.out.println("Priority Order Created? " + holidayGift.isPriority());
        System.out.println("Gift Wrap Active? " + holidayGift.isGiftWrap());

        // 2. Testing Validation Failure
        try {
            Order invalidOrder = new Order.Builder()
                    .discountCode("FALLS50")
                    .build(); // Missing required items and address!
        } catch (IllegalStateException e) {
            System.out.println("\nCaught expected failure: " + e.getMessage());
        }



    }
}
