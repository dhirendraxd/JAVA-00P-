package generics_java;

import java.util.ArrayList;


public class gen {
    public static void main(String[] args) {
        ArrayList <Integer> arlst = new ArrayList();
        // arlst.add("hello");
        arlst.add(1);
        arlst.add(2.3);
        // arlst.add('a');
        int a = arlst.get(56); // this will give an error because the index is out of bound
        System.out.println(a); // output : 1

    }
}
