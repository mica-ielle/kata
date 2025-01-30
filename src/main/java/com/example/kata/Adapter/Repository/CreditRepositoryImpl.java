package com.example.kata.Adapter.Repository;

import com.example.kata.Domain.model.Credit;
import com.example.kata.Port.output.CreditRepository;
import com.example.kata.Port.output.JpaCreditRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CreditRepositoryImpl implements CreditRepository {

    private final JpaCreditRepository jpaCreditRepository;


    public CreditRepositoryImpl(JpaCreditRepository jpaCreditRepository) {
        this.jpaCreditRepository = jpaCreditRepository;
    }

    @Override
    public Credit add(Credit credit) {
        return this.jpaCreditRepository.save(credit);
    }

    @Override
    public List<Credit> findAll() {
        return this.jpaCreditRepository.findAll();
    }
}
