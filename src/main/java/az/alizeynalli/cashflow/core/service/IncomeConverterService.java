package az.alizeynalli.cashflow.core.service;

import az.alizeynalli.cashflow.database.entity.Expense;
import az.alizeynalli.cashflow.database.entity.Income;

public interface IncomeConverterService extends ConverterService {
    Income convertIncome(Income income);
}
