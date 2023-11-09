import java.util.Scanner;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws InterruptedException {
        int playerX = 0;
        int playerY = 0;
        String[] yesList = {"yes", "yea", "yup", "ye", "yas", "yuh"};
        String[] noList = {"no", "nope", "nuh-uh","nah","nuhuh"};
        Scanner s = new Scanner(System.in);


        System.out.println("Oh you are awake now.");
        System.out.println("You hurt yourself pretty badly there.");
        System.out.print("What is your name? (leave empty for the default name: Sam) - ");

        String talk = s.nextLine();
        PlayerCharacter mainCharacter = new PlayerCharacter(); //    gets name and creates character
        if(talk == ""){
            mainCharacter.characterCreator("Sam");
        }else {
            mainCharacter.characterCreator(talk);
        }
        String name = mainCharacter.getName();
        System.out.println("\nNice to meet you " + name + ".");
        Thread.sleep(2000);
        System.out.println("My name is Luna");
        Thread.sleep(2000);
        System.out.println("I can't help you anymore than this.");
        Thread.sleep(2000);
        System.out.println("You should find your way to the city and try to find a shelter before night time");
        Thread.sleep(1000);
        System.out.println("Bye bye.  \n\n\n\n\n\n\n\n\n\n\n\n");
        Thread.sleep(4000);
        System.out.println("*you are now alone, all you see around you is a forest*");
        Thread.sleep(4000);
        System.out.println("*the kind person has left you some food and water*");
        Thread.sleep(4000);
        System.out.println("*objective: find shelter before nightfall.*");





        if (Arrays.asList(yesList).contains(talk.toLowerCase())) {
          //  System.out.println("Sure, let me tell you more about this world.");
            // Add your code here for what happens if the input is in the yesList
        } else {
          //  System.out.println("Alright, let's get started on your adventure!");
            // Add your code here for what happens if the input is not in the yesList
        }
    }


}
