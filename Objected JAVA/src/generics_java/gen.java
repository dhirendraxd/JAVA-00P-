package generics_java;

import java.util.ArrayList;

public class gen {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        // list.add("hello"); // this will give an error because we have defined the type of list as Integer    

        
    }
}
