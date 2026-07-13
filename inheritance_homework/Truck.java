package inheritance_homework;

public class Truck extends Car {
    int capacity;

    public Truck(int passengerCount, char engineType) {
        super(passengerCount, engineType);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        }
    }
}
