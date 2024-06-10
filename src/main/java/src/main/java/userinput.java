package src.main.java;

import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from users");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        
        System.out.println("Enter another number:");
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.println("The sum is: " + sum);
        
        sc.close(); // Closing the scanner to prevent resource leaks
    }
}
