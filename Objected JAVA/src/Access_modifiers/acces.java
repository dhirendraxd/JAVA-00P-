package Access_modifiers;
import dhiren.mini;
class c1{ // if we  use this class into a new package then we have to make it public so that it can be accessed from other packages.  same goes for memebers inside this class if we want to access them from other packages then we have to make them public. what is we make them private ? then they can't be accessed from other packages. what if we make them protected ? then they can be accessed from other packages but only if they are inherited from this class. what if we make them default ? then they can be accessed from other packages but only if they are inherited from this class.
    private int a = 10;
    public int b = 20;
    protected int c = 30;
    int d = 40; // default access modifier is used here.
}

class c2 extends c1{
    void show(){
        System.out.println("a = "+a); // Error because a is private 
        System.out.println("b = "+b); // b is public so it can be accessed cause it is inherited from c1 class and c2 is child class of c1 class so it can access public members of c1 class
        System.out.println("c = "+c); // c is protected so it can be accessed cause it is inherited from c1 class and c2 is child class of c1 class so it can access protected members of c1 class
        System.out.println("d = "+d); // d is default so it can be accessed cause it is inherited from c1 class and c2 is child class of c1 class so it can access default members of c1 class
    }
}
class namaya extends mini{
    void show(){
        System.out.println("a = "+a); // Error because a is private
        System.out.println("b = "+b); // b is public so it can be accessed cause it is inherited from c1 class and c2 is child class of c1 class so it can access public members of c1 class
        System.out.println("a = "+a); // Error because a is private 
        System.out.println("b = "+b); // b is public so it can be accessed cause it is inherited from c1 class and c2 is child class of c1 class so it can access public members of c1 class
        System.out.println("c = "+c); // c is protected so it can be accessed cause it is inherited from c1 class and c2 is child class of c1 class so it can access protected members of c1 class
        System.out.println("d = "+d); // d is default so it can be accessed cause it is inherited from c1 class and c2 is child class of c1 class so it can access default members of c1 class
    }

}


public class acces {
    public static void main(String[] args) {
        
        c1 obj1 = new c1();
        System.out.println("b = "+obj1.b);
        System.out.println("c = "+obj1.c);
        System.out.println("d = "+obj1.d);
        
        c2 obj2 = new c2();
        obj2.show();

        // // importing form dhire.mini
        // mini obj3 = new mini();
        // System.out.println("b = "+obj3.b);
        // System.out.println("c = "+obj3.c);
        // System.out.println("d = "+obj3.d);
        

    }
}

// in short the above code is about the access modifiers in java. there are 4 types of access modifiers in java. they are private, public, protected and default. private members can only be accessed within the class. public members can be accessed from anywhere in the program. protected members can be accessed from the same package and from the inherited class. default members can be accessed from the same package only.