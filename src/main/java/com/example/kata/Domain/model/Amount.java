package com.example.kata.Domain.model;

import jakarta.persistence.*;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Entity
@ToString
public class Amount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;
    private Date date;

    public Amount() {
    }

    public Amount(double amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public Amount(int id, double amount, Date date) {
        this.id = id;
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

    public void setDate(Date date) {
        this.date = date;
    }
}
