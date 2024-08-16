package com.example.SecureBankOAuth.controller;

import com.example.SecureBankOAuth.service.LoanService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/loan")
public class LoanController {

    private LoanService loanService;

    @GetMapping("/apply")
    public String applyLoan(){
        return loanService.applyLoan();
    }

    @GetMapping("/{loanId}")
    public String getLoanById(@PathVariable String loanId){
        return "Loan "+loanId;
    }

    @GetMapping("/loans")
    public String getLoans(){
        return "Loans ";
    }
}
