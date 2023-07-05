package chapter10;

public class TestBox {

    Integer i;
    int j=1;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go();
    }

    public void go(){
        j=i;
        System.out.println(j);
        System.out.println(i);
    }
}
