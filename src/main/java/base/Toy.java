package base;

public abstract class Toy {
    protected double price;
    protected String producer;

    public void Describe()
    {
        System.out.println(getClass().getName() + "is produced by " + producer + " and price is " + price + " dollars");
    }
    public abstract void SetLevel(int level);
}
