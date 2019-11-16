package racingcar;

public class Util {
    public static int validate(String count) {
        try {
            return Integer.parseInt(count);
        } catch (Exception e) {
            throw new IllegalArgumentException("정수만 입력하세요.");
        }
    }
}
