package org.geunskoo;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
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
}
