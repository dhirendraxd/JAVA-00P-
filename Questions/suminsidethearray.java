package Questions;

import java.util.*;

public class suminsidethearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter the elements of the array: ");
        // Correcting the loop to iterate within valid indices
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Correcting the loop to calculate sum for valid indices
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum of the elements of the array is: " + sum);
        sc.close();
    }
}
