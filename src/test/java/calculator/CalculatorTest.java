package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private int[] operands;

    @Test
    void addTest() {
        Calculator calculator = Calculator.calculator().get("+");
        Integer result = calculator.calculate(operands[0], operands[1]);
        Assertions.assertThat(result).isEqualTo(8);
    }

    @Test
    void subTest() {
        Calculator calculator = Calculator.calculator().get("-");
        Integer result = calculator.calculate(operands[0], operands[1]);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void mulTest() {
        Calculator calculator = Calculator.calculator().get("*");
        Integer result = calculator.calculate(operands[0], operands[1]);
        Assertions.assertThat(result).isEqualTo(15);
    }

    @Test
    void divTest() {
        Calculator calculator = Calculator.calculator().get("/");
        Integer result = calculator.calculate(operands[0], operands[1]);
        Assertions.assertThat(result).isEqualTo(1);
    }

    @BeforeEach
    void setUp() {
        this.operands = new int[] {5, 3};
    }

}