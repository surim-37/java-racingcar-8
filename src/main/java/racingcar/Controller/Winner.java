package racingcar.Controller;

import racingcar.Model.Car;

public class Winner {

    public String[] findWinners(Car[] cars) {
        int max = 0;
        int count = 0;

        // 가장 멀리간 위치 구하기
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPosition() > max) {
                max = cars[i].getPosition();
            }
        }

        // 가장 멀리간 위치와 자동차 수 구하기
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPosition() == max) {
                count++;
            }
        }

        // 우승자 배열
        String[] winners = new String[count];
        int index = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPosition() == max) {
                winners[index] = cars[i].getName();
                index++;
            }
        }

        return winners;
    }
}

//우승자 판별