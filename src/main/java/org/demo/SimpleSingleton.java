package org.demo;

public class SimpleSingleton {
    //create exactly one copy and hide
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    private int executionCount = 0;

    private SimpleSingleton() {
        System.out.println("Singleton Instance Created!");
    }

    public static SimpleSingleton getInstance() {
        return INSTANCE;
    }

    public void print() {
        executionCount++;
        System.out.println("Action executed " + executionCount + " time(s).");
    }
}
