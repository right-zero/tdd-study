package racingcar;

import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);
    private String participatedCars;
    private int trialCount;

    public InputView() {
        System.out.println("자동차 이름을 입력하세요. 구분자[' '또는 ',']");
        participatedCars = scanner.nextLine();
        System.out.println("시행 횟수를 입력하세요.");
        trialCount = validate(scanner.nextLine());
    }

    private int validate(String count) {
        try {
            return Integer.parseInt(count);
        } catch (Exception e) {
            throw new IllegalArgumentException("정수만 입력하세요.");
        }
    }

    public String getParticipatedCars() {
        return participatedCars;
    }

    public int getTrialCount() {
        return trialCount;
    }

}
