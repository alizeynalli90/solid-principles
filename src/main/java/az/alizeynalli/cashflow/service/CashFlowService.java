package az.alizeynalli.cashflow.service;

import az.alizeynalli.cashflow.entity.Expense;
import az.alizeynalli.cashflow.entity.Income;
import az.alizeynalli.cashflow.repository.ExpenseRepository;
import az.alizeynalli.cashflow.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashFlowService {

    @Autowired
    IncomeRepository incomeRepository;

    @Autowired
    ExpenseRepository expenseRepository;


    public List<Income> getIncomes() {
        return incomeRepository.findAll();
    }

    public List<Expense> getExpenses() {
        return expenseRepository.findAll();
    }
}
