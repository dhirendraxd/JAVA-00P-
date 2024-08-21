

abstract class telephone {
    abstract  void ring();
    abstract  void lift();
    abstract  void disconnect();
    abstract  void speak();

}

class smarphone extends telephone{
    void ring(){
        System.out.println("ringing");
    }
    void lift(){
        System.out.println("lifting");
    }
    void disconnect(){
        System.out.println("disconnecting");
    }
    void speak(){
        System.out.println("speaking");
    }

}
public class quese57 {
    public static void main(String[] args) {
        telephone stp = new smarphone();
        stp.ring();
        stp.lift();
        stp.disconnect();
        stp.speak();
        
    }
    
}
