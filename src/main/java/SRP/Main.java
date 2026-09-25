package SRP;
public class Main {
    public static void main(String[] args) {
        // Initialize the CounterPanel
        CounterPanel panel = new CounterPanel();

        //  initial state
        System.out.println("--- Initial State ---");
        System.out.println(panel.render()); // Output: Count: 0

        System.out.println("\n--- All Operations ---");
        System.out.println("Incremented to: " + panel.increment()); // Output: 1
        System.out.println("Incremented to: " + panel.increment()); // Output: 2
        System.out.println("Decremented to: " + panel.decrement()); // Output: 1

        System.out.println("\n--- Current Output ---");
        System.out.println(panel.render()); // Output: Count: 1

        // Changing Label
        System.out.println("\n--- Changing Label ---");
        boolean labelUpdated = panel.setLabel("Score");
        System.out.println("Status : " + labelUpdated); // Output: true
        System.out.println(panel.render()); // Output: Score: 1

        System.out.println("\n--- Checking Invalid Label ---");
        boolean invalidUpdate = panel.setLabel(""); // Empty string should fail
        System.out.println("Status :  " + invalidUpdate); // Output: false
        System.out.println(panel.render()); // Output: Score: 1 (Unchanged)

        // Demonstrate Reset
        System.out.println("\n--- Resetting Counter ---");
        System.out.println("Reset value: " + panel.reset()); // Output: 0
        System.out.println(panel.render()); // Output: Score: 0
    }
}

