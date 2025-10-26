package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;
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

    @Test
    @DisplayName("무작위 값이 4이상일 경우 전진")
    void carForward() {
        Car testCar = new Car("test");
        assertRandomNumberInRangeTest(
                () -> testCar.move(),
                4
        );
        assertThat(testCar.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("무작위 값이 4 미만일 경우 멈춤")
    void carStop() {
        Car testCar = new Car("test");
        assertRandomNumberInRangeTest(
                () -> testCar.move(),
                3
        );
        assertThat(testCar.getPosition()).isEqualTo(0);
    }
}
