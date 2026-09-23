package Day_3.decorators.example_two;

public class Main {
    public static void main(String[] args) {
        PlainPizza plainPizza=new PlainPizza();


        PizzaOrder pizzaOrder=new PizzaOrder();
//        System.out.println("--- PLAIN PIZZA ---");
//        System.out.println(plainPizza.description()+" - "+plainPizza.cost());
//
//
//
//
//
//        System.out.println("--- DECORATED WITH CHEESE,PEPPERONI---");
//        PepperoniDecorator pepperoniDecorator=new PepperoniDecorator(cheeseDecorator);
//        System.out.println(pepperoniDecorator.description()+" - "+pepperoniDecorator.cost());
//
//
//        System.out.println("--- DECORATED WITH CHEESE,PEPPERONI & MUSHROOM---");
//        MushroomDecorator mushroomDecorator=new MushroomDecorator(pepperoniDecorator);
//        System.out.println(mushroomDecorator.description()+" - "+mushroomDecorator.cost());

        System.out.println("--- DECORATED WITH CHEESE ---");
        pizzaOrder.addTopping("cheese");
        System.out.println(pizzaOrder.description()+" - "+pizzaOrder.cost());


        System.out.println("--- DECORATED WITH PEPPERONI ---");
        pizzaOrder.addTopping("pepperoni");
        System.out.println(pizzaOrder.description()+" - "+pizzaOrder.cost());


        System.out.println("--- DECORATED WITH MUSHROOM ---");
        pizzaOrder.addTopping("mushrooms");
        System.out.println(pizzaOrder.description()+" - "+pizzaOrder.cost());

        System.out.println(pizzaOrder.toppingCount());

        System.out.println(pizzaOrder.removeLastTopping());
        System.out.println(pizzaOrder.toppingCount());
        System.out.println(pizzaOrder.description());
    }
}
