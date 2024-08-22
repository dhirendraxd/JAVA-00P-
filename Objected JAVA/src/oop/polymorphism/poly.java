package oop.polymorphism;
class phone{
    void ring(){
        System.out.println("ringing");
    }
    void vibrate(){
        System.out.println("vibrating");
    }
    void camera(){
        System.out.println("taking photo");
    }

}

// parent class cnat have access to the child class methods but child class can have access to the parent class methods
class smartphone extends phone{
    void music(){
        System.out.println("playing music");
    }
    @Override
    void camera(){
        System.out.println("taking photo and video");
    }
}
public class poly {
    public static void main(String[] args) {
        phone p = new smartphone();
        p.ring();
        p.music();// why not workign ? becuase the object is of phone class and phone class does not have the music method
        p.camera(); // output will be taking photo and video
        // hey this is new edit testing form intellidj

    }

}
