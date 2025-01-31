package com.example.kata.Adapter;


import com.example.kata.Adapter.API.Controller;
import com.example.kata.Domain.model.Amount;
import com.example.kata.Port.output.AmountRepository;
import com.example.kata.Port.output.JpaAmountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;


@Component
public class DatabaseInitializer implements CommandLineRunner {
    @Autowired
    private AmountRepository amountRepository;
    @Autowired
    private JpaAmountRepository jpaAmountRepository;

    final static Logger logger = LoggerFactory.getLogger(Controller.class);

//pour initialiser le solde au lancement
    @Override
    public void run(String... args) throws Exception {

        logger.info("test initialisation amount");
        if (jpaAmountRepository.count() == 0){
            logger.info("initialisation amount");
            Amount amount = new Amount();
            amount.setAmount(0);
            amount.setDate(new Date());
            Object r = amountRepository.add(amount);


            logger.info("fin initialisation amount");
        }
    }
}
