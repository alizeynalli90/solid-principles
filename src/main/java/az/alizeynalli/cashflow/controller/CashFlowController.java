package az.alizeynalli.cashflow.controller;

import az.alizeynalli.cashflow.entity.Expense;
import az.alizeynalli.cashflow.entity.Income;
import az.alizeynalli.cashflow.service.CashFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cashflow")
public class CashFlowController {

    @Autowired
    CashFlowService service;

    @GetMapping("/incomes")
    public List<Income> getIncomes() { return service.getIncomes(); }

    @GetMapping("/expenses")
    public List<Expense> getExpenses() { return service.getExpenses(); }
}
