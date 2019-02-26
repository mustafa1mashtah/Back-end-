package at.nacs.ex5thecalculator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@RequiredArgsConstructor


public class Calculator {
    private final Set<Operation> operations;


    public Double calculate(Expression expression) {


        return operations.stream()
                .filter(e -> e.equals(expression.getSymbol()))
                .map(e -> e.apply(expression))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
