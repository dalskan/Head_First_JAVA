package chapter01.ch01;

import java.util.Scanner;
import java.lang.Math;
public class SquareRoot {
    public static void main(String [] args){
        int num;
        double result;

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter number to calculate : ");
        num = sc.nextInt();
        result = Math.sqrt(num);

        System.out.println("The squre root of "+num+" is "+result);
    }
}