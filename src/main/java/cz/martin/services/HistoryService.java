package cz.martin.services;

import cz.martin.models.HistoryItem;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
public class HistoryService implements Serializable {
    private List<HistoryItem> history = new ArrayList<>();

    public void newItem(int in, int out) {
        this.history.add(new HistoryItem(in, out, LocalDateTime.now()));
    }

    public void delete(HistoryItem item) {
        this.history.remove(item);
    }

    public List<HistoryItem> getHistory() {
        return history;
    }
}
