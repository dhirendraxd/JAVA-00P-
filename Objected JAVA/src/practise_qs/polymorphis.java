public class polymorphis {

     

    public static void main(String[] args) {
        // polymorphism is the ability of a single method to do different things based on the object that it is acting upon or in simple words, it is the ability of a single method to do different things based on the object that it is acting upon
        

        // heres how we can demonstrate polymorphism

        // we can create a telephone object and assign it to a smartphone object
        telephone stp = new smarphone();
        // now we can call the methods of the telephone object
        stp.ring();
        stp.lift();
        stp.disconnect();
        stp.speak();

        // output: 
        // ringing
        // lifting
        // disconnecting
        // speaking

    }
}
