package cz.martin.beans;

import cz.martin.services.FactorialService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@RequestScoped
@Named("factorial")
public class FactorialBean {

    @Inject
    private FactorialService factorialService;
    private int number = 1;
    private boolean showResult = false;
    private boolean showError = false;
    private int result = 0;

    public void submit() {
        if(this.number < 1) {
            showError = true;
            showResult = false;
            return;
        }
        this.showError = false;
        this.showResult = true;
        this.result = factorialService.calculateFactorial(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isShowResult() {
        return showResult;
    }

    public boolean isShowError() {
        return showError;
    }

    public int getResult() {
        return result;
    }
}
