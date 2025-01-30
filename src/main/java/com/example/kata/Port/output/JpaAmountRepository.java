package com.example.kata.Port.output;

import com.example.kata.Domain.model.Amount;
import com.example.kata.Domain.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaAmountRepository extends JpaRepository<Amount, Integer> {
}
