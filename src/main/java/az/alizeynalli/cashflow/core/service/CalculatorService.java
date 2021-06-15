package az.alizeynalli.cashflow.core.service;

import org.apache.catalina.LifecycleState;

import java.math.BigDecimal;
import java.util.List;

public interface CalculatorService<T> extends  Service {
    Integer calculateTotal(List<T> list);

}
