package racingcar.Model;

import java.util.Random;

public class CarMovement {
    private Random random = new Random();

    public void move(Car car) {
        int num = random.nextInt(10); // 0~9 중 랜덤
        if (num >= 4) {
            car.move();
        }
    }
}
//자동차 전진 설정