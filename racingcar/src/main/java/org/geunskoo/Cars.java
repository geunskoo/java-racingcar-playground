package org.geunskoo;

import java.util.ArrayList;
import java.util.List;

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
        List<Car> winners = new ArrayList();
        for (Car car : cars) {
            if (car.isSamePlaced(maxPosition)){
                winners.add(car);
            }
        }
        return winners;
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position(0);
        for (Car car : cars) {
            maxPosition = car.biggerCarPosition(maxPosition);
        }
        return maxPosition;
    }
}
