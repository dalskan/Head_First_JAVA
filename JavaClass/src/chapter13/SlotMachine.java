package chapter13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SlotMachine extends JFrame implements ActionListener {
    private JLabel[] slotLabels;
    private JLabel scoreLabel;
    private JButton spinButton;
    private Random rand;
    private int score;

    public SlotMachine() {
        super("My game");

        // 슬롯 라벨 초기화
        slotLabels = new JLabel[3];
        for (int i = 0; i < 3; i++) {
            slotLabels[i] = new JLabel("");
            slotLabels[i].setFont(new Font("Arial", Font.BOLD, 100));
            slotLabels[i].setHorizontalAlignment(JLabel.CENTER);
        }

        // 점수 라벨 초기화
        scoreLabel = new JLabel("Score: 0");
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 20));
        scoreLabel.setHorizontalAlignment(JLabel.CENTER);

        // 버튼 초기화
        spinButton = new JButton("Spin");
        spinButton.addActionListener(this);

        // 패널 초기화
        JPanel slotPanel = new JPanel(new GridLayout(1, 3));
        for (int i = 0; i < 3; i++) {
            slotPanel.add(slotLabels[i]);
        }
        JPanel buttonPanel = new JPanel(new BorderLayout());
        buttonPanel.add(spinButton, BorderLayout.CENTER);
        buttonPanel.add(scoreLabel, BorderLayout.SOUTH);

        // 프레임 구성
        setLayout(new BorderLayout());
        add(slotPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();

        // 난수 생성기 초기화
        rand = new Random();
    }

    public void actionPerformed(ActionEvent e) {
        // 1에서 9 사이의 정수 3개를 무작위로 생성
        int num1 = rand.nextInt(9) + 1;
        int num2 = rand.nextInt(9) + 1;
        int num3 = rand.nextInt(9) + 1;

        // 슬롯 라벨 업데이트
        slotLabels[0].setText(Integer.toString(num1));
        slotLabels[1].setText(Integer.toString(num2));
        slotLabels[2].setText(Integer.toString(num3));

        // 세 개의 수가 일치하는지 확인
        if (num1 == num2 && num2 == num3) {
            score += 100;
            scoreLabel.setText("Score: " + score);
        } else {
            scoreLabel.setText("Score: " + score);
        }
    }

    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        slotMachine.setVisible(true);
    }
}
