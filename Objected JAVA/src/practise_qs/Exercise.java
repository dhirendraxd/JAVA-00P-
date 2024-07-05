package practise_qs;

public class exercise_code_without_explainatio {
    package 

import java.util.Scanner;

class Tommy { // Class name follows Java naming conventions
    public void hit() {
        System.out.println("hitting the enemy");
    }

    public void run() {
        System.out.println("running");
    }

    public void fire() {
        System.out.println("firing");
    }

    // Private instance variable for encapsulation
    private int namebyuser;

    // Setter method to set 'namebyuser' and return it
    public int setValues(int input_name) {
        namebyuser = input_name; // Set the value of 'namebyuser'
        return namebyuser; // Return the updated value
    }

    // Getter method to retrieve 'namebyuser'
    public int getNameByUser() {
        return namebyuser; // Getter method to retrieve 'namebyuser' variable
    }
}

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tommy player1 = new Tommy(); 

        // Set initial value directly
        player1.setValues(23);
        System.out.println("Player 1 initial value: " + player1.getNameByUser());

        // Input from user
        System.out.print("Enter a number for 'namebyuser': ");
        int value = sc.nextInt(); // Read user input as an integer
        player1.setValues(value); // Set 'namebyuser' with user input
        System.out.println("The input data was: " + value);

        // Call other methods
        player1.fire();
        player1.run();
        player1.hit();

        sc.close(); // Close the Scanner object
    }
}

}
