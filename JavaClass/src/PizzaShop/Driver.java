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
// 메인을 포함한 실행을 위한 클래스

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        ArrayList<OrderItem> orderItems = new ArrayList<>(); // 주문들을 저장

        int orderNumber = orderItems.size(); // 주문 횟수

        double totalPrice = 0; // 총 주문 가격

        boolean orderTrue = true; // while 조건을 위한 변수


        Order order = new Order();

        order.welcome(); // 가게 소개

        while (orderTrue) {

            orderItems.add(new OrderItem()); // 새로운 주문


            orderNumber = orderItems.size() - 1; //현재의 주문 횟수


            orderItems.get(orderNumber).setPizzaChoice(); //메뉴 고르기

            if (orderItems.get(orderNumber).getPizzaChoice().equals("메뉴 나가기")) {
                orderTrue = false;  // 사용자가 6번 메뉴 나가기를 선택하면 while 조건을 false로
                orderItems.remove(orderNumber);
                continue;
            }

            orderItems.get(orderNumber).setPizzaSize(); // 피자 사이즈

            orderItems.get(orderNumber).setPizzaCount(); //피자 개수

            orderItems.get(orderNumber).setTotalPrice(); //가격 계산
            totalPrice = 0.0;
            for (int i = 0; i < orderNumber + 1; i++) {
                totalPrice += orderItems.get(i).getTotalPrice();
            }
            order.Total(totalPrice);
        }

        //주문완료 후 주문 내역서

        order.Show(); // 주문 내역서 첫줄

        for (int i = 0; i < orderNumber; i++) {
            order.showAll(orderItems.get(i));
        }

        order.lastShow(totalPrice);//주문 내역서 마지막줄

        order.processCreditCardPayment(totalPrice); // 결제 파트

        order.bye(); // 감사 인사
    }
}

