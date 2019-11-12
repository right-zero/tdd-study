package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public enum Calculator {
    ADD((leftOperand, rightOperand) -> leftOperand + rightOperand),
    SUB((leftOperand, rightOperand) -> leftOperand - rightOperand),
    MUL((leftOperand, rightOperand) -> leftOperand * rightOperand),
    DIV((leftOperand, rightOperand) -> leftOperand / rightOperand);

    private BiFunction<Integer, Integer, Integer> expression;

    Calculator(BiFunction<Integer, Integer, Integer> expression) {
        this.expression = expression;
    }

    public Integer calculate(Integer leftOperand, Integer rightOperand) {
        return expression.apply(leftOperand, rightOperand);
    }

    public static Map<String, Calculator> calculator() {
        Map<String, Calculator> map = new HashMap<>();
        map.put("+", Calculator.ADD);
        map.put("-", Calculator.SUB);
        map.put("*", Calculator.MUL);
        map.put("/", Calculator.DIV);
        return map;
    }

}
