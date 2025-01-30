package com.example.kata.Domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class Amount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;
    private LocalDate depositDate;

    public Amount() {
    }

    public Amount(double amount, LocalDate depositDate) {
        this.amount = amount;
        this.depositDate = depositDate;
    }

    public Amount(int id, double amount, LocalDate depositDate) {
        this.id = id;
        this.amount = amount;
        this.depositDate = depositDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDepositDate() {
        return depositDate;
    }

    public void setDepositDate(LocalDate depositDate) {
        this.depositDate = depositDate;
    }
}
