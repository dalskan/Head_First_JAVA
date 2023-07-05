package chapter03;
import java.util.Scanner;
public class PlanetWeight {

    public static void main(String [] args){


        String name;
        float weight;
        String answer;
        String equal ="y";

        Scanner sc = new Scanner(System.in);
        while(true) {

            System.out.print("please enter any planet name: ");
            name = sc.next();
            System.out.print("please enter its weight: ");
            weight = sc.nextFloat();

            System.out.println("Your weight on " + name + " is " + weight);
            System.out.print("Continue (Y/N)?: ");
            answer = sc.next();

            if(answer.equals(equal)){
                continue;
            }
            else{
                System.out.println("Thank you for working!");
                break;
            }

        }

    }
}