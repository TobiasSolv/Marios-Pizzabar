package MariosPizzabar;

import java.util.Scanner;

public class Orders {

    private int customerPhoneNumber;
    private String customerName;
    private int customer;
    private Scanner in = new Scanner(System.in);

    void numbOfOrder(){
        System.out.print("How many orders would you like to order? ");
        customer = in.nextInt();
    }

    void order(){
        System.out.println("What would you like to order? ");
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
