package oop.inheritance;

class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("This is a constructor");
    }
}

class BaseSon extends Base {
    int y;

    @Override
    public int getX() {
        return y;
    }

    @Override
    public void setX(int y) {
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {

// we cant acess y form base  its the parent and parent class dont allow to acess anything its derived class has 

        BaseSon b = new BaseSon();
        b.setX(43);
        System.out.println(b.getX());

        // derived's
        Base c = new Base();
        c.setX(43);
        System.out.println(c.getX());
    }
// access modifiers defines either the code inside of the parent is accessable or not .
}
