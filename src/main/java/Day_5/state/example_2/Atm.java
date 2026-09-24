package Day_5.state.example_2;
class Atm {
    private AtmState state = new IdleState();
    private int funds = 10000;
    private final String correctPin = "1234";

    public Atm() {
    }

    public void setState(AtmState state) {
        this.state = state;
    }

    public String getCorrectPin() {
        return correctPin;
    }

    public void setBalance(int amount) {
        funds = amount;
    }

    public int balance() {
        return funds;
    }

    public String currentState() {
        return state.name();
    }

    public String insertCard() {
        return state.insertCard(this);
    }

    public String enterPin(String pin) {
        return state.enterPin(this, pin);
    }

    public String withdraw(int amount) {
        return state.withdraw(this, amount);
    }

    public String collectCash() {
        return state.collectCash(this);
    }

    public String ejectCard() {
        return state.ejectCard(this);
    }

    public String reportError() {
        return state.reportError(this);
    }

    public String reset() {
        return state.reset(this);
    }
}
