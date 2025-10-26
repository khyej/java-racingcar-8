package racingcar.model;

public class Car {
    private static final int MOVE_CAR_THRESHOLD = 4;
    private static final int MAX_CAR_NAME = 5;

    private final String name;
    private int position;

    public Car(String name){
        this.name = name.trim();
        this.position = 0;
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }
}
