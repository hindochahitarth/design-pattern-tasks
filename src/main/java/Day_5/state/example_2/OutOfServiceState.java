package Day_5.state.example_2;
class OutOfServiceState implements AtmState{
    public String name(){
        return "OUT_OF_SERVICE";
    }
    public String insertCard(Atm context){
        return "ATM is out of service.";
    }
    public String enterPin(Atm context,String pin){
        return "ATM is out of service.";
    }
    public String withdraw(Atm context,int amount){
        return "ATM is out of service.";

    }
    public String collectCash(Atm context){
        return "ATM is out of service.";
    }
    public String ejectCard(Atm context){
        return "ATM is out of service.";
    }
    public String reportError(Atm context){
        return "ATM is already out of service.";
    }
    public String reset(Atm context){
        context.setState(new IdleState());
        return "ATM back in service.";
    }
}
