public class whilelloop {
    public static void main(String[] args) {
        // Initialize a variable to count from 1 to 5
        int count = 1;

        // Start of the while loop
        while (count <= 5) {
            // This block will execute as long as count is less than or equal to 5
            System.out.println("Count is: " + count); // Print the current value of count

            // Increment count by 1 for the next iteration
            count++;
        }
        // End of the while loop when count > 5

        // Print a message after the while loop finishes
        System.out.println("While loop has finished");

// output: 
//Count is: 1
// Count is: 2
// Count is: 3
// Count is: 4
// Count is: 5
// While loop has finished
    }
}
