abstract class pen {
    abstract void writ();
    abstract void refill ();

}
class fountainpen extends pen{
    void writ(){
        System.out.println("writing");
    }
    void refill(){
        System.out.println("refilling");
    }
    void changeNib(){
        System.out.println("changing nib");
    }



}
 

interface basicanimal{
    void eat();
    void sleep();
}

class monkey {
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
class huuman extends monkey implements basicanimal{
    void speak(){
        System.out.println("speaking");
    }
    @Override
    void eat(){
        System.out.println("eating");
    }
    @Override
    void sleep(){
        System.out.println("sleeping");
    }
}
interface tvremo{
    void changechannel();
    void poweroff();
    default void prere(){
        System.out.println("random text ");
    }
}
interface smeart extends tvremo{
    void connectinternet();
    

}   
class tv implements tvremo{
    public void changechannel(){
        System.out.println("changing channel");
    }
    public void poweroff(){
        System.out.println("power off");
    }

}


public class ques56 {

    public static void main(String[] args) {
        fountainpen fp = new fountainpen();
        fp.writ();
        fp.refill();
        fp.changeNib();
        // quest  2
        
        huuman h = new huuman();
        h.bite();
        h.sleep();
        h.eat();
        // quest 5 
        monkey m = new huuman();
        m.jump();
        m.bite();


    }
}
