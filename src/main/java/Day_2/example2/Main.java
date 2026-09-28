package Day_2.example2;

public class Main {
    public static void main(String[] args) {
        PizzaShop shop = new PizzaShop();

        // Order pizzas using the Director
        System.out.println("--- Ordering Standard Pizzas ---");
        String margherita = shop.order("margherita", "medium");
        System.out.println(margherita);

        String pepperoni = shop.order("pepperoni", "large");
        System.out.println(pepperoni);

        // Test invalid recipe/size
        System.out.println(shop.order("hawaiian", "medium"));
        System.out.println(shop.order("veggie", "extra-large"));

        // Build a custom pizza step-by-step
        System.out.println("\n--- Building a Custom Pizza ---");
        if (shop.startCustom("small")) {
            shop.crust("thin");
            shop.sauce("bbq");
            shop.cheese("mozzarella");
            shop.addTopping("chicken");
            shop.addTopping("onions");

            String customPizza = shop.buildCustom();
            System.out.println(customPizza);
        }

        // View the history of built pizzas
        System.out.println("\n--- Order History & Summary ---");
        System.out.println("Total pizzas made: " + shop.builtCount());

        System.out.println("Pizza at index 0: " + shop.rendered(0));
        System.out.println("Pizza at index 2: " + shop.rendered(2));
        System.out.println("Pizza at index 5 (Invalid): " + shop.rendered(5));
    }
}
