package racingcar.View;

import java.util.Scanner;

public class Input {
    private Scanner sc = new Scanner(System.in);

    public String[] getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String input = sc.nextLine();
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException();
        }
        return input.split(",");
    }

    public int getRoundCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = sc.nextLine();
        try {
            int num = Integer.parseInt(input);
            if (num <= 0) {
                throw new IllegalArgumentException();
            }
            return num;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}

//입력받기-이름,시도 횟수