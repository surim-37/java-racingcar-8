package racingcar.View;

import racingcar.Model.Car;

public class Output {

    public void printStart() {
        System.out.println("실행 결과");
    }

    public void printRoundResult(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i].getName() + " : ");
            for (int j = 0; j < cars[i].getPosition(); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printWinners(String[] winners) {
        System.out.print("최종 우승자 : ");
        for (int i = 0; i < winners.length; i++) {
            System.out.print(winners[i]);
            if (i < winners.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

//출력- 각 라운드 후 자동차의 위치, 게임 끝난 후 우승자