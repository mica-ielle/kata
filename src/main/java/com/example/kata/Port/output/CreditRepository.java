package com.example.kata.Port.output;

import com.example.kata.Domain.model.Credit;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditRepository{

    public Credit add(Credit credit);
    public List<Credit> findAll();
}
