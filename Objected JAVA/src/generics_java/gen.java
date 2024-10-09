package generics_java;

import java.util.ArrayList;

class mygenerics{
    int val ;
    private  t1 t1;

}
public void setT1ANDVAL(t1 t1 , int val){
    this.t1 = t1;
    this.val= val;


}
public int getval(){
    return val;
}
public t1 gett1(){
    return t1;
}


public class gen {
    public static void main(String[] args) {
        ArrayList <Integer> arlst = new ArrayList();
        mygenerics <String> ma = mygenerics(32, "hello");
        ma.gett1();// ouput : hello
        // arlst.add("hello");
        arlst.add(1);
        arlst.add(2.3);
        // arlst.add('a');
        int a = arlst.get(56); // this will give an error because the index is out of bound
        System.out.println(a); // output : 1

    }
}
