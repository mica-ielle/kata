package com.example.kata.Domain.model;


import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@ToString
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String AcountNumber;
    private String ReceiverName;
    private int amount;
    private String DepositReason;

    public Deposit() {
    }

    public Deposit(int id, String acountNumber, String receiverName, int amount, String depositReason) {
        this.id = id;
        AcountNumber = acountNumber;
        ReceiverName = receiverName;
        this.amount = amount;
        DepositReason = depositReason;
    }

    public Deposit(String acountNumber, String receiverName, int amount, String depositReason) {
        AcountNumber = acountNumber;
        ReceiverName = receiverName;
        this.amount = amount;
        DepositReason = depositReason;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcountNumber() {
        return AcountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        AcountNumber = acountNumber;
    }

    public String getReceiverName() {
        return ReceiverName;
    }

    public void setReceiverName(String receiverName) {
        ReceiverName = receiverName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDepositReason() {
        return DepositReason;
    }

    public void setDepositReason(String depositReason) {
        DepositReason = depositReason;
    }
}
