package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.database.entity.Expense;
import az.alizeynalli.cashflow.core.service.CalculatorService;
import az.alizeynalli.cashflow.core.service.ExpenseService;
import az.alizeynalli.cashflow.database.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    @Autowired
    ExpenseRepository repository;

    @Autowired
    @Qualifier(value="expense")
    CalculatorService calculator;

    @Override
    public List<Expense> getExpenses() {
        return repository.findAll();
    }

    @Override
    public Expense getExpense(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void deleteExpense(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Expense createExpense(Expense expense) {
        return repository.save(expense);
    }

    @Override
    public Expense saveExpense(Expense expense) {
        return repository.save(expense);
    }

    @Override
    public Integer getTotalExpenses() {
        return calculator.calculateTotal(repository.findAll());
    }
}
