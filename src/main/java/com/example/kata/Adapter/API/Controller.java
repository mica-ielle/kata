package com.example.kata.Adapter.API;

import com.example.kata.Domain.model.Amount;
import com.example.kata.Domain.model.Credit;
import com.example.kata.Domain.Services.BankServicesImpl;
import com.example.kata.Domain.model.Debit;
import com.example.kata.Domain.model.Transaction;
import com.example.kata.Port.dto.CreditRequestDTO;
import com.example.kata.Port.dto.DebitRequestDTO;
import com.example.kata.Port.input.BankServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bankService")
public class Controller {

    final static Logger logger = LoggerFactory.getLogger(Controller.class);

    private BankServices bankServices;
    @Autowired
    public Controller(BankServices bankServices) {
        this.bankServices = bankServices;
    }

    @PostMapping("/deposit")
    public CreditRequestDTO deposit(@RequestBody Credit newCredit){
        logger.info("starting deposit process...");

        newCredit.setDepositDate();
        newCredit.setDate();
        CreditRequestDTO reponse = bankServices.deposit(newCredit);

        logger.info("end of deposit process...");
        return reponse;
    }

    @PostMapping("/debit")
    public DebitRequestDTO debit(@RequestBody Debit newDebit){
        logger.info("starting debit process...");

        newDebit.setDebitDate();
        newDebit.setDate();
        DebitRequestDTO reponse = bankServices.debit(newDebit);

        logger.info("end of debit process...");
        return reponse;
    }

    @GetMapping("/solde")
    public Amount debit(){
        logger.info("getting current amount...");

        Amount reponse = bankServices.curentAmount();

        logger.info("current amount getted...");
        return reponse;
    }

    @GetMapping("/previous/{index}")
    public List<Transaction> previous(@PathVariable("index") int index){
        logger.info("getting previous transactions amount...");

        List<Transaction> reponse = bankServices.previousTransactions(index);

        logger.info("previous transactions getted...");
        return reponse;
    }
}
