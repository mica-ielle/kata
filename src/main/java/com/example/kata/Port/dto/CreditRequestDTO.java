package com.example.kata.Port.dto;

public class CreditRequestDTO {

    private double amountCredit;
    private double currentAmount;

    public CreditRequestDTO(double amountCredit, double currentAmount) {
        this.amountCredit = amountCredit;
        this.currentAmount = currentAmount;
    }


    public double getAmountCredit() {
        return amountCredit;
    }

    public void setAmountCredit(double amountCredit) {
        this.amountCredit = amountCredit;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }
}
