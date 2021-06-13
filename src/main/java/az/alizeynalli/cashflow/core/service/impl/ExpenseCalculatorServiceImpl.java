package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.core.service.CalculatorService;
import az.alizeynalli.cashflow.repository.ExpenseRepository;
import az.alizeynalli.cashflow.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="expense")
public class ExpenseCalculatorServiceImpl implements CalculatorService {

    @Autowired
    ExpenseRepository repository;

    public ExpenseCalculatorServiceImpl() {
        this.repository = repository;
    }

    @Override
    public Integer calculateTotal() {
        int integer = repository.findAll().stream().map(income -> income.getAmount().intValue()).reduce(0, (a,b) -> a+b);
        return Integer.valueOf(integer);
    }
}
