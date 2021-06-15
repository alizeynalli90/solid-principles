package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.core.service.CalculatorService;
import az.alizeynalli.cashflow.database.entity.Income;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value="income")
public class IncomeCalculatorServiceImpl implements CalculatorService<Income> {

    @Override
    public Integer calculateTotal(List<Income> list) {
        int integer = list.stream().map(income -> income.getAmount().intValue()).reduce(0, (a,b) -> a+b);
        return Integer.valueOf(integer);
    }
}
