package MariosPizzabar;

import java.util.ArrayList;

public class Runn {

    private boolean running = true;

    MenuKort mk = new MenuKort();
    Orders orders = new Orders();
    UserInterface ui = new UserInterface();

    void run(){
        ui.start();
        ArrayList<Pizza> menuKort = mk.getmenuKort();
        ui.showMenuKort(menuKort);
        ui.printMain();
        mainMenu();

        while (running){
            customerDecisionSwitch();
        }
        if (!orders.isSystemRunnig()){
            ui.exit();
        } else if (running){
            ui.exit();
        }else
            ui.exit();
    }

    void mainMenu() {
        ui.getCommand();
        switch (ui.getDecision()) {
            case "start", "s" -> orders.order();
            case "exit", "e" -> {
                ui.exit();
                running = false;
            }
            default -> {
                ui.invalidAnswer();
                System.out.println("");
                ui.printMain();
                mainMenu();
            }
        }
    }

    void customerDecisionSwitch(){
        //orders.order();
        switch (orders.getCustomer()){
            case 1 -> System.out.println("test"); //TODO skal kunne vælge hvad for nogle pizzaer, der bliver ordre.
            case 0 ->{ // TODO skal muligvis stå et andet sted.
                ui.exit();
                running = false;
            }
            default -> ui.invalidAnswer();
        }
    }
}
