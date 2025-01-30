package com.example.kata.Port.output;

import com.example.kata.Domain.model.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface JpaCreditRepository extends JpaRepository<Credit, Integer> {
}
