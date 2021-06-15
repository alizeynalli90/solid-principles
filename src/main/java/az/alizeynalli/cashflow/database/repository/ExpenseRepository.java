package az.alizeynalli.cashflow.database.repository;

import az.alizeynalli.cashflow.database.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
