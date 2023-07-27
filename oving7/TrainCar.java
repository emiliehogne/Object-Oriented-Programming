package oving7;

public class TrainCar {
    protected int empty;
    protected int cargo;
    protected int passengers;

    TrainCar(int i) {
        this.empty = i;
        ;

    }

    public int getTotalWeight() {
        return empty + cargo + (passengers * 80);

    }

    public void setDeadWeight(int i) {
        empty = i;

    }

    public int getDeadWeight() {
        return empty;

    }
}
