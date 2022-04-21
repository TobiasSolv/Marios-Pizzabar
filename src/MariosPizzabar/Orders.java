package MariosPizzabar;

import java.util.ArrayList;
import java.util.Scanner;

public class Orders {

    private boolean systemRunnig = true;
    private int customerPhoneNumber;
    private String customerName;
    private int customer;
    private Scanner in = new Scanner(System.in);


    public boolean isSystemRunnig() {
        return this.systemRunnig;
    }

    void numbOfOrder(){ //TODO kan bruges, men er ikke en prioritet. (bruges til hvis der er mere end 1 pizza)
        System.out.print("How many orders would you like to order? ");
        customer = in.nextInt();
    }

    void order(){
        System.out.println("What would you like to order? ");
        customer = in.nextInt();
    }

    void removeOrder(){
        System.out.println("What would you like to remove? ");
        customer = in.nextInt();
    }

    public int getCustomer(){
        return customer;
    }

    void customerName(){
        System.out.print("What is customer name: ");
        customerName = in.nextLine();
        customerName = customerName.toUpperCase();
    }

    void customerPhoneNumber(){
        System.out.print("What is customer phone number: ");
        customerPhoneNumber = in.nextInt();

    }


}
