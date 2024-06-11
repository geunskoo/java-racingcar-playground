package org.geunskoo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public static Cars from(String carNames) {
        List<Car> cars = mapStringToCars(carNames);
        return new Cars(cars);
    }

    private static List<Car> mapStringToCars(String carNames) {
        List<Car> cars = new ArrayList<>();
        String[] names = carNames.split(",");
        for (String name : names) {
            cars.add(new Car(name, 0));
        }
        return cars;
    }

    public List<Car> findWinners() {
        Position maxPosition = getMaxPosition();
        return getWinners(maxPosition);
    }

    private List<Car> getWinners(Position maxPosition) {
        return cars.stream()
                .filter(car -> car.isSamePlaced(maxPosition))
                .collect(Collectors.toList());
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position(0);
        for (Car car : cars) {
            maxPosition = car.biggerCarPosition(maxPosition);
        }
        return maxPosition;
    }

    public Cars race(Movable movable) {
        for (Car car : cars) {
            car.move(movable);
        }
        return this;
    }

    public static String convertCommaSeparateNames(List<Car> winners) {
        return winners.stream()
                .map(Car::getStringName)
                .collect(Collectors.joining(", "));
    }
    
}
