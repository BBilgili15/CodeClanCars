package Components;

public abstract class PowerSource {
    private int capacity;
    private int horsepower;

    public PowerSource(int capacity, int horsepower) {
        this.capacity = capacity;
        this.horsepower = horsepower;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
