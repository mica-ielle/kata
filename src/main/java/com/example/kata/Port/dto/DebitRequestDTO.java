package com.example.kata.Port.dto;

import com.example.kata.Domain.model.Amount;

public class DebitRequestDTO {

    private double amountDebit;
    private double currentAmount;
    private boolean debitStatut;

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

    public boolean isDebitStatut() {
        return debitStatut;
    }

    public void setDebitStatut() {
        if(amountDebit<currentAmount){
            this.debitStatut = true;
        }else {
            this.debitStatut = false;
        }
    }
}
