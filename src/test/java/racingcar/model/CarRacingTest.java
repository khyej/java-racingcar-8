package racingcar.model;


import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarRacingTest {
    @Test
    @DisplayName("CarRacingTest : 자동차 경주 객체 생성")
    void createCarRacingTest() {
        List<String> carNames = List.of("test1", "test2", "test3");

        CarRacing carRacing = new CarRacing(carNames);

        List<Car> cars = carRacing.getCars();

        assertThat(cars)
                .extracting("name", "position")
                .containsExactly(
                        tuple("test1", 0),
                        tuple("test2", 0),
                        tuple("test3", 0)
                );
    }

    @Test
    @DisplayName("단독 우승자 선정")
    void getWinnerTest() {
        CarRacing carRacing = new CarRacing(List.of("test1", "test2", "test3"));

        assertRandomNumberInRangeTest(
                () -> carRacing.play(),
                4, 1, 1
        );
        assertThat(carRacing.getWinner()).containsExactly("test1");
    }

    @Test
    @DisplayName("공동 우승자 선정")
    void getCowinnerTest() {
        CarRacing carRacing = new CarRacing(List.of("test1", "test2", "test3"));

        assertRandomNumberInRangeTest(
                () -> carRacing.play(),
                4, 4, 1
        );
        assertThat(carRacing.getWinner()).containsExactly("test1", "test2");
    }
}
