package Day_3.decorators;

public class Main {
    public static void main(String[] args) {
        Coffee coffee=new PlainCoffee();
        System.out.println("Description : "+coffee.getDescription());
        System.out.println("Cost : "+coffee.getCost());

        Coffee milkCoffee=new MilkDecorator(new PlainCoffee());

        System.out.println("Description : "+milkCoffee.getDescription());
        System.out.println("Cost : "+milkCoffee.getCost());

    }
}
