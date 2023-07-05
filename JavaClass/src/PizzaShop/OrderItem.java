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

// 한 주문에 대한 정보를 저장하기 위한 클래스
public class OrderItem {

    // 배열에 넣어 초기화를 하기 위한 final 변수
    final double[] size_price;
    final String[] size_name;
    final String[] menu;

    double totalPrice; // 총 가격
    int type; //피자 메뉴 번호 (종류)
    int quantity; // 피자 개수
    int size; // 피자 사이즈


    Order order = new Order();

    OrderItem() {  // 기본 생성자
        size_price = new double[]{0, 10.0, 14.5, 19.0, 23.5};
        size_name = new String[]{" ", "Personal", "Medium", "Large", "Extra Large"};
        menu = new String[]{" ", "Meat Lovers", "Vegetarian", "Hawaiian", "Philly Steak", "BBQ Chicken", "메뉴 나가기"};
    }

    //4개의 인스턴스 변수 각각에 대한 set/get 메소드
    public String getPizzaChoice() {
        return menu[type];
    } // 배열로 값을 찾는 부분

    public void setPizzaChoice() {
        type = order.displayPizzaMenu();
    } // 번호를 입력받아 get 메소드로


    public String getPizzaSize() {
        return size_name[size];
    }

    public void setPizzaSize() {
        size = order.pizzaSize();
    }

    public int getPizzaCount() { //피자 개수 반환
        return quantity;
    }

    public void setPizzaCount() { // 피자 개수
        this.quantity = order.pizzaCount();
    }

    public double getTotalPrice() {  //총 가격 반환
        return totalPrice;
    }

    public void setTotalPrice() { // 사이즈와 개수에 대한 가격 계산
        this.totalPrice = (size_price[size] * quantity);
    }

    public String toString(){  //멋진 형식의 출력을 생성하는 toString 메소드
        return (this.getPizzaChoice()+"\t"+this.getPizzaSize()+"\t"+this.getPizzaCount()+"\t$  "+this.totalPrice*this.getPizzaCount());
    }
}

