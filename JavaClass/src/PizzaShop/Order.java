package PizzaShop;
/*
Course: Java Programing
Assignment: Programming Assignment 1
Due Date: 04/18/2023
File: SpecialtyPizzaMenu.java
Purpose: Java application that implements an online specialty pizza shop
Complier/IDE: Java SE Development Kit 8u181/Intellij IDEA
Operating system: Ms_Windows 11
Reference: Java 8 API - Oracle Documentation
 */
// 사용자의 주문을 위한 클래스

import java.util.Scanner;

public class Order {

    public int displayPizzaMenu() { // 피자 메뉴를 볼 수 있는 메소드
        System.out.println("Specialty Pizza Menu\n");
        System.out.println("1) Meat Lovers");
        System.out.println("2) Vegetarian");
        System.out.println("3) Hawaiian");
        System.out.println("4) Philly Steak");
        System.out.println("5) BBQ Chicken");
        System.out.println("6) 메뉴 나가기\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice (1-6)? ");
        int choice = scanner.nextInt();

        if (choice > 6 || choice < 1) { // 숫자 오입력시 다시 입력하도록 함
            while (true) {
                System.out.println("\nWrong numbers! Please enter 1~6.");
                System.out.println("Specialty Pizza Menu\n");
                System.out.println("1) Meat Lovers");
                System.out.println("2) Vegetarian");
                System.out.println("3) Hawaiian");
                System.out.println("4) Philly Steak");
                System.out.println("5) BBQ Chicken");
                System.out.println("6) 메뉴 나가기\n");
                System.out.print("Your choice (1-6)? ");
                choice = scanner.nextInt();
                break;
            }
        }
        System.out.println("\n**************************************************\n");
        return choice;
    }

    public int pizzaSize() { // 피자 사이즈에 대한 가격이 적혀 있는 메소드
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available Sizes and Prices\n");
        System.out.println("1) 10\" Personal           - $10.0");
        System.out.println("2) 14\" Medium             - $14.5");
        System.out.println("3) 16\" Large              - $19.0");
        System.out.println("4) 18\" Extra Large        - $23.5\n");
        System.out.print("Your choice (1-4)? ");
        int size = scanner.nextInt();

        if (size > 4 || size < 1) { // 숫자 오입력시 다시 입력하도록 함
            while (true) {
                System.out.println("\nWrong numbers! Please enter 1~4.");
                System.out.println("");
                System.out.println("Available Sizes and Prices\n");
                System.out.println("1) 10\" Personal           - $10.0");
                System.out.println("2) 14\" Medium             - $14.5");
                System.out.println("3) 16\" Large              - $19.0");
                System.out.println("4) 18\" Extra Large        - $23.5\n");
                System.out.print("Your choice (1-4)? ");
                size = scanner.nextInt();
                break;
            }
        }
        System.out.println("\n**************************************************\n");
        return size;
    }

    public int pizzaCount() { // 피자 개수를 입력받는 메소드
        System.out.print("\nHow many personal pizza? ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public void Total(double total) { // 현재까지의 총합을 알려주는 메소드
        System.out.println("");
        System.out.println("Your current order total is $ " + String.format("%.2f", total));
        System.out.println("\n**************************************************\n");
    }


    public void Show() { // 주문 내역서의 첫줄 각각 종류, 사이즈, 개수, 가격
        System.out.println(String.format("%-15s %-13s %-11s %-7s",
                "Type",
                "Size",
                "Quantity",
                "Price"));

        System.out.println("\n---------------------------------------------------\n");
    }

    public void showAll(OrderItem view) { // 첫줄에 맞게 주문한 내역을 나열함
        System.out.println(String.format("%-15s %-13s %-11s %.2f",
                view.getPizzaChoice(), view.getPizzaSize(), Integer.toString(view.getPizzaCount()), view.getTotalPrice()));
    }

    public void lastShow(double price) { // 주문 내역서의 마지막줄, 총합을 알려줌
        System.out.println("");
        System.out.println(String.format("Order Total : $ %.2f", price));
        System.out.println("\n**************************************************\n");
    }


    public void processCreditCardPayment(double price) { // 결제 파트
        Scanner scanner = new Scanner(System.in);
        System.out.println("How do you wish to pay for your order?");
        System.out.print("  (Enter 1 for cash or 2 for credit.): "); // 현금과 카드 선택
        int choice = scanner.nextInt();

        if (choice > 2 || choice < 1) { // 숫자 오입력시 다시 입력하도록 함
            while (true) {

                System.out.println("\nWrong numbers! Please enter 1 or 2.");
                System.out.println("");
                System.out.print("How do you wish to pay for your order?\n");
                System.out.print("(Enter 1 for cash or 2 for credit.): ");
                choice = scanner.nextInt();
                break;
            }
        }


        if (choice == 1) { // 현금 결제 선택시
            System.out.println("Cash payment summary: \n");
            System.out.println("Payment amount: $ " + String.format("%.2f", price));
            System.out.println("\n**************************************************\n");
        }

        else if (choice == 2) { // 카드 결제 선택시
            System.out.println("Please enter your payment information:\n");
            System.out.print("Card holder name: ");
            String name = scanner.next();
            System.out.print("Credit card type (e.g., MasterCard): ");
            String cardType = scanner.next();
            System.out.print("Credit card number (e.g., 5432625135151384): ");
            String cardNumber = scanner.next();
            System.out.print("Expiration date (e.g., 04/23): ");
            String date = scanner.next();
            System.out.println("\n**************************************************\n");
            System.out.println("Credit payment summary:\n");
            System.out.println(" Customer name:  " + name);
            System.out.println("     Card Type:   " + cardType);
            System.out.println("Payment amount:  $ " + price);
            System.out.println(String.format("%13s: ************%-4s", "Card number", cardNumber.substring(cardNumber.length() - 4)));

            System.out.println("      Exp date:  " + date);
            System.out.println("\n**************************************************\n");

        }
    }

    public void welcome() { // 가게 소개
        System.out.println("**************************************************\n");
        System.out.println("Welcome to 승종's Pizza of West Chester!\n");
        System.out.println("**************************************************\n");
    }

    public void bye() { // 감사 인사
        System.out.println("Thank you visiting 승종's pizza of West Chester! \n ");
        System.out.println("Come back soon! \n");
        System.out.println("**************************************************\n");
    }
}
