public class Car{

    private String name;
    private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car(String name) {
        this.name = name;
        this.position = 0;
    }

    public int move(Fuel fuel) {
        if (fuel.isAbleToUse()){
            this.position += 1;
        }
        return this.position;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(position);
    }
}
