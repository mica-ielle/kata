package com.example.kata.Domain.Services;

import com.example.kata.Domain.model.Debit;
import com.example.kata.Domain.model.Transaction;
import com.example.kata.Port.dto.CreditRequestDTO;
import com.example.kata.Domain.model.Amount;
import com.example.kata.Domain.model.Credit;
import com.example.kata.Port.dto.DebitRequestDTO;
import com.example.kata.Port.input.BankServices;
import com.example.kata.Port.output.AmountRepository;
import com.example.kata.Port.output.CreditRepository;
import com.example.kata.Port.output.DebitRepository;
import com.example.kata.Port.output.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BankServicesImpl implements BankServices {

    private CreditRepository creditRepository;
    private DebitRepository debitRepository;
    private TransactionRepository transactionRepository;
    private AmountRepository amountRepository;


    public BankServicesImpl(CreditRepository creditRepository, DebitRepository debitRepository, TransactionRepository transactionRepository, AmountRepository amountRepository) {
        this.creditRepository = creditRepository;
        this.debitRepository = debitRepository;
        this.transactionRepository = transactionRepository;
        this.amountRepository = amountRepository;
    }

    //function to manage the money credit process
    @Override
    public CreditRequestDTO deposit(Credit credit){

        //registrate credit transaction
        creditRepository.add(credit);
        transactionRepository.add(credit);
        //increase curent amount
        double amount = amountRepository.currentAmount().getAmount();
        double na = amount+ credit.getAmount();
        Amount newAmount = new Amount(na, credit.getDepositDate());
        amountRepository.add(newAmount);

        //account credit of .. new amount is ..
        return new CreditRequestDTO(credit.getAmount(),newAmount.getAmount());
    }


    //function to manage the money debit process
    @Override
    public DebitRequestDTO debit(Debit debit) {

        //registrate debit transaction
        debitRepository.add(debit);
        transactionRepository.add(debit);
        //decrease curent amount
        double amount = amountRepository.currentAmount().getAmount();

        if(debit.getAmount()<amount){
            double na = amount- debit.getAmount();
            Amount newAmount = new Amount(na, debit.getDebitDate());
            amountRepository.add(newAmount);

            DebitRequestDTO d = new DebitRequestDTO(debit.getAmount(),newAmount.getAmount());
            d.setDebitStatut();

            //account credit of .. new amount is ..
            return d;
        }else {
            DebitRequestDTO d = new DebitRequestDTO(debit.getAmount(),amount);
            d.setDebitStatut();
            return d;
        }


    }

    @Override
    public Amount curentAmount() {
        return amountRepository.currentAmount();
    }

    @Override
    public List<Transaction> previousTransactions(int index) {
        List<Transaction> transactionList = transactionRepository.findAll();

        return transactionList.subList(0,index);
    }
}
