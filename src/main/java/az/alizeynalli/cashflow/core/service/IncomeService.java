package az.alizeynalli.cashflow.core.service;

import az.alizeynalli.cashflow.core.entity.Income;

import java.util.List;

public interface IncomeService {

    List<Income> getIncomes();

    Income getIncome(Long id);

    void deleteIncome(Long id);

    Income createIncome(Income income);

    Income saveIncome(Income income);
}
