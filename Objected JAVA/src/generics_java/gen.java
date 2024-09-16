package generics_java;

import java.util.ArrayList;


// we can use any name in place of T
//  class printer <what_ever_we_want>{
// }

class printer<T>{
        T  thinngsprint;
    public printer(T thinngsprint){
        this.thinngsprint = thinngsprint;
    }
    public void print(){
        System.out.println(thinngsprint);
    }


}

public class gen {
    public static void main(String[] args) {
        printer<Integer> obj = new printer<>(5);
        obj.print(); // output: 5   
        printer<String> obj1 = new printer<>("Hello");
        obj1.print(); // output: Hello
        printer<ArrayList> obj2 = new printer<>(new ArrayList());
        obj2.print(); // output: []
    }
}
