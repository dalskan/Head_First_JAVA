package chapter05.rpsGame;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private Random random;
    private Scanner sc;

    public RockPaperScissors() {
        random = new Random();
        sc = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.print("가위(1), 바위(2), 보(3), 종료(0) 입력: " + System.lineSeparator());
            int userChoice = sc.nextInt();

            if (userChoice == 0) {

                System.out.println(System.lineSeparator()+"수고했습니다! ");
                break;
            }

            int computerChoice = random.nextInt(3) + 1;
            System.out.println("Computer value: " + getChoiceString(computerChoice));

            int result = getResult(userChoice, computerChoice);
            if (result == 0) {
                System.out.println("컴퓨터가 "+ getChoiceString(computerChoice)+"를 냈습니다. 당신과 비겼습니다." + System.lineSeparator());
            } else if (result == 1) {
                System.out.println("컴퓨터가 "+ getChoiceString(computerChoice)+"를 냈습니다. 당신이 이겼습니다." + System.lineSeparator());
            } else {
                System.out.println("컴퓨터가 "+ getChoiceString(computerChoice)+"를 냈습니다. 당신이 졌습니다." + System.lineSeparator());
            }
        }
    }

    private String getChoiceString(int choice) {
        if (choice == 1) {
            return "가위";
        } else if (choice == 2) {
            return "바위";
        } else {
            return "보";
        }
    }

    private int getResult(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return 0;
        } else if (userChoice == 1 && computerChoice == 3 ||
                userChoice == 2 && computerChoice == 1 ||
                userChoice == 3 && computerChoice == 2) {
            return 1;
        } else {
            return -1;
        }
    }
}
