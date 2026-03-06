package com.example.ExpenseTracker.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
public class ExpenseDto {
    private String title;
    private Double amount;
    private String category;
    private String description;
    private LocalDate date;
}
