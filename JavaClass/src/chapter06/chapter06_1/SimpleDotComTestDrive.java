package chapter06.chapter06_1;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom theDotCom = new DotCom();
        int ramdomNum = (int) (Math.random() * 5);

        int[] locations = {ramdomNum, ramdomNum + 1, ramdomNum + 2};
        ArrayList<String> loc = new ArrayList<>();
        loc.add(Integer.toString(locations[0]));
        loc.add(Integer.toString(locations[1]));
        loc.add(Integer.toString(locations[2]));

        theDotCom.setLocationCells(loc);
        boolean isAlive = true;


        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            System.out.println(result);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }
    }
}


