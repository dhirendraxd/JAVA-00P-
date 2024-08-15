package oop.interfacee;

interface bicyclee {
    int a = 43;// unchangable file
    void applybrake(int dec);

    void speed(int incre);

}
interface blowkrna{
    int a = 4;// un-changable values 
    void blowhonk();
    void honkahonka();
}

// all the methods shoudl be public when making an inteerface class its mthods
// shoudl be public
class avoncyvle implements bicyclee, blowkrna {
    // we can implement multiple interfaces classes in another class and each interface class shoudl have its methdos defined below or the class wher you are implementing the interface class

    void blowhorn() {
        System.out.println("pee pooo poppo");

    }

    public void applybrake(int dec) {
        System.out.println("brakedd");

    }

    public void speed(int incre) {
        System.out.println("brakeeee");
    }
    public void blowhonk(){
        System.out.println("honka ");

    }
    public void honkahonka(){
        System.out.println("honk honka everyone ");
    }
    

}

public class interfa {
    public static void main(String[] args) {
        avoncyvle a1 = new avoncyvle();
        a1.applybrake(32);
        // a1.a= 4353; 
        // we cant change the value of the given interface values 
        a1.blowhonk();

    }
}
