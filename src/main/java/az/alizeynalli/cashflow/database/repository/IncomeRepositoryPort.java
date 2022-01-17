package az.alizeynalli.cashflow.database.repository;

import az.alizeynalli.cashflow.database.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepositoryPort extends JpaRepository<Income, Long> {
}
