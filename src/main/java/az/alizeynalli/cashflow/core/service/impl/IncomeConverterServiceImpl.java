package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.core.service.ConverterService;
import az.alizeynalli.cashflow.core.service.IncomeConverterService;
import az.alizeynalli.cashflow.database.entity.Expense;
import az.alizeynalli.cashflow.database.entity.Income;
import org.springframework.stereotype.Component;

@Component
public class IncomeConverterServiceImpl implements IncomeConverterService {

    @Override
    public Income convertIncome(Income income) {
        // convert income here
        return income;
    }
}
