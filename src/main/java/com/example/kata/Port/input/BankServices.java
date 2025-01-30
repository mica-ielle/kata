package com.example.kata.Port.input;

import com.example.kata.Domain.model.Credit;
import com.example.kata.Domain.model.Debit;
import com.example.kata.Port.dto.CreditRequestDTO;
import com.example.kata.Port.dto.DebitRequestDTO;

public interface BankServices {

    CreditRequestDTO deposit(Credit credit);

    Object debit(Debit debit);
}
