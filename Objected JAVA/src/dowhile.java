public class dowhile {
    public static void main(String[] args) {
        // Initialize a variable to count from 1 to 5
        int count = 1;

        // Start of the do-while loop
        do {
            // This block will execute at least once
            System.out.println("Count is: " + count); // Print the current value of count

            // Increment count by 1 for the next iteration
            count++;
        } while (count <= 5); // End of the do-while loop condition

        // Print a message after the do-while loop finishes
        System.out.println("Do-while loop has finished");
    }
}
