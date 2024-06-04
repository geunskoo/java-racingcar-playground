import java.util.List;
import java.util.stream.Collectors;

public class RacingReport {

    private Circuit cars;

    public RacingReport(Circuit cars) {
        this.cars = cars;
    }

    public List<Car> getFastestCars() {
        Integer maxPosition = cars.getCars().stream().map(Car::getPosition).max(Integer::compareTo).get();
        return cars.getCars().stream().filter(car -> car.getPosition() == maxPosition)
                .collect(Collectors.toList());
    }

}
