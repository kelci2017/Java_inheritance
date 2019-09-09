package crawl;

import base.Animal;
import base.ICrawl;

public class Turtle extends Animal implements ICrawl {

    public Turtle(boolean vegetarian, int legs, String food, String color) {
        super(vegetarian, legs, food, color);
    }

    public void crawl() {
        System.out.println("Turtle is crawling slowly.");
    }

    public void swim()
    {
        System.out.println("Turtle can swim");
    }

    public void eat() {
        System.out.println("Turtle eats "+ getFood());
    }
}
