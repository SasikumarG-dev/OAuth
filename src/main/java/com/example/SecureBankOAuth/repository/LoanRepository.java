package com.example.SecureBankOAuth.repository;

import com.example.SecureBankOAuth.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
}
