package Day_5.state.example_2;
class TransactionState implements AtmState{
    public String name(){
        return "TRANSACTION";
    }
    public String insertCard(Atm context){
        return "Transaction in progress.";
    }
    public String enterPin(Atm context,String pin){
        return "Transaction in progress.";
    }
    public String withdraw(Atm context,int amount){
        return "Transaction in progress.";

    }
    public String collectCash(Atm context){
        context.setState(new AuthenticatedState());
        return "Cash collected.";
    }
    public String ejectCard(Atm context){
        return "Transaction in progress.";
    }
    public String reportError(Atm context){
        context.setState(new OutOfServiceState());
        return "ATM error reported. Shutting down.";
    }
    public String reset(Atm context){
        return "ATM is already in service.";
    }
}

