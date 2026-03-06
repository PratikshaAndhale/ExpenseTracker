package com.example.ExpenseTracker.service;

import com.example.ExpenseTracker.entity.Expense;
import com.example.ExpenseTracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository repository;

    public Expense addExpense(Expense expense){
        return repository.save(expense);
    }

    public List<Expense> getAllExpenses(){
        return repository.findAll();
    }

    public Expense updateExpense(Long id, Expense newExpense){

        Expense expense = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Expense not found"));

        expense.setTitle(newExpense.getTitle());
        expense.setAmount(newExpense.getAmount());
        expense.setCategory(newExpense.getCategory());
        expense.setDescription(newExpense.getDescription());
        expense.setDate(newExpense.getDate());

        return repository.save(expense);
    }

    public void deleteExpense(Long id){
        repository.deleteById(id);
    }

}
