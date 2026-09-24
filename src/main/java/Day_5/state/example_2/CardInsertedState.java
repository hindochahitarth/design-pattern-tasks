package Day_5.state.example_2;
class CardInsertedState implements AtmState{
    public String name(){
        return "CARD_INSERTED";
    }
    public String insertCard(Atm context){
        return "Card already inserted.";
    }
    public String enterPin(Atm context,String pin){
        if(pin.equals(context.getCorrectPin())){
            context.setState(new AuthenticatedState());
            return "PIN accepted. You are authenticated.";
        }
        context.setState(new IdleState());
        return "Incorrect PIN. Card ejected.";
    }
    public String withdraw(Atm context,int amount){
        return "Enter your PIN first.";
    }
    public String collectCash(Atm context){
        return "No cash to collect.";
    }
    public String ejectCard(Atm context){
        context.setState(new IdleState());
        return "Card ejected. Returning to idle.";
    }
    public String reportError(Atm context){
        context.setState(new OutOfServiceState());
        return "ATM error reported. Shutting down.";
    }
    public String reset(Atm context){
        return "ATM is already in service.";
    }
}
