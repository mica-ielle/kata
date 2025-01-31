package com.example.kata.Port.output;

import com.example.kata.Domain.model.Debit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DebitRepository {

    public Debit add(Debit debit);
    public List<Debit> findAll();
}
