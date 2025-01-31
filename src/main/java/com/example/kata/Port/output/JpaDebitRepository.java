package com.example.kata.Port.output;


import com.example.kata.Domain.model.Debit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaDebitRepository extends JpaRepository<Debit, Integer> {
}
