package Day_4.chainresponsibility.example_2;

import java.util.List;

class DebugLogger extends BaseLogger {
    public String label() {
        return "DEBUG";
    }

    public void log(int level, String message, List<String> lines) {
        if (level >= 1) {
            lines.add("[DEBUG] " + message);
        }
        forward(level, message, lines);
    }
}
