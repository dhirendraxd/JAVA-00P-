package oop.inheritance;

class A {
    public int a;

    public int dhiren() {
        return 4;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    @Override 
    public void meth2() { // having same name and parameter will force us to use override annotation
        System.out.println("I am method 2 of class B");
    }

    public void meth2(int a) { // this wont override cause its taking an paramter init and parent class isn't
        System.out.println("I am method 2 of class B with parameter");
    }

    public void meth3() {
        System.out.println("I am inside extended method of class B");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A ae = new A();
        ae.meth2(); // Calls A's meth2

        B bb = new B();
        bb.meth2(); // Calls B's overridden meth2
    }
}
