import java.util.Random;
import java.util.Scanner;

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
        while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid option:");
            System.out.println("\nChoose an option by typing the word:\nrock\npaper\nscissors\n");
            userChoice = keyboard.next(); //takes user choice
        }

        String computerChoice = aiChoice(); //sets ai choice

        //prints choices and results
        System.out.println("User chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        String winner = chooseWinner(userChoice, computerChoice);
        System.out.println(winner);
    }

    //method that chooses a choice for the AI
    private static String aiChoice() {

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

    private static String chooseWinner(String userChoice, String computerChoice) {

        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You win!";
        } else if (userChoice.equals("paper") && computerChoice.equals("scissors")) {
            return "Computer wins!";
        } else if (userChoice.equals("rock") && computerChoice.equals("paper")) {
            return "Computer wins!";
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "You win!";
        } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You win!";
        } else if (userChoice.equals("scissors") && computerChoice.equals("rock")) {
            return "Computer wins!";
        }

        return "Didn't select a winner ):";
    }
}


