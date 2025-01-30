package com.example.kata.Adapter.Repository;

import com.example.kata.Domain.model.Credit;
import com.example.kata.Port.output.CreditRepository;
import com.example.kata.Port.output.JpaCreditRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CreditRepositoryImpl implements CreditRepository {

    private final JpaCreditRepository jpaCreditRepository;

    private final EntityManager entityManager;

    public CreditRepositoryImpl(JpaCreditRepository jpaCreditRepository, EntityManager entityManager) {
        this.jpaCreditRepository = jpaCreditRepository;
        this.entityManager = entityManager;
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
