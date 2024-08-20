package com.example.SecureBankOAuth.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    private static final Logger log = LoggerFactory.getLogger(BalanceController.class);

    @GetMapping("/myBalance")
    public  String getBalanceDetails () {
        log.info("my balance");
        return "Here are the balance details from the DB";
    }

}
