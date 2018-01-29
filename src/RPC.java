import java.util.Scanner;
import java.util.Random;

public class RPC {

    public static void main(String[] args) {

        //create a scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Rock Paper Scissors");
        System.out.println("\nType rock, paper, or scissors: ");

        //output initially to the user so they can choose an option
        System.out.println("\nChoose an option by typing the word:\nrock\npaper\nscissors\n");
        String userChoice = keyboard.next(); //takes user choice

        //tests the user's input and displays an invalid message if it doesn't pass, until they enter something valid
        while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors"))
        {
            System.out.println("Invalid option:");
            System.out.println("\nChoose an option by typing the word:\nrock\npaper\nscissors\n");
            userChoice = keyboard.next(); //takes user choice
        }

        String computerChoice = aiChoice(); //sets ai choice

        System.out.println(userChoice);
        System.out.println(computerChoice);

    }

    //method that chooses a choice for the AI
    private static String aiChoice(){

        String choice;
        Random rand = new Random();

        //chose a random number
        int value = rand.nextInt(3);

        //assign a value to
        if (value == 0) {
            choice = "scissors";
        } else if (value == 1) {
            choice = "rock";
        } else {
            choice = "paper";
        }

        return choice;
    }
















}


