package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    public static void print(List<Car> cars) {
        StringBuffer result = new StringBuffer("=========================\n");
        for (Car car : cars) {
            result.append("car  : " + car.getCarName() + "\n");
            result.append(makeTrack(car.getMoveCount()));
        }
        result.append("=========================");
        System.out.println(result);
    }

    private static StringBuffer makeTrack(int moveCount) {
        StringBuffer track = new StringBuffer("track: ");
        for (int i = 0; i < moveCount; i++) {
            track.append("-");
        }
        return track.append("\n");
    }

    public static void printWinner(List<Car> cars) {
        System.out.printf("우승자: %s", cars.stream().map(Car::getCarName).collect(Collectors.joining(",")));
    }
}
