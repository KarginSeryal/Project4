import javax.swing.text.Highlighter;
import java.util.Scanner;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class  Main {
    static int playerX = 0;
    static int playerY = 0;
    static boolean done = false;
   static Scanner s = new Scanner(System.in);
    static String response;
    static PlayerCharacter mainCharacter = new PlayerCharacter();


static boolean tutorial = true;
    public static void main(String[] args) throws InterruptedException {

        String[] yesList = {"yes", "yea", "yup", "ye", "yas", "yuh"};
        String[] noList = {"no", "nope", "nuh-uh","nah","nuhuh"};



        System.out.println("Oh you are awake now.");
        Thread.sleep(1000);
        System.out.println("You hurt yourself pretty badly there.");
        Thread.sleep(1000);
        System.out.print("What is your name? (leave empty for the default name: Sam) - ");
        response = s.nextLine();

         //    gets name and creates character
        if(response.isEmpty()){
            mainCharacter.characterCreator("Sam");
        }else {
            mainCharacter.characterCreator(response);
        }
        String name = mainCharacter.getName();
        Thread.sleep(1000);
        System.out.println("\nNice to meet you " + name + ".");
        Thread.sleep(2000);
        System.out.println("My name is Luna");
        Thread.sleep(2000);
        System.out.println("I can't help you anymore than this.");
        Thread.sleep(2000);
        System.out.println("You should find your way to the city and try to find a shelter before night time");
        Thread.sleep(2000);
        System.out.println("Hope we meet again. ;)");
        Thread.sleep(4000);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n*you are now alone, all you see around you is a forest*");
        Thread.sleep(4000);
        System.out.println("*the kind person has left you some food and water*");
        Thread.sleep(4000);
        System.out.println("*objective: find shelter before nightfall.*");

        PlayerActions.action();








        if (Arrays.asList(yesList).contains(response.toLowerCase())) {
          //  System.out.println("Sure, let me tell you more about this world.");
            // Add your code here for what happens if the input is in the yesList
        } else {
          //  System.out.println("Alright, let's get started on your adventure!");
            // Add your code here for what happens if the input is not in the yesList
        }
    }


}
