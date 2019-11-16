package racingcar;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RacingGameTest {

    @ParameterizedTest
    @ValueSource(strings = {"tom,jo,jayden,yohan,john,timothy"})
    public void splitTest(String data) {
        Util.validate(data);

    }

    @BeforeEach
    public void setUp() {

    }
}