package racingcar;

import java.util.List;

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
}
