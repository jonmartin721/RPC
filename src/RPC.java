import java.util.Scanner;
import java.util.Random;

public class RPC {

    public static void main(String[] args) {

        //create a scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Rock Paper Scissors");
        System.out.println("\nType rock, paper, or scissors: ");

        String userChoice;
        userChoice = keyboard.next();
        String computerChoice = aiChoice();

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


