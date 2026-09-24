package Day_5.state.example_2;
class AuthenticatedState implements AtmState{
    public String name(){
        return "AUTHENTICATED";
    }
    public String insertCard(Atm context){
        return "Card already inserted.";
    }
    public String enterPin(Atm context,String pin){
        return "Already authenticated.";
    }
    public String withdraw(Atm context,int amount){
        if(amount <= 0 ){
            return "Invalid amount.";
        }
        if(amount > context.balance()){
            return "Insufficient funds. Balance: $"+context.balance()+".";
        }
        context.setBalance(context.balance()-amount);
        context.setState(new TransactionState());
        return "Dispensing $"+amount+". New balance: $"+context.balance()+".";

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

