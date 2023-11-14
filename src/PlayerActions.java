public class PlayerActions {
    public static void action(){
        Main.done = false;
        if(Main.tutorial){
            System.out.println("*you can type help to open the help menu with all the commands*");
            System.out.println("*if you want to walk you can type: walk_(up, down, left, right)*");
            Main.tutorial = false;
        }
        System.out.println("*what should I do: ");
        Main.response = Main.s.nextLine();
        switch (Main.response){
            case "walk_up": Main.playerY++;
            case "walk_down": Main.playerY--;
            case "walk_left": Main.playerX--;
            case "walk_right": Main.playerX++;
        }
        Main.done = true;
    }
}
