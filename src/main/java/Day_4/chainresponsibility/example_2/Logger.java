package Day_4.chainresponsibility.example_2;

import java.util.List;

interface Logger {
    String label();

    void setNext(Logger next);

    Logger getNext();

    void log(int level, String message, List<String> lines);
}