package example.solidprinciples.SRP;
class CounterPanel {
    private final Counter counter=new Counter();
    private final CounterFormatter formatter = new CounterFormatter();

    public int increment() {
        return counter.increment();
    }

    public int decrement() {
        return counter.decrement();
    }

    public int reset() {
        return counter.reset();
    }

    public int value() {
        return counter.value();
    }

    public boolean setLabel(String label) {
        return formatter.setLabel(label);
    }

    public String render() {
        return formatter.format(counter.value());
    }
}
