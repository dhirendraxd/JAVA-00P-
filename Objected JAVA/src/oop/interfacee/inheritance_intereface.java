package oop.interfacee;
interface sample{
    void meth1();
    void meth2();

}
interface childsampleInterface extends sample{ // in class we cnat inherit a interface class so using class isnt available 
    void meth3();
    default  void meth4(){ // whiel predefined methods should be written as default
        System.out.println("meth4");
    }
    void meth5();
}
// we can extends or inherit one interface class to another interface class

class parentclass implements childsampleInterface{
    @Override
    public void meth1(){
        System.out.println("meth1");
    }
    @Override
    public void meth2(){
        System.out.println("meth2");
    }
    @Override
    public void meth3(){
        System.out.println("meth3");
    }
    @Override
    public void meth5(){
        System.out.println("meth5");
    }
    // while in an class we have to override all the methods of the interface class
}
public class inheritance_intereface {
    public static void main(String[] args) {
    
    }
}
