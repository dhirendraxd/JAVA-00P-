package oop.inheritance;

class ekclass{
    int a ;
    public int geta(){
        return a ;
    }
    ekclass(int v){
        this.a = v;   // we use this when refering any  object and is used when we have same named variables , using it helps in inheritnace and reference.
    }
    public int retunrnone(){
        return 1;
    }
    class DoClass extends ekclass {
        DoClass(int v) {
            super(v); // Call the superclass (ekclass) constructor
            System.out.println("Me ek const hoon");
        }
    }
    
public class super_this {

    public static void main(String[] args) {
        ekclass ek = new ekclass(43);
        ek.geta();
        DoClass d  = new DoClass(43);
    }
}
