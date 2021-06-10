package az.alizeynalli.cashflow.controller;

import az.alizeynalli.cashflow.entity.Expense;
import az.alizeynalli.cashflow.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cashflow")
public class ExpenseController {

    @Autowired
    ExpenseService service;

    @GetMapping("/expenses")
    public List<Expense> getExpenses() { return service.getExpenses(); }
}
