package Day_5.state.example_2;
interface AtmState{
    String name();
    String insertCard(Atm context);
    String enterPin(Atm context,String pin);
    String withdraw(Atm context,int amount);
    String collectCash(Atm context);
    String ejectCard(Atm context);
    String reportError(Atm context);
    String reset(Atm context);

}
