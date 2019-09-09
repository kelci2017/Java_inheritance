package bird;

import base.Animal;
import base.IBird;
import com.sun.javafx.binding.StringFormatter;

public class Goose extends Animal implements IBird {

    public Goose(boolean vegitarian, int legs, String food, String color) {
        super(vegitarian, legs, food, color);
    }

    public void fly() {
        System.out.println("Goose can fly");
    }

    public void walk()
    {
        System.out.println("Goose like waling around the Wascana lake");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Goose eat " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("Goose is sleeping on the grass");
    }
}
