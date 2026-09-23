package Day_3.facade.example_2;
class PowerSupply {
    private boolean on = false;

    public String turnOn() {
        on = true;
        return "Power: Supply on.";
    }

    public String turnOff() {
        on = false;
        return "Power: Supply off.";
    }

    public boolean isOn() {
        return on;
    }
}
