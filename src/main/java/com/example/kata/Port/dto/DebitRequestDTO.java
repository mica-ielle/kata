package com.example.kata.Port.dto;

public class DebitRequestDTO {

    private double amountDebit;
    private double currentAmount;

    public DebitRequestDTO(double amountDebit, double currentAmount) {
        this.amountDebit = amountDebit;
        this.currentAmount = currentAmount;
    }

    public double getAmountDebit() {
        return amountDebit;
    }

    public void setAmountDebit(double amountDebit) {
        this.amountDebit = amountDebit;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }


    public String setError(){
        return "le montant a retirer "+this.amountDebit+" est superieur au solde de votre compte "+this.currentAmount;
    }
}
