package chapter06.chapter06_2;


import java.util.ArrayList;

public class DotCom {

    private ArrayList locationCells;
    private String name;
    // private int numOfHits = 0;

    public void setLocationCells(ArrayList locs) {
        locationCells = locs;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("You sunk " + name + "!");
            } else {
                result = "hit";
            }
        }

        return result;
    }
}