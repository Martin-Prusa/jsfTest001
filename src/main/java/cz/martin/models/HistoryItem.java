package cz.martin.models;

import java.time.LocalDateTime;

public class HistoryItem {
    private int input;
    private int output;
    private LocalDateTime time;

    public HistoryItem(int input, int output, LocalDateTime time) {
        this.input = input;
        this.output = output;
        this.time = time;
    }

    public int getInput() {
        return input;
    }

    public int getOutput() {
        return output;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
