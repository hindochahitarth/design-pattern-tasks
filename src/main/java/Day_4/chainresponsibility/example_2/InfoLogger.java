package Day_4.chainresponsibility.example_2;

import java.util.List;

class InfoLogger extends BaseLogger {
    public String label() {
        return "INFO";
    }

    public void log(int level, String message, List<String> lines) {
        if (level >= 2) {
            lines.add("[INFO] " + message);
        }
        forward(level, message, lines);
    }
}


