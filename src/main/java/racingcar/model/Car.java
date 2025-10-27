package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int MOVE_CAR_THRESHOLD = 4;
    private static final int MAX_CAR_NAME = 5;

    private final String name;
    private int position;

    public Car(String name) {
        validateName(name);
        this.name = name.trim();
        this.position = 0;
    }

    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("공백은 자동차 이름으로 설정할 수 없습니다.");
        }
        if (name.trim().length() > MAX_CAR_NAME) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만로만 설정 가능합니다.");
        }
    }

    public void move() {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        if (randomNum >= MOVE_CAR_THRESHOLD) {
            this.position++;
        }
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isMaxPosition(int maxPosition) {
        return this.position == maxPosition;
    }
}
