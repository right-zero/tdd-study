package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public enum Calculator {
    ADD((leftOperand, rightOperand) -> leftOperand + rightOperand),
    SUB((leftOperand, rightOperand) -> leftOperand - rightOperand),
    MUL((leftOperand, rightOperand) -> leftOperand * rightOperand),
    DIV((leftOperand, rightOperand) -> leftOperand / rightOperand);

    private static final Map<String, Calculator> OPERATORS;

    private BiFunction<Integer, Integer, Integer> expression;

    Calculator(BiFunction<Integer, Integer, Integer> expression) {
        this.expression = expression;
    }

    static {
        OPERATORS = new HashMap<>();
        OPERATORS.put("+", Calculator.ADD);
        OPERATORS.put("-", Calculator.SUB);
        OPERATORS.put("*", Calculator.MUL);
        OPERATORS.put("/", Calculator.DIV);
    }

    public Integer calculate(Integer leftOperand, Integer rightOperand) {
        return expression.apply(leftOperand, rightOperand);
    }

    public static Calculator getOperators(String input) {
        return OPERATORS.get(input);
    }

}
