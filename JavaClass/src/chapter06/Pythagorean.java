package chapter06;

public class Pythagorean {
    public static void main(String[] args) {
        int cnt = 0; // 피타고라스의 정리를 만족하는 삼각형의 개수를 저장할 변수
        for (int a = 1; a < 100; a++) { // a는 1부터 99까지
            for (int b = 1; b < 100; b++) { // b는 a부터 99까지
                for (int c = 1; c < 100; c++) { // c는 b부터 99까지
                    if (a*a + b*b == c*c)
                    {
                        System.out.println("a=" +a+" b=" +b+" c=" +c);
                        cnt++;
                    }
                }
            }
        }
        System.out.println("cnt= " + cnt);
        System.out.println("2019250031 유승종");
    }
}

