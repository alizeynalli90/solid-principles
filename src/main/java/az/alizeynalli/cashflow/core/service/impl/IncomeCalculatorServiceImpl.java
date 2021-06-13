package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.core.service.CalculatorService;
import az.alizeynalli.cashflow.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component(value="income")
public class IncomeCalculatorServiceImpl implements CalculatorService {

    @Autowired
    IncomeRepository repository;

    @Override
    public Integer calculateTotal() {
        int integer = repository.findAll().stream().map(income -> income.getAmount().intValue()).reduce(0, (a,b) -> a+b);
        return Integer.valueOf(integer);
    }
}
