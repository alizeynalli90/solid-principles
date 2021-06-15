package az.alizeynalli.cashflow.database.repository;

import az.alizeynalli.cashflow.database.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {
}
