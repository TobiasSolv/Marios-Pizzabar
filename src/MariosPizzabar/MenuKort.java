package MariosPizzabar;

import java.util.ArrayList;

public class MenuKort {

    private ArrayList<Pizza> pizzas = new ArrayList<>();

    public MenuKort(){
        Pizza p = new Pizza(1,57,"Vesuvio:","tomatsauce, ost, skinke og oregano...........................................");
        pizzas.add(p);
        pizzas.add(new Pizza(2,53,"Amerikaner:","Nyhed tomatsauce, ost, oksefars og oregano................................"));
        pizzas.add(new Pizza(3,57,"Cacciatore:","tomatsauce, ost, pepperoni og oregano....................................."));
        pizzas.add(new Pizza(4,63,"Carbona:","Nyhed tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano........"));
        pizzas.add(new Pizza(5,65,"Dennis:","Nyhed tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano..........."));
        pizzas.add(new Pizza(6,57,"Bertil:","tomatsauce, ost, bacon og oregano............................................."));
        pizzas.add(new Pizza(7,61,"Silvia:","tomatsauce, ost pepperoni, rød peber, løg, oliven og oregano.................."));
        pizzas.add(new Pizza(8,61,"Victoria:","tomatsauce, ost skinke, ananas, champignon, løg og oregano.................."));
        pizzas.add(new Pizza(9,61,"Toronfo:","Nyhed tomatsauce, ost,skinke, bacon, kebab, chili og oregano................."));
        pizzas.add(new Pizza(10,61,"Capricciosa:","tomatsauce, ost, skinke, champignon og oregano.........................."));
        pizzas.add(new Pizza(11,61,"Hawai:","tomatsauce, ost,skinke, ananas, oregano......................................."));
        pizzas.add(new Pizza(12,61,"Le Blissola:","tomatsauce, ost,skinke, rejer og oregano................................"));
        pizzas.add(new Pizza(13,61,"Venezia:","tomatsauce, ost skinke, bacon og oregano...................................."));
        pizzas.add(new Pizza(14,61,"Mafia:","Nyhed tomatsauce, ost,pepperoni, bacon, løg og oregano........................"));

    }

    ArrayList<Pizza> getmenuKort(){
        return pizzas;
    }

}
