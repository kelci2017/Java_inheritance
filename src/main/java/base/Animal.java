package base;

public class Animal {

    private boolean vegetarian;
    private int legs;
    private String food;
    private String color;

    public Animal(boolean vegetarian, int legs, String food, String color) {
        this.vegetarian = vegetarian;
        this.legs = legs;
        this.food = food;
        this.color = color;
        System.out.println(getClass().getName() + " vegetarian is " + vegetarian + " with color " + color + " and has " + legs + " legs and likes eating " + food);
    }

    public void sleep() {
        System.out.println(getClass().getName() + " is sleeping");
    }

    /*public final void sleep() {
        System.out.println("Animal is sleeping");
    }*/

    public void eat() {
        System.out.println(getClass().getName() + " is eating " + food + " (called from Animal class)");
    }

    private void confidential() {
        System.out.println("This is a confidential method can only be used inside this class");
    }

    public void makePublic() {
        confidential();
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
