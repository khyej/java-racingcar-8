package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarTest {
    @Test
    @DisplayName("CarTest : 자동차 객체 생성")
    void createCarTest() {
        String carName = "test";
        Car testCar = new Car(carName);

        assertEquals(carName, testCar.getName());
    }
}
