package Project2;
/*
Course: Java Programming
Assignment: Programming Assignment 2
Due date: 05/05/2023
File: VirtualMath.java
Purpose: Java application that Virtual Math Tutor
Compiler/IDE: Java SE Development Kit 8u181/IntelliJ IDEA
Operating system: MS Windows 11
Reference(s): Java 8 API - Oracle Documentation
(http://docs.oracle.com/javase/8/docs/api/);
(Include ALL additional references (Web page, etc.) here.)
*/

import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class VirtualMath extends JFrame implements ActionListener {
    // 사용할 변수들 초기화
    private JLabel problemLabel, answerLabel;
    private JPanel mainPanel, answerPanel;
    private JTextField answerField;
    private JButton newProblemButton;

    private int  operation, operand1, operand2, answer;
    private int wrongCount;

    private final String[] OPERATIONS = {"plus", " minus", "times"};

    private final Random random = new Random();

    public VirtualMath() { // 전체적인 GUI기반 레이아웃, 세부 설정
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Color BackgroundColor = new Color(135,206,235);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setContentPane(mainPanel);

        problemLabel = new JLabel();
        problemLabel.setFont(new Font("Gill Sans", Font.BOLD, 18));



        answerLabel = new JLabel("Please enter your answer ");
        answerLabel.setHorizontalAlignment(JLabel.CENTER);
        answerLabel.setFont(new Font("Gill Sans", Font.BOLD, 18));
        answerLabel.setBounds(150,0,0,0);

        answerField = new JTextField();
        answerField.setMaximumSize(new Dimension(50, 20));
        answerField.addActionListener(this);

        newProblemButton = new JButton("New Problem");
        newProblemButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        newProblemButton.setPreferredSize(new Dimension(50, 20));
        newProblemButton.addActionListener(this);

        answerPanel = new JPanel();
        answerPanel.setLayout(new BoxLayout(answerPanel, BoxLayout.X_AXIS));
        answerPanel.add(answerLabel);
        answerPanel.add(Box.createRigidArea(new Dimension(10, 0)));
        answerPanel.add(answerField);
        answerPanel.setBackground(BackgroundColor);

        mainPanel.add(problemLabel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 0)));
        mainPanel.add(answerPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        mainPanel.add(newProblemButton);


        getContentPane().setBackground(BackgroundColor);
        generateProblem();
    }

    public void generateProblem() {
        //랜덤한 난수 생성
        operation = random.nextInt(3) + 1;
        operand1 = random.nextInt(10) + 1;
        operand2 = random.nextInt(10) + 1;

        switch (operation) {
            case 1: // +
                answer = operand1 + operand2;
                problemLabel.setText("How much is " + operand1 + " plus " + operand2 + "?");
                break;
            case 2: // -
                answer = operand1 - operand2;
                problemLabel.setText("How much is " + operand1 + " minus " + operand2 + "?");
                break;
            case 3: // *
                answer = operand1 * operand2;
                problemLabel.setText("How much is " + operand1 + " times " + operand2 + "?");
                break;
        }

        answerField.setText("");
        answerLabel.setText("Please enter your answer:");
        wrongCount = 1; // 문제를 생성할 때 마다 wrongCount 변수 초기화
    }

    public void checkAnswer(int userAnswer) {

        if (userAnswer == answer) {
            answerLabel.setText("Very good! It only took you "+wrongCount+" tries.");
        } else {
            wrongCount++; // 틀린 답을 입력했을 시 wrongCount가 1씩 증가
            answerLabel.setText("I'm sorry, but no. Please try again.");

        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == answerField) {  // 사용자가 엔터를 눌렀을 때 정답 확인

            try {
                int userAnswer = Integer.parseInt(answerField.getText());
                checkAnswer(userAnswer); // 사용자가 입력한 내용을 체크하는 함수 호출
            } catch (NumberFormatException ex) { // 예외처리
                answerLabel.setText("Please enter a valid integer.");
            }
        } else if (e.getSource() == newProblemButton) {
            answerField.setText(""); // 내용을 지움
            generateProblem();// 새 문제 생성
        }
    }
    public static void main(String[] args) {
        VirtualMath go = new VirtualMath(); // 클래스 실행
        go.setVisible(true);
    }
}