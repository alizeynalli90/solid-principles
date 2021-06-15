package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.core.service.CalculatorService;
import az.alizeynalli.cashflow.database.entity.Expense;
import org.springframework.stereotype.Component;

import java.util.List;

@Component(value="expense")
public class ExpenseCalculatorServiceImpl implements CalculatorService<Expense> {

    @Override
    public Integer calculateTotal(List<Expense> list) {
        int integer = list.stream().map(expense -> expense.getAmount().intValue()).reduce(0, (a,b) -> a+b);
        return Integer.valueOf(integer);
    }
}
