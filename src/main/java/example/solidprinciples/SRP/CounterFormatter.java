package example.solidprinciples.SRP;
class CounterFormatter {
    private String label = "Count";

    public boolean setLabel(String label) {
        if (label.isEmpty()) return false;
        this.label = label;
        return true;
    }

    public String format(int value) {
        return label + ": " + value;
    }
}

