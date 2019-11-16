package racingcar;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RacingGameTest {

    @ParameterizedTest
    @ValueSource(strings = {"tom,jo,jayden,yohan,john,timothy"})
    public void racingGameStart() {
        Cars cars = new Cars();
    }
}