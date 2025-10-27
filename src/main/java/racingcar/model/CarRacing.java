package racingcar.model;

import java.util.List;
import java.util.stream.Collectors;

public class CarRacing {
    private final List<Car> cars;

    public CarRacing(List<String> carNames) {
        this.cars = carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void play() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
