package Exception_handling;

import java.util.Scanner;

public class nested_trycatch {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 67;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of index:");
        int a = sc.nextInt();

        try {
            System.out.println("Welcome to nested try-catch block");

            // Inner try block
            try {
                System.out.println("The value at the array index entered is: " + marks[a]);
            } 
            // Handling index out of bounds exception in the inner try block
            catch (IndexOutOfBoundsException e) {
                System.out.println("Index out of bounds error: " + e.getMessage());
                System.out.println("Exception at level 2 (inner)");
            }

        } 
        // Handling other general exceptions in the outer try block
        catch (Exception e) {
            System.out.println("Exception at level 1 (outer): " + e.getMessage());
        }

        sc.close();
        
    }
}
