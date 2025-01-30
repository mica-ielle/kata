package com.example.kata.Port.input;

import com.example.kata.Domain.model.Credit;
import com.example.kata.Port.dto.CreditRequestDTO;

public interface BankServices {

    CreditRequestDTO deposit(Credit credit);
}
