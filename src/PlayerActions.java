public class PlayerActions {
    static boolean combat1 = false;
    public static void action() throws InterruptedException {
        if(Main.mainCharacter.getHp() >= 1) {
            Main.done = false;
            if (Main.tutorial) {
                System.out.println("\n\n*you can type help to open the help menu with all the commands*");
                System.out.println("*if you want to walk you can type: walk_(up, down, left, right)*");
                Main.tutorial = false;
            }
            System.out.print("*what should I do: ");
            Main.response = Main.s.nextLine();
            switch (Main.response) {
                case "walk_up":
                    Main.playerY++;
                    eventChecker();
                case "walk_down":
                    Main.playerY--;
                    eventChecker();
                case "walk_left":
                    Main.playerX--;
                    eventChecker();
                case "walk_right":
                    Main.playerX++;
                    eventChecker();
                case "search": search();
                case "help": help();

            }

            Main.done = true;
            Main.response = "";
        }else{
            System.out.println("*try again or be gone. :)");
            System. exit(0);
        }
    }

    public static void search() throws InterruptedException {
        Main.done = false;
        int outcome =(int) (Math.random()*17);
        switch (outcome) {
            case 1, 2: {
                Thread.sleep(2000);
                System.out.println("\n*what amazing luck. you have found a mythic fruit.*");
                Thread.sleep(2000);
                System.out.println("*it will heal you completely and give you a strength bonus for a short amount of time when consumed*");
                action();
            }
            case 6, 7, 8, 9, 10, 11, 12, 13, 14, 15: {
                Thread.sleep(2000);
                System.out.println("\n*what horrible luck. you have found a boot*");
                Thread.sleep(2000);
                System.out.println("*it is useless. throw it away.*");
                action();
            }
            case 16: {
                Thread.sleep(2000);
                System.out.println("\n*what a tragedy. you accidentally stepped in a bear trap and bled to death.*");
                Thread.sleep(2000);
                System.out.println("*skill issue personally. should've looked where you were going*");
                Main.mainCharacter.setHp(0);
            }
            case 3,4,5: {
                Thread.sleep(2000);
                System.out.println("\n*nice luck. you found some fruits on the tree above.*");
                Thread.sleep(2000);
                System.out.println("*it can help heal you and fill your hunger.*");
                Main.mainCharacter.setFruit(Main.mainCharacter.getFruit() + 3);
                action();
            }
        }

    }



    public static void eventChecker(){
        if(Main.playerX != 0 && Main.playerY != 0 && !combat1){
            combat1 = true;
            System.out.println("*welcome to the combat tutorial*");
            Enemies.tutorialEnemy();

        }




    }
    public static void help() throws InterruptedException {
        System.out.println("\n\n\n*walk_(up, down, left, right)*");
        System.out.println("*search (explore for items around you)*");
        System.out.println("*more commands sooooooooooooooooooooooooooooooon*");
        Thread.sleep(4000);
        action();
    }




}
