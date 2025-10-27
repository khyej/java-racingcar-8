package racingcar.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Validator {
    public static void validateCarName(String carNames) {
        validateInputEmpty(carNames);

        List<String> carName = Arrays.asList(carNames.split(","));

        validateListInputEmpty(carName);
        validateInputDuplicate(carName);
    }

    public static void validatePlayCount(String playCount) {
        int count = validateInputIsNum(playCount);
        validateInputIsPositive(count);
    }

    private static void validateInputEmpty(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("입력이 비어있습니다.");
        }
    }

    private static void validateListInputEmpty(List<String> inputs) {
        if (inputs.stream().anyMatch(input -> input.trim().isEmpty())) {
            throw new IllegalArgumentException("비어있는 입력이 있습니다.");
        }
    }

    private static void validateInputDuplicate(List<String> inputs) {
        Set<String> uniqueInput = new HashSet<>();
        for (String input : inputs) {
            if (!uniqueInput.add(input.trim())) {
                throw new IllegalArgumentException("중복된 입력이 있습니다.");
            }
        }
    }

    private static int validateInputIsNum(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도할 횟수는 숫자로만 입력이 가능합니다.");
        }
    }

    private static void validateInputIsPositive(int input) {
        if (input <= 0) {
            throw new IllegalArgumentException("시도 횟수는 1 이상의 숫자로 입력해주세요.");
        }
    }
}
