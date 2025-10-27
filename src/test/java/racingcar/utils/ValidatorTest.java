package racingcar.utils;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {" ","test1,test1","test2,,test3"})
    void validateCarNames(String carName){
        assertThatThrownBy(()-> Validator.validateCarName(carName))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
