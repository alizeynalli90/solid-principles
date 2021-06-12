package az.alizeynalli.cashflow.core.service;

import az.alizeynalli.cashflow.core.entity.Expense;

import java.util.List;

public interface ExpenseService {
    List<Expense> getExpenses();

    Expense getExpense(Long id);

    void deleteExpense(Long id);

    Expense createExpense(Expense expense);

    Expense saveExpense(Expense expense);
}
