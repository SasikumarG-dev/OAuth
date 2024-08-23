package com.example.SecureBankOAuth.service.impl;

import com.example.SecureBankOAuth.service.LoanService;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl implements LoanService {
    @Override
    public String applyLoan() {
        return "Loan applied Successfully";
    }
}
