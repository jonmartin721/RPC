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
        System.out.println("User: " + userChoice);
        System.out.println("Computer: " + computerChoice);
        String answer = result(userChoice, computerChoice);
        System.out.println(answer);

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

    private static String result(String userChoice, String computerChoice){

        String response = null;

        if(userChoice == computerChoice){
            response = "it is a draw";
        } else if ((userChoice == "rock") && (computerChoice != "rock")){
            response = "user wins";
        } else if ((computerChoice == "rock") && (userChoice != "rock")){
            response = "computer wins";
        } else if ((userChoice == "scissors") && (computerChoice == "paper")){
            response = "user wins";
        } else if ((userChoice == "paper") && (computerChoice == "scissors")){
            response = "computer wins";
        }

        return response;
    }















}


