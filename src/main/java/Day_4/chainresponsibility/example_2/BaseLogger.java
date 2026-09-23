package Day_4.chainresponsibility.example_2;

import java.util.List;

abstract class BaseLogger implements Logger {
    private Logger next = null;

    public void setNext(Logger next) {
        this.next = next;
    }

    public Logger getNext() {
        return next;
    }

    protected void forward(int level, String message, List<String> lines) {
        if (next != null) {
            next.log(level, message, lines);
        }
    }
}

