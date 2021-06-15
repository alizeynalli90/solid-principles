package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.core.service.CalculatorService;
import az.alizeynalli.cashflow.core.service.IncomeService;
import az.alizeynalli.cashflow.database.entity.Income;
import az.alizeynalli.cashflow.database.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    IncomeRepository repository;

    @Autowired
    @Qualifier(value="income")
    CalculatorService calculatorService;

    @Override
    public List<Income> getAll() {
        return repository.findAll();
    }

    @Override
    public Income get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Income create(Income income) {
        return repository.save(income);
    }

    @Override
    public Income save(Income income) {
        return repository.save(income);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Integer getTotal() {
        return calculatorService.calculateTotal(repository.findAll());
    }

}
