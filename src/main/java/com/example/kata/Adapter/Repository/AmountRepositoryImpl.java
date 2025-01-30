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

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class AmountRepositoryImpl implements AmountRepository {

    private final JpaAmountRepository jpaAmountRepository;


    public AmountRepositoryImpl(JpaAmountRepository jpaAmountRepository) {
        this.jpaAmountRepository = jpaAmountRepository;
    }

    @Override
    public Amount add(Amount amount) {
        return this.jpaAmountRepository.save(amount);
    }

    @Override
    public Amount currentAmount() {
        List<Amount> l = jpaAmountRepository.findAll();
        if(l.size()==0){
            return new Amount(0, LocalDate.now());
        }else {
            int index = l.size();
            return l.get(index-1);
        }

    }
}
