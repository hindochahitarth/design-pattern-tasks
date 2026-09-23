package Day_4.chainresponsibility.example_2;

import java.util.List;

class WarnLogger extends BaseLogger {
    public String label() {
        return "WARN";
    }

    public void log(int level, String message, List<String> lines) {
        if (level >= 3) {
            lines.add("[WARN] " + message);
        }
        forward(level, message, lines);
    }
}

