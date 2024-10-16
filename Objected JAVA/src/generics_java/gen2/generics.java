package generics_java.gen2;
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
// Importing all classes from java.util package to use ArrayList and Collections

public class generics {
    public static void main(String[] args) {
        // ArrayList for Integer
        ArrayList<Integer> arlst = new ArrayList<>();

        // ArrayList for String
        ArrayList<String> arlst2 = new ArrayList<>();

        // ArrayList for Character
        ArrayList<Character> arlst3 = new ArrayList<>();

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
