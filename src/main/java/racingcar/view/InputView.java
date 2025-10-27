package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.utils.Validator;

public class InputView {
    public List<String> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNameInput = Console.readLine();

        Validator.validateCarName(carNameInput);
        return Arrays.stream(carNameInput.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public int getPlayCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String playCountInput = Console.readLine();

        Validator.validatePlayCount(playCountInput);

        return Integer.parseInt(playCountInput);
    }
}
