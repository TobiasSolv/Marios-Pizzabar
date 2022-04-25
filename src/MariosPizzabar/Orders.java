package MariosPizzabar;

import java.util.ArrayList;

public class Orders {

    private int customerPhoneNumber;
    private String customerName;
    private int customerNr;
    private ArrayList<Pizza> chosenPizza;
    private double pizzaTime;


    public Orders(int customerPhoneNumber, String customerName, int customerNr,  double pizzaTime, Pizza pizza){
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerName = customerName;
        this.customerNr = customerNr;
        this.pizzaTime = pizzaTime;
        this.chosenPizza = new ArrayList<Pizza>();
        chosenPizza.add(pizza);
    }

    public ArrayList<Pizza> getChosenPizza() {
        return chosenPizza;
    }

    public String toString(){
        return "\nCustomer number: " + customerNr + "\ncustomer phone number: " + customerPhoneNumber +
                "\nCustomer name: " + customerName + "\nTime for delivery: " + pizzaTime + "\nChosen pizza: " + chosenPizza;
    }

}
