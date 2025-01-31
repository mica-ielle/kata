package com.example.kata.Domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@ToString
public class Debit extends Transaction{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double amount;
    private Date debitDate;

    public Debit() {
    }

    public Debit(double amount) {
        this.amount = amount;
    }

    public Debit(int id, double amount) {
        this.id = id;
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

    public Date getDebitDate() {
        return debitDate;
    }

    public void setDebitDate() {
        this.debitDate = new Date();
    }
}
