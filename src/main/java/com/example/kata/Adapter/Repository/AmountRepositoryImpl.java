package com.example.kata.Adapter.Repository;

import com.example.kata.Domain.model.Amount;
import com.example.kata.Port.output.AmountRepository;
import com.example.kata.Port.output.JpaAmountRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class AmountRepositoryImpl implements AmountRepository {

    private final JpaAmountRepository jpaAmountRepository;

    private final EntityManager entityManager;

    public AmountRepositoryImpl(JpaAmountRepository jpaAmountRepository, EntityManager entityManager) {
        this.jpaAmountRepository = jpaAmountRepository;
        this.entityManager = entityManager;
    }

    @Override
    public Amount add(Amount amount) {
        return this.jpaAmountRepository.save(amount);
    }

    @Override
    public Amount currentAmount() {
        List<Amount> l = jpaAmountRepository.findAll();
        int index = l.size();

        return l.get(index);
    }
}
