package racingcar.view;

import java.util.List;
import racingcar.model.Car;

public class OutputView {
    public void displayPlayResultHeader() {
        System.out.println();
        System.out.println("실행 결과");
    }

    public void displayPlayResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + formatPlay(car.getPosition()));
        }
        System.out.println();
    }

    public String formatPlay(int position) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        return sb.toString();
    }

    public void displayWinner(List<String> winner) {
        String winnerName = String.join(", ", winner);
        System.out.println("최종 우승자 : " + winnerName);
    }

}
