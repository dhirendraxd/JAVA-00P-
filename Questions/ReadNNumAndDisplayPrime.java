package Questions;

import java.util.Scanner;

// Program to read n numbers and display prime numbers inside of them
public class ReadNNumAndDisplayPrime {
    public static boolean primenum(int ne) {
        if (ne <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(ne); i++) { // Fix: Use 'ne' in Math.sqrt
            if (ne % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) { // Fix: Start from 0 and loop to i < n
            arr[i] = sc.nextInt();
        }

        System.out.println("The prime numbers are: ");
        for (int i = 0; i < n; i++) { // Fix: Iterate over array elements
            if (primenum(arr[i])) { // Check if array element is prime
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
/* printing the prime numbers from the array
 * for(int i =0; i <n; i ++){
 * if(primenumarr[i]){
 * System.out.println(arr[i]);
 * }
 * }
 */
