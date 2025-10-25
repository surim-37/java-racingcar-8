package racingcar.Controller;

import racingcar.Model.Car;
import racingcar.Model.CarMovement;
import racingcar.View.Input;
import racingcar.View.Output;

public class Game {

    private Input input = new Input();
    private Output output = new Output();
    private CarMovement movement = new CarMovement();
    private Winner winner = new Winner();

    public void start() {
        String[] carNames = input.getCarNames();
        int count = input.getRoundCount();

        // 자동차 배열 생성
        Car[] cars = new Car[carNames.length];
        for (int i = 0; i < carNames.length; i++) {
            cars[i] = new Car(carNames[i]);
        }

        output.printStart();

        // 라운드 반복
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < cars.length; j++) {
                movement.move(cars[j]);
            }
            output.printRoundResult(cars);
        }

        output.printWinners(winner.findWinners(cars));
    }
}

//게임진행