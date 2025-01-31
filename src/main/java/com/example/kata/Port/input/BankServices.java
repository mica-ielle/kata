package com.example.kata.Port.input;

import com.example.kata.Domain.model.Amount;
import com.example.kata.Domain.model.Credit;
import com.example.kata.Domain.model.Debit;
import com.example.kata.Domain.model.Transaction;
import com.example.kata.Port.dto.CreditRequestDTO;
import com.example.kata.Port.dto.DebitRequestDTO;

import java.util.List;

public interface BankServices {

    CreditRequestDTO deposit(Credit credit);

    DebitRequestDTO debit(Debit debit);

    Amount curentAmount();

    List<Transaction> previousTransactions(int index);
}
