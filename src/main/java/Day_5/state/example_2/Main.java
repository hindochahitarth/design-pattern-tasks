package Day_5.state.example_2;

public class Main {
    public static void main(String[] args) {
        Atm atm=new Atm();
        System.out.println("Initial State "+atm.currentState());
        System.out.println("Funds : "+atm.balance());

        System.out.println("Withdrawal : "+atm.withdraw(4000));
        System.out.println("Pin entry : "+atm.enterPin("1234"));

        System.out.println("INsert card :"+atm.insertCard());
        System.out.println("Current state "+atm.currentState());
        System.out.println("Incorrect pin entering");
        System.out.println("Response : "+atm.enterPin("1111"));
        System.out.println("State : "+atm.currentState());

        String pin=atm.getCorrectPin();
        System.out.println("Entering current pin ");
        System.out.println("Response :"+atm.enterPin(pin));
        System.out.println("State : "+atm.currentState());

        System.out.println("Requesting $2000 ");
        System.out.println("Response :"+atm.withdraw(2000));
        System.out.println("Funds :"+atm.balance());
        System.out.println("Current ATM State :"+atm.currentState());

        System.out.println("Collecting cash... "+atm.collectCash());
        System.out.println("State "+atm.currentState());

        System.out.println("Ejecting card..");
        System.out.println("Response "+atm.ejectCard());
        System.out.println("State "+atm.currentState());


    }
}
