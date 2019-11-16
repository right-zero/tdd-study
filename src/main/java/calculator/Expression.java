package calculator;

public class Expression {
    private final static String OPERATOR = " ";
    private final static int OPERATOR_LOOP_ZERO = 0;

    private String[] expressions;
    private Number number = new Number();
    private Operator operator = new Operator();

    public Expression(String expression) {
        expressionValidate(expression);
        this.expressions = expression.split(OPERATOR);
    }

    private void expressionValidate(String expression) {
        if ("".equals(expression) || expression == null) {
            throw new IllegalArgumentException("입력 표현식이 잘못 됐습니다.");
        }
        if (!expression.contains(" ")) {
            throw new IllegalArgumentException("입력 표현식이 잘못 됐습니다.");
        }
    }

    private void distributeNumberAndOperator() {
        for (int i = expressions.length - 1; i >= 0; i--) {
            numberValidate(expressions[i]);
        }
    }

    private void numberValidate(String item) {
        try {
            number.addNumber(Integer.parseInt(item));
        } catch (Exception e) {
            operator.addOperator(item);
        }
    }

    public Integer getResult() {
        distributeNumberAndOperator();
        int size = operator.getOperators().size();

        for (int i = OPERATOR_LOOP_ZERO; i < size; i++) {
            Integer sum = Calculator.getOperators(operator.getOperator()).calculate(number.getNumber(), number.getNumber());
            number.addNumber(sum);
        }

        return number.getNumber();
    }

}
