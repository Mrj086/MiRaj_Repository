package com.example.LibraryManagmentSystem.service;


import com.example.LibraryManagmentSystem.entity.Loan;
import com.example.LibraryManagmentSystem.repository.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class LoanService {

    private final LoanRepository loanRepository;


    public void addLoan(Loan loan) {
        Loan loan1 = new Loan();
        loan1.setBorrowDate(loan.getBorrowDate());
        loan1.setDueDate(loan.getDueDate());
        loan1.setReturnDate(loan.getReturnDate());
        loan1.setStatus(loan.getStatus());
        loanRepository.save(loan);

    }

    public List<Loan> getAllLoan() {
        return loanRepository.findAll();
    }

    public void updateLoan(Long id, Loan loan) {
        Loan loan1 = loanRepository.findById(id).get();
        loan1.setBorrowDate(loan.getBorrowDate());
        loan1.setDueDate(loan.getDueDate());
        loan1.setStatus(loan.getStatus());

    }

    public void DeleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}

