package chapter01_ch01;

public class PoolPuzzleOne {
    public static void main(String[] args) {

        int x = 0;
        while (x < 4) {
            System.out.print("a"); // a와 n은 while을 돌 동안 한 번씩 즉 3번 앞에 나옴
            if (x < 1) { // x=0
                System.out.print(" ");// 띄어쓰기로 a n
            }
            System.out.print("n");

            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2; // while 끝
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) { //x=0
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1; // 하나씩 +
        }
    }
}
