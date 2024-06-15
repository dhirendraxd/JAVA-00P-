import src.out.com.compant;
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Reading an integer
        System.out.println("Enter an integer:");
        int intValue = inputScanner.nextInt();
        System.out.println("You entered an integer: " + intValue);
        //we can also only print the variable storing the values and if we have any thigns written with it then we use "+"  before it  to include it any we can use before and after inside the printLn function 



        // Reading a float
        System.out.println("Enter a float:");
        float floatValue = inputScanner.nextFloat();
        System.out.println("You entered a float: " + floatValue);


        // Reading a character
        System.out.println("Enter a character:");
        char charValue = inputScanner.next().charAt(0);
        // char dont have a methoda lke nextInt(); and nextFloat(); so we have to user next().charAt(0); where 0 indicates the values form where the string will be  executed 

        System.out.println("You entered a character: " + charValue);

        // Closing the scanner
        inputScanner.close();
    }
}
