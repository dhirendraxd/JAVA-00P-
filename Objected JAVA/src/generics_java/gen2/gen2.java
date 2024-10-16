package generics_java.gen2;
import java.util.ArrayList;

public class gen2 {
    public static void main(String[] args) {

        // before 
        // ArrayList arlst = new ArrayList();
        // arlst.add(arlst);
        // Adding an ArrayList to itself will cause a stack overflow error because it will keep adding itself to the list infinitely

        // after
        // this arraylist is specifically for integers only so it will only accept integers
        ArrayList<Integer> arlst = new ArrayList<>();

        // Adding elements to the Integer list
        arlst.add(1);
        arlst.add(2);
        arlst.add(3);
        arlst.add(4);
        int a = (int) arlst.get(4);  
        System.out.println("List: " + arlst); // Output: [1, 2, 3, 4]

        // ----- two exception examples -----
        int a = arlst.get(0); // This will throw a ClassCastException
        System.out.println(a); // This line won't be reached

        int a = (int) arlst.get(0); // This will throw a ClassCastException
        System.out.println(a); // This line won't be reached
        // to fix this, we can use generics to specify the type of the list elements like this: ArrayList<Integer> arlst = new ArrayList<>();
        // now it will work fine and won't throw any exceptions
        int a = arlst.get(0); // This will work fine now as output will be 1
        System.out.println(a); // Output: 1


    }
}
