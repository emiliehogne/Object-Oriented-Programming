package oving7;

public class CargoCar extends TrainCar {

    CargoCar(int weight, int cargo) {
        super(weight);
        this.cargo = cargo;

    }

    public int getCargoWeight() {
        return this.cargo;
    }

    public void setCargoWeight(int cargo) {
        this.cargo = cargo;
    }
}
