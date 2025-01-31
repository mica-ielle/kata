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
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;
    private Date date;
    private String type;

    public Transaction() {
    }

    public Transaction(double amount, Date date, String type) {
        this.amount = amount;
        this.date = date;
        this.type = type;
    }

    public Transaction(double amount, Date date) {
        this.amount = amount;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
