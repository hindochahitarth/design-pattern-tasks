package Day_5.state.example_2;
class IdleState implements AtmState{
    public String name(){
        return "IDLE";
    }
    public String insertCard(Atm context){
        context.setState(new CardInsertedState());
        return "Card inserted. Enter your PIN.";
    }
    public String enterPin(Atm context,String pin){
        return "No card inserted.";
    }
    public String withdraw(Atm context,int amount){
        return "No card inserted.";
    }
    public String collectCash(Atm context){
        return "No cash to collect.";
    }
    public String ejectCard(Atm context){
        return "No card inserted.";
    }
    public String reportError(Atm context){
        context.setState(new OutOfServiceState());
        return "ATM error reported. Shutting down.";
    }
    public String reset(Atm context){
        return "ATM is already in service.";
    }
}

