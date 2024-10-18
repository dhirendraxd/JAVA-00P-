package string_buffer;

public class buffe {
    public static void main(String[] args) {
        // StringBuffer is a mutable sequence of characters. It is a thread-safe version of StringBuilder and is used in a multithreaded environment.
         
        // in simple string buffer is used when we want to perform multiple operations on a string like insert, delete, append, replace, etc. and we use builder when we want to perform a single operation on a string.

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        // char at index 1
        System.out.println(sb.charAt(1));

        //clear at index 2
        sb.deleteCharAt(2);
    }
}
