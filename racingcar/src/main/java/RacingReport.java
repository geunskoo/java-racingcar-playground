import java.util.List;
import java.util.stream.Collectors;

public class RacingReport {

    private Circuit cars;

    public RacingReport(){

    }

    public RacingReport(Circuit cars) {
        this.cars = cars;
    }

    public List<String> getFastestCarNames() {
        Integer maxPosition = cars.getCars().stream().map(Car::getPosition).max(Integer::compareTo).get();
        return cars.getCars().stream().filter(car -> car.getPosition() == maxPosition).map(Car::getName)
                .collect(Collectors.toList());
    }

    public void printCurrentCars() {
        cars.getCars().forEach(car -> System.out.println(car.toString()));
        System.out.println();
    }

    public void printFastestCarNames() {
        List<String> names = getFastestCarNames();
        String result = names.stream().collect(Collectors.joining(","));
        System.out.println(result + "가 최종 우승했습니다.");
    }
}
