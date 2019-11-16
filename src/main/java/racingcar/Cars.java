package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars implements Cloneable {

    private List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void moveAllCars() {
        for (Car car : cars) {
            car.move();
        }
        ResultView.print(cars);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }

}
