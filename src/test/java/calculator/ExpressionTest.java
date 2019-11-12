package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ExpressionTest {
    private Expression expression;

    @ParameterizedTest
    @ValueSource(strings = {"1 + 2 - 2 * 9 / 3"})
    void expressionTest(String data) {
        expression = new Expression(data);
        Integer result = expression.getResult();
        Assertions.assertThat(result).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1 + 2 - 2"})
    void expressionTest2(String data) {
        expression = new Expression(data);
        Integer result = expression.getResult();
        Assertions.assertThat(result).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1+2"})
    void wrongInputValueTest(String data) {
        Assertions.assertThatIllegalArgumentException().isThrownBy(()-> new Expression(data));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void wrongInputValueTest2(String data) {
        Assertions.assertThatIllegalArgumentException().isThrownBy(()-> new Expression(data));
    }

}