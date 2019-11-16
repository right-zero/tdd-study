package racingcar;

public class RacingGame {
    private final static String SPLITTER = ",|\\s";
    private final static int GAME_START_COUNT = 0;

    private Cars cars;
    private Winners winners;

    public RacingGame() {
        cars = new Cars();
        winners = new Winners();
    }

    private String[] participantSplit(String data) {
        dataValidate(data);
        return data.split(SPLITTER);
    }

    private void dataValidate(String data) {
        if (data == null || "".equals(data)) {
            throw new IllegalArgumentException();
        }
    }

    public void gameStart() {
        InputView inputView = new InputView();

        for (String carName : participantSplit(inputView.getParticipatedCars())) {
            cars.addCar(new Car(carName));
        }
        for (int i = GAME_START_COUNT; i < inputView.getTrialCount(); i++) {
            cars.moveAllCars();
        }

        ResultView.printWinner(winners.getWinners(cars));
    }

}
