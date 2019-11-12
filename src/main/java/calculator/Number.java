package calculator;

import java.util.Stack;

public class Number {
    private Stack<Integer> numbers = new Stack<>();

    public Stack<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(Integer number) {
        numbers.push(number);
    }

    public Integer getNumber() {
        return numbers.pop();
    }
}
