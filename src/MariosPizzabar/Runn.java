package MariosPizzabar;

public class Runn {

    MenuKort mk = new MenuKort();
    Orders orders = new Orders();



    void run(){
        mk.start();
        mk.menuKort();
    }

    void customerDecisionSwitch(){
        orders.order();
        switch (orders.getCustomer()){
            //case 1 ->
        }
    }
}
