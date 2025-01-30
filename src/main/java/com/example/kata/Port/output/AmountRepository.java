package com.example.kata.Port.output;

import com.example.kata.Domain.model.Amount;
import com.example.kata.Domain.model.Credit;
import com.example.kata.Port.dto.CreditRequestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AmountRepository{


    public Amount add(Amount amount);
    public Amount currentAmount();
}
