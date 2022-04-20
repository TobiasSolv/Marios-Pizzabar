package MariosPizzabar;

import java.util.ArrayList;

public class Pizza {

    private int pizzaNumber;
    private int price;
    private String name;
    private String decription;

    public Pizza(int pizzaNumber, int price, String name, String decription){
        this.pizzaNumber = pizzaNumber;
        this.price = price;
        this.name = name;
        this.decription = decription;
    }

    @Override
    public String toString() {
        return pizzaNumber + ". " + name + " " + decription + "" + price +",-"
                ;
    }
}
