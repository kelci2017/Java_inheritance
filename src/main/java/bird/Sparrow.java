package bird;

import base.Animal;
import base.IBird;

public class Sparrow extends Animal implements IBird {

    public Sparrow(boolean vegitarian, int legs, String food, String color) {
        super(vegitarian, legs, food, color);
    }

    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats " + getFood());
    }

    public void Sing(String song)
    {
        System.out.println("Sparrow is singing" + song);
    }
}
