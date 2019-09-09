package pet;

import base.Animal;
import base.IPet;

public class Kitty extends Animal implements IPet {

    public Kitty(boolean vegetarian, int legs, String food, String color) {
        super(vegetarian, legs, food, color);
    }

    public void play(String toy) {
        System.out.println("Kitty is playing " + toy);
    }

    @Override
    public void eat() {
        System.out.println("Kitty likes eating " + getFood());
    }

    public void climb()
    {
        System.out.println("Kitty like climbing trees");
    }
}
