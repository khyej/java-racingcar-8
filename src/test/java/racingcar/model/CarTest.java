package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CarTest {
    @Test
    @DisplayName("CarTest : 자동차 객체 생성")
    void createCarTest() {
        String carName = "test";
        Car testCar = new Car(carName);

        assertEquals(carName, testCar.getName());
    }

    @Test
    @DisplayName("자동차 이름 공백일 경우 예외 발생")
    void carNameBlankException() {
        assertThatThrownBy(() -> new Car(" "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 이름 5자 초과일 경우 예외 발생")
    void carNameLengthException() {
        assertThatThrownBy(() -> new Car("testtest"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
