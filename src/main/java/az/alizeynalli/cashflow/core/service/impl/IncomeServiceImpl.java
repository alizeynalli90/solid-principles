package az.alizeynalli.cashflow.core.service.impl;

import az.alizeynalli.cashflow.core.service.IncomeServicePort;
import az.alizeynalli.cashflow.database.entity.Income;
import az.alizeynalli.cashflow.database.repository.IncomeRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeServicePort {

    @Autowired
    IncomeRepositoryPort repository;

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
}
