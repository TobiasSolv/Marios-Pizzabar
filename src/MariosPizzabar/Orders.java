package MariosPizzabar;

import java.util.Scanner;

public class Orders {

    private int customerPhoneNumber;
    private String customerName;
    private int customerNr;
    private Pizza chosenPizza;
    private double pizzaTime;

    private Scanner in = new Scanner(System.in);

    public Orders(int customerPhoneNumber, String customerName, int customerNr, Pizza chosenPizza, double pizzaTime){
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerName = customerName;
        this.customerNr = customerNr;
        this.chosenPizza = chosenPizza;
        this.pizzaTime = pizzaTime;
    }

    public int getCustomerNr(){
        return customerNr;
    }

    public String toString(){
        return "\nCustomer number: " + customerNr + "\ncustomer phone number: " + customerPhoneNumber +
                "\nCustomer name: " + customerName + "\nChosen pizza: " + chosenPizza + "\nTime for delivery: " + pizzaTime + "\n";
    }

}
