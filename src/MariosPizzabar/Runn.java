package MariosPizzabar;

import java.util.ArrayList;

public class Runn {

    private boolean running = true;

    MenuKort mk = new MenuKort();
    Orders orders = new Orders();
    UserInterface ui = new UserInterface();
    private ArrayList<Orders> order = new ArrayList<>();

    void run(){
        ui.start();
        ArrayList<Pizza> menuKort = mk.getmenuKort();
        ui.showMenuKort(menuKort);
        ui.printMain();
        mainMenu();

        while (running){
            customerDecisionSwitchAdd();
            customerDecisionSwitchRemove();
        }
        if (!orders.isSystemRunnig()){
            ui.exit();
        } else
            ui.exit();
    }

    void mainMenu() {
        ui.getCommand();
        switch (ui.getDecision()) {
            case "order", "o" -> orders.order();
            case "remove order", "ro" -> orders.removeOrder();
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

    void customerDecisionSwitchAdd(){
        //orders.order();
        switch (orders.getCustomer()){
            case 1 -> order.add();





            case 0 ->{ // TODO skal muligvis stå et andet sted.
                ui.exit();
                running = false;
            }
            default -> ui.invalidAnswer();
        }
    }

    void customerDecisionSwitchRemove(){
        switch (orders.getCustomer()){
            case 1 -> order.remove();



            default -> ui.invalidAnswer();
        }
    }
}
