package generics_java.gen2;

import java.util.ArrayList;

// Generic class with type T
class mygenerics<T> {
    // using T means we can use any type with this class (String, Integer, etc.) later on in the code in main method or other methods in the class 
    private int val;
    private T t1; // t1 is of type T

    // Constructor to initialize t1 and val
    public mygenerics(int val, T t1) {
        this.val = val;
        this.t1 = t1;
    }

    // Getter and Setter methods
    public void setT1ANDVAL(T t1, int val) {
        this.t1 = t1;
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public T getT1() {
        return t1;
    }
}

public class gen2 {
    public static void main(String[] args) {

        // ----- ArrayList example -----
        ArrayList<Integer> arlst = new ArrayList<>();

        // Adding elements to the Integer list
        arlst.add(1);
        arlst.add(2);
        arlst.add(3);
        arlst.add(4);

        // Trying to access an element at index 4 will cause IndexOutOfBoundsException
        // Fixed: Correct index to 3 (since indices are 0-based)
        int a = arlst.get(3);  
        System.out.println("List: " + arlst); // Output: [1, 2, 3, 4]
        System.out.println("Element at index 3: " + a); // Output: 4

        // ----- Generic Class Example -----
        // Correct usage of generics with String type
        mygenerics<String> g1 = new mygenerics<>(34, "hey");

        String str = g1.getT1(); // Output: hey
        int b = g1.getVal(); // Output: 34

        System.out.println("Value of T1 (String): " + str); // Output: hey
        System.out.println("Value of Val (int): " + b); // Output: 34
    }
}
