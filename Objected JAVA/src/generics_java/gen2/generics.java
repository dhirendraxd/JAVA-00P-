package generics_java.gen2;
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
// Importing all classes from java.util package to use ArrayList and Collections

public class generics {
    public static void main(String[] args) {
        // arraylist are dynamic arrays that can grow as needed , for eg if we have an array of size 10 and we want to add 11th element then we have to create a new array of size 11 and copy the elements of the old array to the new array and then add the 11th element to the new array and then delete the old array , this is a very time consuming process , so to avoid this we use arraylist , arraylist are dynamic arrays that can grow as needed , for eg if we have an arraylist of size 10 and we want to add 11th element then we can simply add the 11th element to the arraylist and the arraylist will automatically grow in size and accomodate the 11th element , this is a very fast process , arraylist are part of the java.util package 
        // ArrayList for Integer
        ArrayList<Integer> arlst = new ArrayList<>();

        // ArrayList for String
        ArrayList<String> arlst2 = new ArrayList<>();

        // ArrayList for Character
        ArrayList<Character> arlst3 = new ArrayList<>();
        // storing user input in the arraylist for character
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);// what is we dont use charAt(0) , then it will give an error , because the next() method will take the whole string as input and the next() method will not take the whole string as input , it will take only the first character of the string as input , so we have to use charAt(0) to get the first character of the string as input so it will store the first character of the string as input in the variable c but wont store the whole word as input in the variable c , so we have to use charAt(0) to get the first character of the string as input so it will store the first character of the string as input in the variable c but wont store the whole word as input in the variable c

        arlst3.add(c);
        // what is we want to store the while word in there , then we have to use the nextLine() method instead of the next() method , the nextLine() method will take the whole line as input and store it in the variable , so we have to use the nextLine() method instead of the next() method to store the whole line as input in the variable , so we have to use the nextLine() method instead of the next() method to store the whole line as input in the variable .. eg code : 
        String s = sc.nextLine();
        arlst2.add(s);
        // what is we want to store the while word in there , then we have to use the nextLine() method instead of the next() method , the nextLine() method will take the whole line as input and store it in the variable , so we have to use the nextLine() method instead of the next() method to store the whole line as input in the variable , so we have to use the nextLine() method instead of the next() method to store the whole line as input in the variable .. eg code :


        // ArrayList for Boolean
        ArrayList<Boolean> arlst4 = new ArrayList<>();


        // --- Integer List Operations ---
        // Adding elements to the Integer list
        arlst.add(0);
        arlst.add(1);
        arlst.add(2);
        arlst.add(3);
        System.out.println("Integer List: " + arlst); // Output: [0, 1, 2, 3]

        // Adding element at index 2
        //Output: [0, 1, 2, 3]
        arlst.add(2, 4);
        System.out.println("Integer List after adding 4 at index 2: " + arlst); // Output: [0, 1, 4, 2, 3]

        // Remove element at index 2
        arlst.remove(2);
        System.out.println("Integer List after removing element at index 2: " + arlst); // Output: [0, 1, 2, 3]

        // Set element at index 2
        arlst.set(2, 5);
        System.out.println("Integer List after setting 5 at index 2: " + arlst); // Output: [0, 1, 5, 3]

        // Clear all elements
        arlst.clear();
        System.out.println("Integer List after clear: " + arlst); // Output: []

        // --- String List Operations ---
        // Adding elements to the String list
        arlst2.add("hello");
        arlst2.add("world");
        System.out.println("String List: " + arlst2); // Output: [hello, world]

        // Sorting the String list
        Collections.sort(arlst2);
        System.out.println("Sorted String List: " + arlst2); // Output: [hello, world]

        // Reversing the String list
        Collections.reverse(arlst2);
        System.out.println("Reversed String List: " + arlst2); // Output: [world, hello]

        // --- Character List Operations ---
        // Adding elements to the Character list
        arlst3.add('A');
        arlst3.add('B');
        arlst3.add('C');
        System.out.println("Character List: " + arlst3); // Output: [A, B, C]

        // Remove element at index 1
        arlst3.remove(1);
        System.out.println("Character List after removing element at index 1: " + arlst3); // Output: [A, C]

        // Add element at index 1
        arlst3.add(1, 'D');
        System.out.println("Character List after adding 'D' at index 1: " + arlst3); // Output: [A, D, C]

        // --- Boolean List Operations ---
        // Adding elements to the Boolean list
        arlst4.add(true);
        arlst4.add(false);
        System.out.println("Boolean List: " + arlst4); // Output: [true, false]

        // Check if the list contains true
        System.out.println("Boolean List contains true: " + arlst4.contains(true)); // Output: true

        // Set element at index 1 to true
        arlst4.set(1, true);
        System.out.println("Boolean List after setting index 1 to true: " + arlst4); // Output: [true, true]

        // Clear the Boolean list
        arlst4.clear();
        System.out.println("Boolean List after clear: " + arlst4); // Output: []

        // --- Generic Class Operations ---
        Complete.sort(arlst);// Output: [0, 1, 2, 3]
        System.out.println("Sorted Integer List: " + arlst);
        complete.reverse(arlst);// Output: [3, 2, 1, 0]


    }
}
