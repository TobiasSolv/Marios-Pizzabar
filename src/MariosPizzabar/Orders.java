package MariosPizzabar;

import java.util.Scanner;

public class Orders {

    private int customerPhoneNumber;
    private String customerName;
    private int customerNr;
    private Pizza chosenPizza;

    private Scanner in = new Scanner(System.in);
    MenuKort mk = new MenuKort();

    public Orders(int customerPhoneNumber,String customerName, int customerNr, Pizza chosenPizza){
        this.customerPhoneNumber=customerPhoneNumber;
        this.customerName=customerName;
        this.customerNr=customerNr;
        this.chosenPizza=chosenPizza;
    }



    void numbOfOrder(){ //TODO kan bruges, men er ikke en prioritet. (bruges til hvis der er mere end 1 pizza)
        System.out.print("How many orders would you like to order? ");
        customerNr = in.nextInt();
    }

    void order(){
        System.out.println("What would you like to order? ");
        customerNr = in.nextInt();
    }

    void removeOrder(){
        System.out.println("What would you like to remove? ");
        customerNr = in.nextInt();
    }

    public int getCustomerNr(){
        return customerNr;
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
    public String toString(){
        return customerNr + " " + customerPhoneNumber + " " + customerName + " " + chosenPizza;
    }

}
