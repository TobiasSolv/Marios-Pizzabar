package MariosPizzabar;

import java.util.ArrayList;

public class MenuKort {

    private ArrayList<Pizza> menu = new ArrayList<>();

    public MenuKort(){
        menu.add(new Pizza(0,57,"Vesuvio:","tomatsauce, ost, skinke og oregano..........................................."));
        menu.add(new Pizza(1,53,"Amerikaner:","Nyhed tomatsauce, ost, oksefars og oregano................................"));
        menu.add(new Pizza(2,57,"Cacciatore:","tomatsauce, ost, pepperoni og oregano....................................."));
        menu.add(new Pizza(3,63,"Carbona:","Nyhed tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano........"));
        menu.add(new Pizza(4,65,"Dennis:","Nyhed tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano..........."));
        menu.add(new Pizza(5,57,"Bertil:","tomatsauce, ost, bacon og oregano............................................."));
        menu.add(new Pizza(6,61,"Silvia:","tomatsauce, ost pepperoni, rød peber, løg, oliven og oregano.................."));
        menu.add(new Pizza(7,61,"Victoria:","tomatsauce, ost skinke, ananas, champignon, løg og oregano.................."));
        menu.add(new Pizza(8,61,"Toronfo:","Nyhed tomatsauce, ost,skinke, bacon, kebab, chili og oregano................."));
        menu.add(new Pizza(9,61,"Capricciosa:","tomatsauce, ost, skinke, champignon og oregano..........................."));
        menu.add(new Pizza(10,61,"Hawai:","tomatsauce, ost,skinke, ananas, oregano......................................."));
        menu.add(new Pizza(11,61,"Le Blissola:","tomatsauce, ost,skinke, rejer og oregano................................"));
        menu.add(new Pizza(12,61,"Venezia:","tomatsauce, ost skinke, bacon og oregano...................................."));
        menu.add(new Pizza(13,61,"Mafia:","Nyhed tomatsauce, ost,pepperoni, bacon, løg og oregano........................"));

    }

    ArrayList<Pizza> getMenuKort(){
        return menu;
    }

}
