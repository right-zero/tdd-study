package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Winners {
    private List<Car> winners;
    private int WINNER_COUNT = -1;

    public Winners() {
        winners = new ArrayList<>();;
    }

    private Cars setTopCount(Cars cars) {
        for (Car car : cars.getCars()) {
            WINNER_COUNT = car.checkWinnerCount(WINNER_COUNT);
        }
        return cars;
    }

    public List<Car> getWinners(Cars cars) {
        for (Car car : setTopCount(cars).getCars()) {
            if (car.isWinner(WINNER_COUNT)) {
                winners.add(car);
            }
        }
        return winners;
    }
}
