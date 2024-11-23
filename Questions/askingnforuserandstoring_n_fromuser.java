package Questions;

import java.util.Scanner;
// create an integer array that store n numbers in tht array by asking n from the user and sdispaly the entered data 
public class askingnforuserandstoring_n_fromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in the array: ");
        int n = sc.nextInt();

        int []arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i <n; i ++){
            System.out.println("The entered data is: ");
            System.out.println(arr[i]);
        }
        
        sc.close();

    }

}