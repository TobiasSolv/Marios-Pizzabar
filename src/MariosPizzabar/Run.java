package MariosPizzabar;


import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private boolean systemRunning = true;
    private Scanner in = new Scanner(System.in);
    ArrayList<Orders> orders = new ArrayList<>();
    private boolean running = true;
    MenuKort mk = new MenuKort();
    UserInterface ui = new UserInterface();
    public boolean isSystemRunning() {
        return this.systemRunning;
    }
    void showOrders(){
        System.out.println(orders);
    }
    void run(){
        ui.start();
        ArrayList<Pizza> menuKort = mk.getmenuKort();
        ui.showMenuKort(menuKort);
        ui.printMain();
        mainMenu();

        while (running){
            // customerDecisionSwitch();
        }
        if (!isSystemRunning()){
            ui.exit();
        } else if (running){
            ui.exit();
        }else
            ui.exit();
    }

    void mainMenu() {
        ui.getCommand();
        switch (ui.getDecision()) {
            case "exit", "e" -> {
                ui.exit();
                running = false;

            }
            case "show orders", "o" -> {
                showOrders();
                ui.printMain();
                mainMenu();

            }
            case "make order" -> {
                newOrder();
                showOrders();
                System.out.println("Would you like to order more?");
                String answer = in.nextLine();
                if(answer.equals("yes")){
                    newOrder();
                }
                ui.printMain();
                mainMenu();

            }
            case "remove order" -> {
                removeOrder();
                showOrders();
                ui.printMain();
                mainMenu();

            }
            default -> {
                ui.invalidAnswer();
                System.out.println("");
                ui.printMain();
                mainMenu();
            }
        }
    }

    /*void customerDecisionSwitch(){
        switch (orders.getCustomerNr()){
            case 1 -> System.out.println("test"); //TODO skal kunne vælge hvad for nogle pizzaer, der bliver ordre.
            case 0 ->{ // TODO skal muligvis stå et andet sted.
                ui.exit();
                running = false;
            }
            default -> ui.invalidAnswer();
        }
    }*/

    void newOrder(){
        System.out.print("What is the customers name: ");
        String name = in.nextLine();

        System.out.println("What is the customers nr?");
        int nr = in.nextInt();

        System.out.print("What is the customers phone number: ");
        int phoneNumber = in.nextInt();

        System.out.println("What pizza does the customer want?");
        int pizzaNumber = in.nextInt();

        orders.add(new Orders(phoneNumber,name,nr,mk.getmenuKort().get(pizzaNumber)));
    }

    void removeOrder(){
        System.out.println("What order would you like to remove?");
        int nr = in.nextInt();
        orders.remove(nr);
    }
}