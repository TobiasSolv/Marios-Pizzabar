package MariosPizzabar;


import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private boolean systemRunning = true;
    private boolean running = true;

    private Scanner in = new Scanner(System.in);

    ArrayList<Orders> orders = new ArrayList<>();

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
        }
        if (!isSystemRunning()){
            ui.exit();
        } else
            ui.exit();
    }

    void mainMenu() {
        ui.getCommand();
        switch (ui.getDecision()) {
            case "exit", "e" -> {
                ui.exit();
                running = false;

            }
            case "show orders", "so" -> {
                showOrders();
                ui.printMain();
                mainMenu();

            }
            case "make order", "mo" -> {
                newOrder();
                showOrders();
                moreOrder();
                ui.printMain();
                mainMenu();

            }
            case "remove order","ro" -> {
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

    void moreOrder(){
        System.out.print("\nWould you like to order more? \n");
        String answer = in.nextLine();
        if(answer.equals("yes")){
            newOrder();
        }
    }

    void newOrder(){
        System.out.print("What is the customers name: ");
        String name = in.nextLine().toUpperCase();

        System.out.print("What is the customers nr: ");
        int nr = in.nextInt();

        System.out.print("What is the customers phone number: ");
        int phoneNumber = in.nextInt();

        System.out.print("What pizza does the customer want: ");
        int pizzaNumber = in.nextInt();

        orders.add(new Orders(phoneNumber,name,nr,mk.getmenuKort().get(pizzaNumber)));
    }

    void removeOrder(){
        System.out.print("What order would you like to remove? ");
        int nr = in.nextInt();
        orders.remove(nr);
    }
}