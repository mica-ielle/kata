package com.example.kata.Domain.model;

import jakarta.persistence.*;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@ToString
public class Credit extends Transaction{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;
    private Date depositDate;

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

    public Date getDepositDate() {
        return depositDate;
    }

    public void setDepositDate() {
        this.depositDate = new Date();
    }
}
