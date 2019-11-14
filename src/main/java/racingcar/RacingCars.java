package racingcar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingCars {
    private ArrayList<Car> cars = new ArrayList<>();

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String getResult() {
        String result = "[ ";
        result += cars.stream().map(Car::getCarInfo).collect(Collectors.joining(","));
        result += " ]";
        return result;
    }

    public void moveAllCars() {
        for (Car car : cars) {
            car.move();
        }
    }

    public String sort() {
        Stream<Car> sorted = cars.stream().sorted(Comparator.comparing(x-> x.compareTo(x.getMoveCount())));
        String result = "[ ";
        result += sorted.collect(Collectors.toList()).stream().map(Car::getCarInfo).collect(Collectors.joining(","));
        result += " ]";
        return result;
    }



}
