package com.example.kata.Adapter.Repository;

import com.example.kata.Domain.model.Debit;
import com.example.kata.Port.output.DebitRepository;
import com.example.kata.Port.output.JpaDebitRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DebitRepositoryImpl implements DebitRepository {


    private final JpaDebitRepository jpaDebitRepository;

    public DebitRepositoryImpl(JpaDebitRepository jpaDebitRepository) {
        this.jpaDebitRepository = jpaDebitRepository;
    }

    @Override
    public Debit add(Debit debit) {
        return this.jpaDebitRepository.save(debit);
    }

    @Override
    public List<Debit> findAll() {
        return this.jpaDebitRepository.findAll();
    }
}
