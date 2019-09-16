package Toy;

import base.Toy;

public class BabyCube extends Toy {

    public BabyCube(double _price, String _producer)
    {
        price = _price;
        producer = _producer;
    }

    public void SetLevel(int level) {
        System.out.println(getClass().getName() + " is for kids over " + level + " years old");
    }
}
