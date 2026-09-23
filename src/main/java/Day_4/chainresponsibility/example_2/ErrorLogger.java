package Day_4.chainresponsibility.example_2;

import java.util.List;

class ErrorLogger extends BaseLogger {
    public String label() {
        return "ERROR";
    }

    public void log(int level, String message, List<String> lines) {
        if (level >= 4) {
            lines.add("[ERROR] " + message);
        }
        forward(level, message, lines);
    }
}
