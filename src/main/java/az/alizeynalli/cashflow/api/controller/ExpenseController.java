package az.alizeynalli.cashflow.api.controller;

import az.alizeynalli.cashflow.database.entity.Expense;
import az.alizeynalli.cashflow.core.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cashflow")
public class ExpenseController {

    @Autowired
    ExpenseService service;

    @GetMapping("/expenses")
    public List<Expense> getExpenses() { return service.getExpenses(); }

    @GetMapping("/expense/{id}")
    public Expense getExpense(@PathVariable("id") Long id) {
        return service.getExpense(id);
    }

    @DeleteMapping("/expense/{id}")
    public void deleteExpense(@PathVariable("id") Long id) {
        service.deleteExpense(id);
    }

    @PostMapping("/expense")
    public Expense createExpense(@RequestBody Expense expense) {
        return service.createExpense(expense);
    }

    @PutMapping("/expense")
    public Expense saveExpense(@RequestBody Expense expense) {
        return service.saveExpense(expense);
    }

    @GetMapping("/expense/total")
    public Integer getTotalExpenses(){
        return service.getTotalExpenses();
    }
}
