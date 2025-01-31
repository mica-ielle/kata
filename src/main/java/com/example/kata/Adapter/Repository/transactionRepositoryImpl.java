package com.example.kata.Adapter.Repository;

import com.example.kata.Domain.model.Transaction;
import com.example.kata.Port.output.JpaTransactionRepository;
import com.example.kata.Port.output.TransactionRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class transactionRepositoryImpl implements TransactionRepository {

    private final JpaTransactionRepository jpaTransactionRepository;

    public transactionRepositoryImpl(JpaTransactionRepository jpaTransactionRepository) {
        this.jpaTransactionRepository = jpaTransactionRepository;
    }

    @Override
    public Transaction add(Transaction transaction) {
        return this.jpaTransactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAll() {
        return this.jpaTransactionRepository.findAll();
    }
}
