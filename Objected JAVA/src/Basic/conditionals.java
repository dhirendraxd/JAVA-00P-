public class conditionals {
 public static void main(String[] args) {
    
    int x = 10;
    int y = 5;

    // Example of if statement
    if (x > 5) {
        System.out.println("x is greater than 5");
    }

    // Example of if-else statement
    if (y > 10) {
        System.out.println("y is greater than 10");
    } else {
        System.out.println("y is not greater than 10");
    }

    // Example of if-else if-else statement
    if (x > 15) {
        System.out.println("x is greater than 15");
    } else if (x > 10) {
        System.out.println("x is greater than 10 but not greater than 15");
    } else {
        System.out.println("x is 10 or less");
    }

    // Example of nested if statement
    if (x > 5) {
        System.out.println("x is greater than 5");

        if (y > 2) {
            System.out.println("y is greater than 2");
        } else {
            System.out.println("y is less than or equal to 2");
        }
    }
 }   
}
