package az.alizeynalli.cashflow.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "expense")
public class Expense {

    private long id;
    private String description;
    private BigDecimal amount;

    public Expense() {
    }

    public Expense(long id, String description, BigDecimal amount) {
        this.id = id;
        this.description = description;
        this.amount = amount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Column(name = "amount", nullable = false)
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
