package chapter10;

public class Foo {
    static final int x = 12;

    public void go(){
        System.out.println(x);
    }
}

class testFoo {
    public static void main(String [] args) {
        Foo foo = new Foo();
        foo.go();
    }
}
