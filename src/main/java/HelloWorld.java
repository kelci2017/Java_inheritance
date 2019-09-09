import bird.Goose;
import bird.Sparrow;
import crawl.Crocodile;
import crawl.Tortoise;
import crawl.Turtle;
import pet.Kitty;
import pet.Puppy;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("***********************  Birds  ***************************************");
        //Birds (show difference with supper and without supper in the eat method)
        Goose goose = new Goose(true, 2, "seeds", "gray");
        goose.eat();

        System.out.println("---------------------------------");

        Sparrow sparrow = new Sparrow(false, 2, "insects", "brown");
        sparrow.eat();

        System.out.println("********************* Pets ******************************************");

        //Pets (child can have its own methods bark or climb)
        Puppy puppy = new Puppy(false, 4, "bones", "yellow");
        puppy.bark();

        System.out.println("---------------------------------");

        Kitty kitty = new Kitty(false, 4, "fish", "yellow");
        kitty.climb();

        System.out.println("********************  Crawls  *****************************************");

        //Crawls (child can use its implemented interface methods and call the parent public methods)
        Turtle turtle = new Turtle(false, 4,"insects", "brown");
        turtle.eat();
        turtle.crawl();
        //turtle.confidential();
        turtle.makePublic();

        System.out.println("---------------------------------");

        Crocodile crocodile = new Crocodile(false, 4, "fish", "gray");
        crocodile.sleep();
        crocodile.crawl();

        System.out.println("---------------------------------");

        Tortoise tortoise = new Tortoise(true, 4, "grass", "gray");
        tortoise.walk();
        tortoise.crawl();
        tortoise.sleep();
    }
}
