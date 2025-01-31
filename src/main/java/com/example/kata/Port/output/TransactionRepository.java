package com.example.kata.Port.output;

import com.example.kata.Domain.model.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository {
    public Transaction add(Transaction transaction);
    public List<Transaction> findAll();
}
