package crawl;

import base.Animal;
import base.ICrawl;

public class Crocodile extends Animal implements ICrawl {

    public Crocodile(boolean vegetarian, int legs, String food, String color) {
        super(vegetarian, legs, food, color);
    }

    public void crawl() {
        System.out.println("Crocodile is crawling on the beach");
    }

    @Override
    public void eat()
    {
        System.out.println("Crocodile eats " + getFood());
        super.eat();
    }
}
