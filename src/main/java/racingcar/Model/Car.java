package racingcar.Model;

public class Car {
    private String name;
    private Position position;

    public Car(String name) {
        if (name == null || name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.position = new Position();
    }

    public void move() {
        position.increase();
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position.getValue();
    }
}

//자동차 설정