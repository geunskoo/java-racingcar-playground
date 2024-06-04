public class Fuel {

    private static final int GOOD_FUEL_STD = 4;

    private int status;

    public Fuel(int status) {
        this.status = status;
    }

    public boolean isAbleToUse() {
        return this.status >= GOOD_FUEL_STD;
    }
}
