package az.alizeynalli.cashflow.core.service;

import az.alizeynalli.cashflow.database.entity.Expense;
import az.alizeynalli.cashflow.database.entity.Income;

public interface ExpenseConverterService extends ConverterService {
    Expense convertExpense(Expense expense);
}
