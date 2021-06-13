package az.alizeynalli.cashflow.controller;

import az.alizeynalli.cashflow.core.entity.Expense;
import az.alizeynalli.cashflow.core.entity.Income;
import az.alizeynalli.cashflow.core.service.IncomeService;
import az.alizeynalli.cashflow.core.service.impl.IncomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cashflow")
public class IncomeController {

    @Autowired
    IncomeService service;

    @GetMapping("/incomes")
    public List<Income> getIncomes() { return service.getIncomes(); }

    @GetMapping("/income/{id}")
    public Income getIncome(@PathVariable("id") Long id) {
        return service.getIncome(id);
    }

    @DeleteMapping("/income/{id}")
    public void deleteIncome(@PathVariable("id") Long id) {
        service.deleteIncome(id);
    }

    @PostMapping("/income")
    public Income createIncome(@RequestBody Income income) {
        return service.createIncome(income);
    }

    @PutMapping("/income")
    public Income saveIncome(@RequestBody Income income) {
        return service.saveIncome(income);
    }

    @GetMapping("/income/total")
    public Integer getTotalIncomes(){
        return service.getTotalIncomes();
    }
}
