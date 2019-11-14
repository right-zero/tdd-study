package racingcar;

import java.util.Random;

public class Car implements Comparable<Integer>{
    private static final int MOVE_BOUND = 10;
    private static final int MOVE_CONDITION = 4;

    // TODO 기본 스트링 말고 튜플등 다른 데이터 구조로 수정
    private String driver;
    private int moveCount;
    private Random random = new Random();

    public Car(String driver) {
        this.driver = driver;
    }

    public String getCarInfo() {
        return "{\"driver\": " + driver + ", \"moveCount:\" " + moveCount + "}";
    }

    private boolean validateMoveOrNot() {
        int randomCount = random.nextInt(MOVE_BOUND);
        if (randomCount >= 4) {
            return true;
        }
        return false;
    }

    // TODO 리턴값 변경해야함.
    public Car move() {
        if (validateMoveOrNot()) {
            moveCount++;
        }
        return this;
    }

    public int getMoveCount() {
        return moveCount;
    }

    @Override
    public int compareTo(Integer o) {
        return o.intValue();
    }

}
