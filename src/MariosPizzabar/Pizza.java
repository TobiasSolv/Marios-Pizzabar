package MariosPizzabar;

public class Pizza {

    private int pizzaNumber;
    private int price;
    private String name;
    private String description;

    public Pizza(int pizzaNumber, int price, String name, String description){
        this.pizzaNumber = pizzaNumber;
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {

        return pizzaNumber + ". " + name + " " + description + "" + price +",-" + "\n"
                ;
    }


}
