package generics_java;
import java.util.ArrayList;
class mynum <T>{
    private  T i;
    public mynum(T i){
        this.i = i;
    }
    public <T> returnmynum(){
        return i;
    }

    public void show(){
        System.out.println(i);
    }
}


public class gen2 {
    public static void main(String[] args) {
        // this array list will accept anything      like integer, string, double etc but if we want to add only integer then we use gens    

        ArrayList <Integer> arlst = new ArrayList();
        arlst.add(5);
        // arlst.add("Hello"); 
        // we can add any type of data in arraylist but if we wnat to add only integer type then w use gens
        // arlst.add(5.5);
        System.out.println(arlst); // output: [5, Hello, 5.5]

        int a = (int) arlst.get(2);
        System.out.println(a); // output: 5


    }
}
