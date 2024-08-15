package oop.interfacee;

/**
 * Inner default_Methods
 */
interface camera {
    void takesnap();

    default void record4kvideo() {
        System.out.println("Recording in 4k");
    }
}

interface wifi {
    String[] getnetwork();
    void connecttonetwork(String network);
}

// Now `mycell` implements the `camera` interface
class mycell implements camera {
    public void takesnap() {
        System.out.println("Taking snap");
    }

    void callnumber(int phonenumber) {
        System.out.println("Calling " + phonenumber);
    }

    void pickcall() {
        System.out.println("Connecting");
    }

    // Since `mycell` implements `camera`, it inherits the `record4kvideo()` method
}

class phone extends mycell implements wifi {
    public void takesnap() { 
        System.out.println("Taking snap from phone");
    }

    public String[] getnetwork() {
        System.out.println("Getting list of networks");
        String[] networklist = { "harry", "rohan", "shubham" };
        return networklist;
    }

    public void connecttonetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class default_Methods {
    public static void main(String[] args) {
    
        // the below are two variable instance of the class mycell and phone , where take4kvide is also implemented into the cell class and then caaleed the main method


        mycell m = new mycell();
        m.takesnap();         // Output: Taking snap
        m.callnumber(32);     // Output: Calling 32
        m.pickcall();         // Output: Connecting
        m.record4kvideo();    // Output: Recording in 4k

        phone p = new phone();
        p.takesnap();         // Output: Taking snap from phone
        p.record4kvideo();    // Output: Recording in 4k
    }
}
