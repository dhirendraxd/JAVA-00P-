package Questions;

import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= 10; i++) {
            if (i %2 !=0) {
                System.out.println(i);
                // ouptut: 1, 3, 5, 7, 9
            }// this will print all the odd numbers from 1 to 10
        }

        for (int i = 0; i <n; i++) {
            if (i %2 !=0) {
                System.out.println(i);
                // ouptput will be all odd numbers from 0 to n
                
            }
            else if (i %2 ==0) {
                System.out.println(i);
                // ouptput will be all even numbers from 0 to n
            }
            
        }
        for(int i = 1; i <=n; i ++)
        {
            if (i %2 == 0) {
                System.out.println("now the even numbers are "+i);
            }
            else if(i % 2!= 0 ){
                System.out.println(i+"is the odd numebrs ");
            }
        }
    }
}