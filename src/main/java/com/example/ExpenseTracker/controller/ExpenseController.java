package com.example.ExpenseTracker.controller;

import com.example.ExpenseTracker.entity.Expense;
import com.example.ExpenseTracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="*")
@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService service;

    @PostMapping
    public Expense addExpense(@RequestBody Expense expense){
        return service.addExpense(expense);
    }

    @GetMapping
    public List<Expense> getAll(){
        return service.getAllExpenses();
    }

    @PutMapping("/{id}")
    public Expense update(@PathVariable Long id,
                          @RequestBody Expense expense){
        return service.updateExpense(id, expense);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){
        service.deleteExpense(id);
        return "Deleted Successfully";
    }
}
