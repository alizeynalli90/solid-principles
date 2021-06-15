package az.alizeynalli.cashflow.core.service;

import java.util.List;

public interface CalculatorService<T> extends  Service {
    Integer calculateTotal(List<T> list);

}
