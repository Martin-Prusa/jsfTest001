package cz.martin.services;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class FactorialService {

    @Inject
    private HistoryService historyService;

    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
        this.historyService.newItem(n, result);
        return result;
    }
}
