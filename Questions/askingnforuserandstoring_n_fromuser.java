package Questions;

import java.util.Scanner;
// create an integer array that store n numbers in tht array by asking n from the user and sdispaly the entered data 
public class askingnforuserandstoring_n_fromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr=new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0; i <n; i ++){
            System.out.println(arr[i]);
        }
    }
}
