package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.core.service.ConverterService;
import az.alizeynalli.cashflow.core.service.ExpenseConverterService;
import az.alizeynalli.cashflow.core.service.IncomeConverterService;
import az.alizeynalli.cashflow.database.entity.Expense;
import az.alizeynalli.cashflow.database.entity.Income;
import org.springframework.stereotype.Component;

@Component
public class ExpenseConverterServiceImpl implements ExpenseConverterService {

    @Override
    public Expense convertExpense(Expense expense) {
        //convert expense here
        return expense;
    }
}
