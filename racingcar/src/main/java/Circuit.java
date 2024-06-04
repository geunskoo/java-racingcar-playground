import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Circuit {

    private List<Car> cars;

    public Circuit(List<Car> cars) {
        this.cars = cars;
    }

    public Circuit(String carNames) {
        this.cars = mapCars(carNames);
    }

    private static List<Car> mapCars(String carNames) {
        return Arrays.stream(carNames.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public RacingReport race() {
        Random random = new Random();
        cars.forEach(car -> car.move(new Fuel(random.nextInt(9))));
        return new RacingReport(this);
    }

    public List<Car> getCars(){
        return cars;
    }
}
