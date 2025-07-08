package com.example.LibraryManagmentSystem.controller;

import com.example.LibraryManagmentSystem.entity.Loan;
import com.example.LibraryManagmentSystem.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @PostMapping("/loan/add")
    public void addLoan(@RequestBody Loan loan){
        loanService.addLoan(loan);
    }

    @GetMapping("/loan/get")
    public List<Loan> getAllLoan(){
        return loanService.getAllLoan();
    }

    @PutMapping("/loan/update/{id}")
    public void updateLoan(@PathVariable Long id, @RequestBody Loan loan){
        loanService.updateLoan(id,loan);
    }

    @DeleteMapping("/loan/delete/{id}")
    public void DeleteLoan(@PathVariable Long id){
        loanService.DeleteLoan(id);

    }

}
