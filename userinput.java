import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from users");

        Scanner input_ho_yo = new Scanner(System.in); // system.in is used to read input from keyboard  must have!!

        //we can name our Scanner object whatever you want. Once you've named it, you use that name to call the nextInt() method (or any other method provided by the Scanner class) to read input.

                  // example code :
        // Scanner input = new Scanner(System.in);
        // int b = input.nextInt();
        

        System.out.println("Enter a number:");
        // we can also add floating point instead of int but it won't be as effective as INT 
        int a = input_ho_yo.nextInt();
        
        System.out.println("Enter another number:");
        int b = input_ho_yo.nextInt();
        
        int sum = a + b;
        System.out.println("The sum is: " + sum);

        System.out.println("Enter a string without spaces:");
        String str = input_ho_yo.next(); // we use .next when we want to take input in a single word without spaces. Any spaces after won't count or be stored in that variable

        System.out.println(str);


        // Consume the newline left-over 
        input_ho_yo.nextLine();// not specifically needed but good for decoration


        System.out.println("Enter a string with spaces:");
        String str2 = input_ho_yo.nextLine(); // this is used when we want to take input with spaces as a whole; it will store whatever it gets in input  until we hit ENTER_KEY
        System.out.println(str2);



        input_ho_yo.close(); // Closing the scanner to prevent resource leaks
    }
    
    // String str2 = sc.nextLine(); # the string defines the data type as int char and float and the str2 is the name it can be anything written by user   
}
