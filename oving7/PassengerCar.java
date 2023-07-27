package oving7;

public class PassengerCar extends TrainCar {

    PassengerCar(int empty, int passengers) {
        super(empty);

        this.passengers = passengers;

    }

    public int getPassengerCount() {
        return this.passengers;
    }

    public void setPassengerCount(int i) {
        this.passengers = i;
    }

}
