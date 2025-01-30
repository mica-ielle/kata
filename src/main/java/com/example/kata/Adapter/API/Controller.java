package com.example.kata.Adapter.API;

import com.example.kata.Domain.model.Credit;
import com.example.kata.Domain.Services.BankServicesImpl;
import com.example.kata.Port.dto.CreditRequestDTO;
import com.example.kata.Port.input.BankServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

        CreditRequestDTO reponse = bankServices.deposit(newCredit);

        logger.info("end of deposit process...");
        return reponse;
    }
}
