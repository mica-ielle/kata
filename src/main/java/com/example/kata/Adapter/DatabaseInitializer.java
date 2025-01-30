package com.example.kata.Adapter;


import com.example.kata.Domain.model.Amount;
import com.example.kata.Port.output.AmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DatabaseInitializer implements CommandLineRunner {
    @Autowired
    private AmountRepository amountRepository;


    @Override
    public void run(String... args) throws Exception {

        System.out.println("______________________"+amountRepository.currentAmount()+"_______________");
        if (amountRepository.currentAmount().getAmount() == 0){
            System.out.println("______________________A_______________");
            Amount amount = new Amount();
            amount.setAmount(0);
            amount.setDepositDate(LocalDate.now());
            Object r = amountRepository.add(amount);

            System.out.println("______________________"+amount.getAmount()+"_______________");
            System.out.println("______________________"+amount.getDepositDate()+"_______________");
            System.out.println("______________________"+amount.getId()+"_______________");
            System.out.println("______________________"+amountRepository.currentAmount()+"_______________");
        }
        System.out.println("______________________"+amountRepository.currentAmount()+"_______________");
    }
}
