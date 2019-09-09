package pet;

import base.Animal;
import base.IPet;

public class Puppy extends Animal implements IPet {

    public Puppy(boolean vegetarian, int legs, String food, String color) {
        super(vegetarian, legs, food, color);
    }

    public void play(String toy) {
        System.out.println("Putty likes playing "+ toy);
    }

    public void bark()
    {
        System.out.println("Putty will bark once met strangers");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Puppy likes eating " + getFood());
    }
}
