package com.example.kata.Adapter.Repository;

import com.example.kata.Domain.model.Deposit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepositRepository extends JpaRepository<Deposit, Integer> {
}
