package MariosPizzabar;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private String decision;
    private Scanner in = new Scanner(System.in);

    String getDecision() {
        return decision;
    }

    String getCommand() {
        decision = in.nextLine();
        decision = decision.toLowerCase();

        return decision;
    }

    void start(){
        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tWELCOME TO: ");
        System.out.println("""
                  __  __      _      ____    ___    ___    ____      ____    ___   _____  _____     _      ____       _      ____ \s
                 |  \\/  |    / \\    |  _ \\  |_ _|  / _ \\  / ___|    |  _ \\  |_ _| |__  / |__  /    / \\    | __ )     / \\    |  _ \\\s
                 | |\\/| |   / _ \\   | |_) |  | |  | | | | \\___ \\    | |_) |  | |    / /    / /    / _ \\   |  _ \\    / _ \\   | |_) |
                 | |  | |  / ___ \\  |  _ <   | |  | |_| |  ___) |   |  __/   | |   / /_   / /_   / ___ \\  | |_) |  / ___ \\  |  _ <\s
                 |_|  |_| /_/   \\_\\ |_| \\_\\ |___|  \\___/  |____/    |_|     |___| /____| /____| /_/   \\_\\ |____/  /_/   \\_\\ |_| \\_\\         
                """);

        //showMenuKort();

    }

    void showMenuKort(){ // TODO bruges ikke, men er rart at have stående. Bliver fjenet på et eller andet tidspunkt.
        System.out.println("""
                1.  Vesuvio: tomatsauce, ost, skinke og oregano ...........................................57,-
                2.  Amerikaner: Nyhed tomatsauce, ost, oksefars og oregano ................................53,-
                3.  Cacciatore: tomatsauce, ost, pepperoni og oregano .....................................57,-
                4.  Carbona: Nyhed tomatsauce, ost, kødsauce, spaghetti, cocktailpølser og oregano ........63,-
                5.  Dennis: Nyhed tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano............65,-
                6.  Bertil: tomatsauce, ost, bacon og oregano..............................................57,-
                7.  Silvia: tomatsauce, ost pepperoni, rød peber, løg, oliven og oregano...................61,-
                8.  Victoria: tomatsauce, ost skinke, ananas, champignon, løg og oregano...................61,-
                9.  Toronfo Nyhed tomatsauce, ost,skinke, bacon, kebab, chili og oregano...................61,-
                10. Capricciosa: tomatsauce, ost, skinke, champignon og oregano............................61,-
                11. Hawai: tomatsauce, ost,skinke, ananas, oregano.........................................61,-
                12. Le Blissola: tomatsauce, ost,skinke, rejer og oregano..................................61,-
                13. Venezia: tomatsauce, ost skinke, bacon og oregano......................................61,-
                14. Mafia: Nyhed tomatsauce, ost,pepperoni, bacon, løg og oregano..........................61,-
                """);
    }

    void showMenuKort(ArrayList<Pizza> pizzas){
        for (int i = 0; i < pizzas.size(); i++){
            System.out.println(pizzas.get(i).toString());
        }
    }

    void exit (){
        System.out.println("""
                                                        Thank you for using: 
                   __  __      _      ____    ___    ___    ____      ____    ___   _____  _____     _      ____       _      ____ \s
                 |  \\/  |    / \\    |  _ \\  |_ _|  / _ \\  / ___|    |  _ \\  |_ _| |__  / |__  /    / \\    | __ )     / \\    |  _ \\\s
                 | |\\/| |   / _ \\   | |_) |  | |  | | | | \\___ \\    | |_) |  | |    / /    / /    / _ \\   |  _ \\    / _ \\   | |_) |
                 | |  | |  / ___ \\  |  _ <   | |  | |_| |  ___) |   |  __/   | |   / /_   / /_   / ___ \\  | |_) |  / ___ \\  |  _ <\s
                 |_|  |_| /_/   \\_\\ |_| \\_\\ |___|  \\___/  |____/    |_|     |___| /____| /____| /_/   \\_\\ |____/  /_/   \\_\\ |_| \\_\\  
                """);
        System.exit(0);
    }

    void invalidAnswer(){
        System.out.println("\nYOU ENTERED AN INVALID ANSWER!! TRY AGAIN\n");
    }

    void printMain() {
        System.out.print("""
        
        Main menu:
        order [order]
        remove order [remove order]
        Exit [exit]
        """);

        System.out.print("\nEnter decision: ");
    }

    void mario(){ // TODO billed af Mario. bruges nok ikke.
        System.out.println("""
                KKKKKKKKKKKKKKKKKKKKKKKXXXXXXKK000OKNWNXXKKKKKKKK00XXXKKKKK0000OOOOO00KKXXNNWWWMMMMMWWNXKOkxxkkxkxxxxxxxxxxxxxxxxxxx
                KKKKKKKKKKKKKKKKKKKKKKXXXXXXXXXKKKXNNNXXKKKKK000000KXXKKKK00000OOOOO00KKKXXNNWWWMMMMMMMMWNX0kkkkxkkxxxxxxxxxxxxxxxxx
                KKKKKKKKKKKKKKKKKKKKKXXXXXXXXXXXXNNNNXXXKKK000OOOO0KXXXXKKK000OOOOOOO00KKKXNNWWWWMMMMWWWWMMWKOkkkkkkxxxxxxxxxxxxxxxx
                KKKKKKKKKKKKKKKXXXXXXXXXXXXXXXXNWWWNNXXXKK000OOkkO0KXXXXXKKK000OOOOOO00KKKXXNNWWWWMMMWWWWWMMWNKOkkkkkkkxxxxxxxxxxxxx
                KKKKKKKKKKXXXXXXXXXXXXXXXXXXXXXNNNNNNNXXKK00OOOkkkOKXXXXXXKKK0OOOOOOO00KKKXXNNWWWWMMWWNNNNWWMMWXOkkkkkkkkkkxxkkxkkxx
                KKKKKKKKXXXXXXXXXXXXXXXXXXXXXXNNNNWNNNNXXK00OOOkkkO0KXXXXXKK000OOOOOOO00KKXXNNNWWWWWWNXXXNWWWMMWXOkkkkkkkkkxkkkkkkkk
                KKKKKKXXXXXXXXXXXXXXXXXXXXXXXNNNNNNNNNNXXKK00OOOOOO00KXXKKKKK0000OOOO0000KKXNNNWWWWWNXKKXXNWWMMMXOkkkkkkkkkkkkkkkkkk
                KKKKKXXXXXXXXXXXXXXXXXXXXXXXXNNNNNNNNNNNXKK00OOOOOOOO0KKK00KKKK0000000000KKXXNNNNNNNXKKKXXNWWMMMXOkkkkkkkkkkkkkkkkkk
                KKKKKXXXXXXXXXXXXXXXXXXXXXXXXNNNNNNNNNNXXKK00OOOOOOOOOOOOOOOOOO0000000000KKXXXNNNNNXXK0KKXNNWWMWKOkkkkkkkkkkkkkkkkkk
                KKKKKXXXXXXXXXXXXXXXXXXXXXXXXNNNNNNXNNXXXKKKK000000000OOOOkkkkkkOO0000KKKKKXXXXXXNXXK00KKXNNWWMN0OOkkkkkkkkkkkkkkkkk
                KKKKKXXXXXXXXXXXXXXXXXXXXXXXXXNNNNXXXXXNXXXXKKKKKK00000OOOOOOOOOO00KKXXXXNNNNNNNNXXK000KKXNNWWNKOOOOkkkkkkkkkkkkkkkk
                KKKKKKKKXXXXXXXXXXXXXXXXXXXXXXXNNNNXXXNNNNNXXXXKKKKK00000OOOOOO00KKKXXNNNNWWWWWWWWNK00KKKXNNWNK000OOOOOkkkkkkkkkkkkk
                00KKKKKKKKXXXXXXXXXXXXXXXXXXXXXXNNNNXXNWWNNNXXXXKKKKK00000OOOO000KKXXNNNNWWWWMMMMMMWXKKXXXNNXK00000OOOOOOOkkkkkkkkkk
                000000KKKKKKXXXXXXXXXXXXXXXXXXXXXNNNNNWWWNNNXXXXKKKKK000000OOO000KKXXNNNNWWWWMMMMMMMWNXKKK0000000000OOOOOOOkkkkkkkkk
                OO000000KKKKKXXXXXXXXXXXXXXXXXNXXNNXNNWWWNNNXXXXKKKKK0000OOOOO000KKXXNNNWWWWWMMMMMMMMNK0000000000000OOOOOOOOOOkkkkkk
                OOOO00000KKKKKXXXXXXXXXXXXXXXXXNNNNNNNWWWNNNXXXKKKKK000OOOOOOOO00KKXXNNNNWWWWMMMMMMMWNKKK0000000000000OOOOOOOOOOOOOk
                kOOOOO0000KKKKXXXXXXXXXXXXNNNNNNNNNNNNWWNNXXXXXXKKK0000OOOOOOOOO00KKXXNNNNWWWMMMMMMMWNXXKKKK000000000000OOOOOOOOOOOO
                kkkkOOOO000KKKKXXXXXXXXXNNNNNNNNNNNNNNWWNNX0Okxk0000OOOOOOkkkOOO00KKKXXNNNWWWWMMMMMMWNNXXXKKKK0000000000000OOOOOOOOO
                kkkkkkOOO000KKKXXXXXXXXXXNNNNNNNNNNNNWWKKKo,,'..;oxxxxdddddddddlc:ccok0KKXXXNXKXWMMMWWNNNNXXXKKK0000000000000OOOOOOO
                xkkkkkkOOO000KKKXXXXXXXXXXXXNNNNNNNNNNKox0ooxxdl,,lxxxxdddddoc'....',;d00KKXXk:cdOXWWWWWWNNNNXXXKKK0000000000OOOOOOO
                xxxkkkkkkOOO00KKKXXXXXXXXXXXXXXXNNNXXNOlxK0OOO0Odclkkxxxddddc,;cldxddoxkOKKXXk:;cld0XNNWWWWWNNNXXXKKKK00000000OOOOOO
                xxxxkkkkkkOOO000KKKXXXXXXXXXXXXXXXXXXKx:dK0kOXNx;;cokkxxddddollccooloxkOO0KKXx;:cldk00KXNWNWWNNNNNXXXKKK000000OOOOOO
                kkkkkkkkkkkOOO000KKKXXXXXXXXXXXXXXXXX0l,o0Ok0WKl.',;dkkxddxoooo;.;'.:okkO0KKk:,:cokOOkxOXNNNNNNNNNNNNXXXKKK000000OOO
                kkkkkkkkkkkOOOO000KKKXXXXXXXXXXXXXXXX0l'l0Ox0WXd'  .okxdddxxk0Oc...'oxxkkO0Kd',::oOkkxdxKNWWWWWWWWWWWWNNNNNXKK000000
                kkkkkkkkkkkkOOOO000KKKXXXXXXXXXXXXXXX0c'o0OxkXWKx:;cdkxdooxkkOOkl::dkxxkkO0KOl,',lxxddx0NWWWWWWNNNWWWWWNNNNWWNXKKK00
                kkkkkkkkkkkkkOOOO000KKKKXXXXXXXXXXXXN0ccO0OkxkKNXK000000OOOOkkkO0OOOxxkkO00KXXx,,lxxod0NNXXXNWWNXXKXNWWNXK0KNWNXXKKK
                kkkkkkkkkkkkkOOOO00000KKKKXXXXXXXXXXXKOO0Okkxk0XXXKKKKXXXXXXKOxxxxxxxkOOO0KKXXXd:dOkk0NWNK0O0NWWNK0OKNWWNX0KNWWNNXXX
                kOkkkkkOOOOOOOOO00000KKKKKKXXXXXXXXXKdclxxxxk0KK00OOO00KXXXXXKkdodddxxxkxdolkKNK0KNNNWMWWXK0KNWNNNKKKNWNNNXNWWWNNNNN
                0000000000000000000KKKKKKXXXXXXXXXXXO;..',:o0K0OkkkxxxkO0KKXXXOc;::::;;;,'.':OXXXNWNWWMMWNNXNNXKKXKKXXXXXXNWWWWNNNNN
                00000000000000000KKKKKKKKKXXXXXXXXXX0l'....l0K0OOkkxxdxxkO0KXXx'...........'cOXXNNK0KXWWWXXXXXKK000000KKKXXNWWNNNNNN
                0000000000000000000000000KKKKKKKKKKKKOd:,'.:OK00OOkxxxxxkO0KK0:..........';lkKXNWNX00KNWXKKKKKK000OO000KKXNWWWNNNNNN
                OOOOOOOOOOOOOOOOOOOO000000000KKKKKKKKKK0Od:'ck00OOkkkxxxkO0Kk:......'coodxk0KKKKXNNNXXNXXKKKK000OOOOO00KXXNWNXXXNNNN
                OOOOOOOOOOOOOOOOOOOOO0000000000KKKKKKKKKKKOxolddxkOOOOOOkxdl;:ooc,,ldkkkOO0000000KNWNXK00KK00000000000KXXNNNXXXXXXXN
                OOOOOOOOOOOOOOOOOOOO000000000000KKKKKKKKKXXXK0xoldxxxkkkdl::lxkkxodkkkOOOkddkOO00KNWNXK0000KKKKKKKKKKKXNNNXKKKKXXXXX
                OOOOOOOOOOOOO0000000000000000000000KKXXNNWWWNXK0OOOOOkkkxxxxxxxxxkkkkxolc;;oOOOO0XWWNXK0KKKKKKXXXXXXNNNNNXXXXXXXXXXX
                OOOOOOOOOOOOOO0000000000000000KXXXXNWWWWNNNNNNNNKOkOOOkkkkkkkkkkkkxoc,'',:oO0000KWMMMWWNNXXXXXNNNNWWWNNXXXXXXXXXXXXX
                OOOOOOOO00000000000000000KKKXNWWNNNNXXXXXXNNNNNWNXOdoodxkkkkkOOko:,'',::lx0KKXXXNNNNWMMMWNNNNNNNNNNNNXKXXXXXXXXXKKKK
                00000KKKKKKKKKKKKXXXXXNNWWWWWNXNXKKKKK0KKKXXXXXNWWNKkl:;cxkOOkd:''',:oxkO0KXXXNNNXKKXWWWWWNNNXXXXNNXXXXXXXXXXXXKKKKK
                XXXNNNNNNNNNNNNNNNNWWWWWWWWWNXKKXX00O000000KKKKNWWNNXKkl,;ldoc,',:lxO0KK000KXNNNWNXKXNWNNXXXXKXXXXXXXXXXXXXXXKK00000
                XXXXXXXXXXXXKKKKXNWWWWWNNNNWNXK00KXKOO000KKKKKXWWNNNNK0kc,;;;,',:dOKKKXNNK0KXNNNWWWWWWWXXXXXXXXXXXXXXXXXXXXXK0000000
                KKKKK000000000KKNNNNNNXXXNNWWWNKK0KXXKXXXXXKKXNWWWNNNX0d:,,,,'',;cxKKKXXK00KXNNNWWWMMMWNXXXXXKKKKKXXXXXXK00000000000
                0KKKKKKKKKKKKKKXXKXNXKKKXXNNNWWNNXXXNWWNXKKKKXNWWWNNXkl;,',,''''',;lxkOOOO0KXXNNWWWMMMWNXXK00OOOOO00KXX0OOOOOOOOO000
                kOKKKKKKKKKKKKKXXXNX000KXXXNNNNWWWNNXXXXKXXXXNWWWWNNkc;;,,,,,,,,,,,,;coxk00KXXNWWWMMMWNXK00OOOOOOOOOOOOOOOOOOOOOOO00
                xxk0KXXXXXXXXXXXXNNX00XNNNNNWWWWWNXKK0KKKXNNWWWWWWNXx:;;;,,,;;;;,,,;;;:cd0KKXXNWWMMMMMWNNXK0OOOOOOOOOkOOOOOOOOOOOO00
                xxxk0KXXXXXXXXXXNNNXKXNWNNNXNWNXKKKKKKKKKXNWWWWWWWWNKOdooodxolccccc:;;:cdKNNNNNNNWWMMMMMMMWX0OOkOOOOOOOOOOOOOOOOOO00
                xxxxkO0KXNNNNNNNNNNNNNWWWNXXXXK00KKKKKKKXWWMMWWNNNNNNXXXXXXK00Oxdlc:::oO0KXNNXXXXNNWWMMMMMMWX0OOkkOOkkOOOOOOOOOOO000
                xxxxxxxkOKXNNNNWWWWWWWNXKKK0000KKKKKKKKNWMMWWNNNNNNNNNNXXXXK00KK00OOkOKXXXNNNXXXXXXXNWMMMMMMWXOOOOOOkkkOOOOOOOOOO000
                xxxxxkkkkkOKNWWWWWWWNX0OkkkkkkOOOOO00XWWMWNNXXXXXXNNNNNNNXXX00KKKKKKKXXXXNNNNNNXXXXKKXNWMMMMMWX0OOOOOOOOOOOOOOOOO000
                xxkxxxkkkkkk0XWWWNNXKOkkkkOOkkOkkkkk0NMWWNXKKKKKXXXNNNNNNNNXX0kkxxxxk0XXNNNNNNNNXXKKKKKXWWMMMMWNKOOOOO0000000000KKKX
                xxxxkkkkkkkkkOKXKK000OOkkkkkkkkOOkkOXWMWNXK000KKXXXNNNNNNNX0kdooooooodxkOKXNNNNNXXKKK000KXWWWMMMNXKXNNWWWWWWWWWWWWWM
                kkkkOOOOkkkkkkkOOOOOOOOOkkkkkkkOOkkKWWWNXKK0000KXXNNNNNNX0kdodddddddooddddk0XNNNNXXKK0OkxxkkOO00KXWWMMMMMMMMMMMMMMMM
                kkOOOOOOOOOkkkkkkkkOOOOOOkkkkkkkkkONWWXXKK00O0KKXNNNNNNWNNK0OOOkxkxxxxxxxxxk0NNNNNXK0xollloodkO0OOOKNWMMMMMMMMMMMMMM
                OOOOOOOOOOOOOOOkkkOOO00KKKKKKKKXXXNNNXKK00OO00KXXNNNWWWMMMMMMWWNNNNNNNXXXXNNNNNNNX0kdolllloodxO0Okkk0XWMMMMMMMMMMMMM
                OOOOO0KKKKKKXXXXXXNNNWWWMMMMMWNXK0OkkkkOO0KKXXXXNNWWWWMMMMMMMMMMMMMMMMMMMMMMWWNX0OkdollllllllloodddxxOXWMMMMMMMMMMMM
                NNNWWWWMMMMMMMMMMMMMMMMMMMWNX00Oxddxkkxxxxxkk0KXNWWWMMMMMMMMMMMMMMMMMMMMMMMMWWKOkxdolllccccccccllooddx0NMMMMMMMMMMMM
                MMMMMMMMMMMMMMMMMMMMMMMMMWKOxxkxoodkKXKOxxddddxxkOKXXNWMMMMMMMMMMMMMMMMMMMMMMWKkkdoollccc:::::cccllodxOXMMMMMMMMMMMM
                MMMMMMMMMMMMMMMMMMMMMMMMWKkxdolllllodkkkxddddddddxxkkOKWMMMMMMMMMMMMMMMMMMMMMWKOkxoollccc:::::::ccllxkOXMMMMMMMMMMMM
                
                """);
    }

}
