import java.util.Scanner;

public class Main { // thsi is a class 
    
    public static void main(String[] args) { // this is a function
        System.out.println("hello world");
        int num1 = 8;
        int num2 = 4;
        int num3 = 5;
        int sum = num1 + num2 +num3;
        System.out.println(sum); // println addsup an new line init and formating by itself 
        System.out.print(sum); // we can also use print but it doesnt provide a new line after it it prints in its own line 
    }

    public static void main(String[] args) {
        
        System.out.println("dhiren");
        Scanner sc = new Scanner(System.in);
        String st =  sc.next();
        System.out.println(st);
    }
}

// add two_numbers 
// AddTwoNumbers --> pascal naming convention 
// addTwoNumbers -->camel case naming convention