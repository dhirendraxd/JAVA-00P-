package Questions;

import java.util.Scanner;

public class NByNArrayAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array (n x n): ");
        int n = sc.nextInt();

        int[][] num = new int[n][n];
        int sum = 0;

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = sc.nextInt();
                sum += num[i][j]; // Calculate sum while inputting
            }
        }

        System.out.println("Displaying the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num[i][j] + " "); // Print row elements
            }
            System.out.println(); // Move to next row
        }

        System.out.println("The sum of the elements in the array is: " + sum);

        sc.close(); // Close Scanner
    }
}
/*
int num[][]= new int[n][n]
 * for(int i =0; i<n;i++){
 * for(int j =0; j<n; j++){
 * num[i][j]= sc.nextint();
 * }
 * while printintg the array
 * same two for loops and then
 * system.out.print(nu[i][j]+"")
 * 
 * when adding two 3d or nd array we do : 
 int x = sc.nextInt();
 int y = sc.nextInt();
 int z = sc.nextInt();

 for(int i =0; i<x; i++){
 for(int j =0; j<y; j++){
    for(int k =0; k<z; k++){
        num1[i][j][k]= sc.nextInt();
    }
    }
    }
    for(int i =0; i<x; i++){
    for(int j =0; j<y; j++){
        for(int k =0; k<z; k++){
            System.out.print(num2[i][j][k]+" ");
        }
        System.out.println();
    }
// now adding both the num1 and num2 
for(int i =0; i<x; i++){
for(int j =0; j<y; j++){
    for(int k =0; k<z; k++){
        sum[i][j][k]= num1[i][j][k]+num2[i][j][k];
    }
    }
    }
    for(int i =0; i<x; i++){
    for(int j =0; j<y; j++){
        for(int k =0; k<z; k++){
            System.out.print(sum[i][j][k]+" ");
        }
        System.out.println();
    }
    }
    // to find their product we can do :
    for(int i =0; i<x; i++){
    for(int j =0; j<y; j++){
        for(int k =0; k<z; k++){
            sum[i][j][k]= num1[i][j][k]*num2[i][j][k];
        }
        }
        }
        for(int i =0; i<x; i++){
        for(int j =0; j<y; j++){
            for(int k =0; k<z; k++){
                System.out.print(sum[i][j][k]+" ");
            }
            System.out.println();
        }
        }
 * 
 */