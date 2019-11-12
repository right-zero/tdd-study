package calculator;

import java.util.Stack;

public class Operator {
    private Stack<String> operators = new Stack<>();

    public Stack<String> getOperators() {
        return operators;
    }

    public void addOperator(String item) {
        operators.push(item);
    }

    public String getOperator() {
        return operators.pop();
    }

}
