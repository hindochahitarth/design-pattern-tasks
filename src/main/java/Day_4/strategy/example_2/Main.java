package Day_4.strategy.example_2;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        System.out.println(cart.currentStrategy());
        cart.setPercentageDiscount(50);
        System.out.println(cart.currentStrategy());
        System.out.println(cart.receipt(20));

        cart.setFlatDiscount(40);

        System.out.println(cart.currentStrategy());
        System.out.println(cart.receipt(80));
        cart.checkout(60);
        System.out.println(cart.checkoutCount());


    }
}
