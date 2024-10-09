package generics_java;

import java.util.ArrayList;

// Generic class definition
class MyGenerics<T> {
    int val;
    private T t1;

    // Constructor to initialize t1 and val
    public MyGenerics(T t1, int val) {
        this.t1 = t1;
        this.val = val;
    }

    // Setter for t1 and val
    public void setT1ANDVAL(T t1, int val) {
        this.t1 = t1;
        this.val = val;
    }

    // Getter for val
    public int getVal() {
        return val;
    }

    // Getter for t1
    public T getT1() {
        return t1;
    }
}

public class Gen {
    public static void main(String[] args) {
        // ArrayList that only allows Integers
        ArrayList<Integer> arlst = new ArrayList<>();

        // Create an instance of MyGenerics with String type
        MyGenerics<String> ma = new MyGenerics<>("hello", 32);

        // Get value from mygenerics instance
        System.out.println(ma.getT1()); // Output: hello

        // Adding integers to the list (2.3 would cause an error)
        arlst.add(1);
        // arlst.add(2.3); // Uncommenting this will cause a compilation error
        // arlst.add('a'); // Uncommenting this will also cause a compilation error

        // Correct way of adding integers
        arlst.add(2); // Adding an integer value

        // Trying to access an index out of bounds will throw an exception
        try {
            int a = arlst.get(56); // This will throw IndexOutOfBoundsException
            System.out.println(a);  // This line won't be reached
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }
    }
}
