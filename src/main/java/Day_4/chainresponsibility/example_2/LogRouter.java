package Day_4.chainresponsibility.example_2;

import java.util.ArrayList;
import java.util.List;

class LogRouter {
    private static final int CAPACITY = 6;

    private Logger head = null;

    private Logger tail = null;

    private int handled = 0;

    public LogRouter() {
    }

    private Logger create(String kind) {
        if (kind.equals("debug")) {
            return new DebugLogger();
        }
        if (kind.equals("info")) {
            return new InfoLogger();
        }
        if (kind.equals("warn")) {
            return new WarnLogger();
        }
        if (kind.equals("error")) {
            return new ErrorLogger();
        }
        return null;
    }

    public boolean addLogger(String kind) {
        Logger created = create(kind);
        if (created == null) {
            return false;
        }
        if (loggerCount() >= CAPACITY) {
            return false;
        }
        if (head == null) {
            head = created;
        } else {
            tail.setNext(created);
        }
        tail = created;
        return true;
    }

    public String chainOrder() {
        if (head == null) {
            return "EMPTY";
        }
        StringBuilder b = new StringBuilder();
        for (Logger node = head; node != null; node = node.getNext()) {
            if (b.length() > 0) {
                b.append(" -> ");
            }
            b.append(node.label());
        }
        return b.toString();
    }

    public String[] log(int level, String message) {
        List<String> lines = new ArrayList<>();
        if (level < 1 || level > 4) {
            return lines.toArray(new String[0]);
        }
        if (head != null) {
            head.log(level, message, lines);
        }
        handled += lines.size();
        return lines.toArray(new String[0]);
    }

    public int loggerCount() {
        int n = 0;
        for (Logger node = head; node != null; node = node.getNext()) {
            n++;
        }
        return n;
    }

    public int handledCount() {
        return handled;
    }
}
