package chapter05.rpsGame;

public class GameStart {
    public static void main(String[] args) {
        System.out.println("<<가위 바위 보 게임>>"+System.lineSeparator());
        RockPaperScissors game = new RockPaperScissors();
        game.start();
    }
}