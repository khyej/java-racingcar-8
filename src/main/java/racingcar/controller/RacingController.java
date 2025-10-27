package racingcar.controller;

import java.util.List;
import racingcar.model.CarRacing;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {
    private final InputView inputView;
    private final OutputView outputView;
    private CarRacing carRacing;

    public RacingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        List<String> carNames = inputView.getCarNames();
        int playCount = inputView.getPlayCount();

        this.carRacing = new CarRacing(carNames);

        outputView.displayPlayResultHeader();

        for(int i = 0; i < playCount; i++){
            carRacing.play();
            outputView.displayPlayResult(carRacing.getCars());
        }

        List<String> winner = carRacing.getWinner();
        outputView.displayWinner(winner);
    }
}
