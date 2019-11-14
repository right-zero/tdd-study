package racingcar;

public class RacingGame {
    private RacingCars racingCars;

    public void ready() {
        String data = "tom,jo,timothy,yohan";
        String[] drivers = data.split(",");
        int carCount = drivers.length;

        racingCars = new RacingCars();

        for (int i = 0; i < carCount; i++) {
            racingCars.addCar(new Car(drivers[i]));
        }

        System.out.println("============= 준비 =============");

        System.out.println(racingCars.getResult());

        int count = 5;

        for (int i = 0; i < count; i++) {
            racingCars.moveAllCars();
        }

        System.out.println("============= 경주 =============");

        System.out.println(racingCars.getResult());

        System.out.println("============= 정렬 =============");

        System.out.println(racingCars.sort());

        System.out.println("============= 우승자 정하기 =============");

    }
}
