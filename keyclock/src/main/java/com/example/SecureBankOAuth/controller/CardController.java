package com.example.SecureBankOAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @GetMapping("/myCard")
    public  String getCardsDetails () {
        return "Here are the card details from the DB";
    }

}
