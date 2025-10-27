package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {
    @ParameterizedTest
    @DisplayName("공백, 중복된 자동차 이름의 경우 예외 처리")
    @ValueSource(strings = {" ", "test1,test1", "test2,,test3"})
    void validateCarNames(String carNameInput) {
        assertThatThrownBy(() -> Validator.validateCarName(carNameInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @DisplayName("1 이상의 숫자만 시도 횟수로 설정 가능")
    @ValueSource(strings = {"test", " ", "-1", "0"})
    void validatePlayCount(String playCountInput) {
        assertThatThrownBy(() -> Validator.validatePlayCount(playCountInput))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
