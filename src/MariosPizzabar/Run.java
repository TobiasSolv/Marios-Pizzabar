package MariosPizzabar;


import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    private boolean systemRunning = true;
    private boolean running = true;

    private Scanner in = new Scanner(System.in);

    ArrayList<Orders> order = new ArrayList<>();

    MenuKort mk = new MenuKort();
    UserInterface ui = new UserInterface();

    public boolean isSystemRunning() {
        return this.systemRunning;
    }

    void showOrders(){
        String printOrders = order.toString().replace("[","").replace("]","");
        //System.out.print(printOrders);

            int size = order.size();
            for(int i = 1; i < size; i++){
                int j;
                for(j = 0; j < size; j++)  {
                    if(order.get(i).getPizzaTime() < order.get(j).getPizzaTime()){
                        System.out.println(order.get(i));
                        System.out.println(order.get(j));
                    }
                    else if(order.get(j).getPizzaTime() < order.get(i).getPizzaTime()){
                        System.out.println(order.get(j));
                        System.out.println(order.get(i));
                    }
                }
            }
    }

    void run(){
        ui.start();
        ArrayList<Pizza> menuKort = mk.getMenuKort();
        ui.showMenuKort(menuKort);
        ui.printMain();
        mainMenu();

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
        String ScannerBug = in.nextLine();
        String answer = in.nextLine();
        if(answer.equals("yes")) {
            System.out.println("How many pizzas do you wanna add?");
            int numberOfPizzas = in.nextInt();
            for (int i = 0; i < numberOfPizzas; i++)
            addMorePizzas();
        }
        showOrders();
    }

    void addMorePizzas(){
        System.out.println("Which customer wants to add more pizzas?");
        int customerNr = in.nextInt();

        System.out.print("What pizza does the customer want: ");
        int pizzaChoice = in.nextInt();

        order.get(customerNr).getChosenPizza().add(mk.getMenuKort().get(pizzaChoice));

        String ScannerBug = in.nextLine();
    }

    void newOrder(){
        System.out.print("What is the customers name: ");
        String name = in.nextLine().toUpperCase();

        System.out.print("What is the customers nr: ");
        int nr = in.nextInt();

        System.out.print("What is the customers phone number: ");
        int phoneNumber = in.nextInt();

        System.out.print("When does the customer want the pizza: ");
        double pizzaTime = in.nextDouble();

        System.out.print("What pizza does the customer want: ");
        int pizzaNumber = in.nextInt();

        order.add(new Orders(phoneNumber,name,nr,pizzaTime,mk.getMenuKort().get(pizzaNumber)));
    }

    void removeOrder(){
        System.out.print("What order would you like to remove? ");
        int nr = in.nextInt();
        order.remove(nr);
    }
}