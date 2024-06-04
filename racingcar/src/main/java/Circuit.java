import java.util.List;

public class Circuit {

    private List<Car> cars;

    public Circuit(List<Car> cars) {
        this.cars = cars;
    }

    public RacingReport race() {

        return new RacingReport(this);
    }

    public List<Car> getCars(){
        return cars;
    }
}
