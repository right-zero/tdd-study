package racingcar;

import java.util.Random;

public class Car {
    private static final int MOVE_BOUND = 10;
    private static final int MOVE_CONDITION = 4;

    private String carName;
    private int moveCount;
    private Random random = new Random();

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCount() {
        return moveCount;
    }

    private boolean validateMoveOrNot() {
        int randomCount = random.nextInt(MOVE_BOUND);
        if (randomCount >= MOVE_CONDITION) {
            return true;
        }
        return false;
    }

    public Car move() {
        if (validateMoveOrNot()) {
            moveCount++;
        }
        return this;
    }

    public int checkWinnerCount(int data) {
        return Math.max(data, moveCount);
    }

    public boolean isWinner(int winnerCount) {
        if (winnerCount > moveCount) {
            return false;
        }
        return true;
    }

}
