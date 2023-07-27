package oving7;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<TrainCar> trainCars = new ArrayList<>();;

    public void addTrainCar(TrainCar trainCar) {
        if (!contains(trainCar)) {
            trainCars.add(trainCar);
        } else
            return;

    }

    public boolean contains(TrainCar traincar) {
        if (trainCars.contains(traincar)) {
            return true;

        } else
            return false;

    }

    public int getTotalWeight() {
        return trainCars.stream().mapToInt(TrainCar::getTotalWeight).sum();
    }

    public int getPassengerCount() {
        return trainCars.stream().filter(train -> train instanceof PassengerCar)
                .mapToInt(train -> ((PassengerCar) train).getPassengerCount())
                .sum();
    }

    public int getCargoWeight() {
        return trainCars.stream().filter(train -> train instanceof CargoCar)
                .mapToInt(train -> ((CargoCar) train).getCargoWeight()).sum();
    }

}
