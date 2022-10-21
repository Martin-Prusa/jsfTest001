package cz.martin.beans;

import cz.martin.models.HistoryItem;
import cz.martin.services.HistoryService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Named("history")
@RequestScoped
public class HistoryBean {
    @Inject
    private HistoryService service;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

    public void delete(HistoryItem item) {
        service.delete(item);
    }

    public String getFormatted(LocalDateTime time) {
        return time.format(formatter);
    }

    public List<HistoryItem> getHistory() {
        return service.getHistory();
    }
}
