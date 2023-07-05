package chapter09;
import java.awt.Color;


abstract class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }
}
class Mini extends Car {
    Color color;

    public Mini() {
        this(Color.RED);
        System.out.println(color);
    }

    public Mini(Color c) {
        super("Mini");
        color = c;
    }

    public static void main(String[] args) {
        Mini mini = new Mini();
    }
}
