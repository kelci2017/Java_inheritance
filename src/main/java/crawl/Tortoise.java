package crawl;

import sun.lwawt.macosx.CSystemTray;

public class Tortoise extends Turtle {

    public Tortoise(boolean vegetarian, int legs, String food, String color) {
        super(vegetarian, legs, food, color);
    }

    public void walk() {
        System.out.println("Tortoise likes walking slowly");
    }

    @Override
    public void swim() {
        System.out.println("Normally tortoise don't like swim");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getName() + " likes eat " + getFood());
    }

    @Override
    public void crawl() {
        System.out.println(getClass().getName() + " likes walking");
    }
}
