package com.example.kata.Domain.model;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@ToString
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;
    private LocalDate depositDate;

    public Credit() {
    }

    public Credit(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }
    public Credit(double amount) {
        this.amount = amount;
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

    public void setDepositDate() {
        this.depositDate = LocalDate.now();
    }
}
