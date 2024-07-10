package practise_qs;

import java.util.Random;
import java.util.Scanner;

class Game {
    private int num; // The number to guess
    private int numGuess; // The number of guesses taken

    // Constructor to initialize the number to guess
    public Game() {
        Random rand = new Random();
        this.num = rand.nextInt(3242) + 1; // Generates a random number between 1 and 3242
    }

    // Setter for numGuess
    public void setNumGuess(int numGuess) {
        this.numGuess = numGuess;
    }

    // Getter for numGuess
    public int getNumGuess() {
        return numGuess;
    }

    // Method to take user input
    public void takeUserInput() {
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        setNumGuess(inputNum);
    }

    // Method to check if the user's guess is correct
    public boolean isCorrectNum() {
        if (num == numGuess) {
            return true;
        } else if (num < numGuess) {
            System.out.println("Too high");
            return false;
        } else {
            System.out.println("Too low");
            return false;
        }
    }
}

public class GameApp {
    public static void main(String[] args) {
        Game game = new Game();
        boolean hasWon = false;

        while (!hasWon) {
            game.takeUserInput();
            hasWon = game.isCorrectNum();
            if (hasWon) {
                System.out.println("Congratulations! You guessed the correct number.");
            }
        }
    }
}
