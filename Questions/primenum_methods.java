package Questions;


// the above code is to find the prime numbers from 2 to n where n is the number entered by the user 
public class primenum_methods {
    public static boolean primenum(int ne){
        if (ne<=1) {
            return false;   
        }
        for(int i = 2; i <=Math.sqrt(i); i++) {
            if (ne % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        int n = 10;
        for (int i = 2; i <=n; i++) {
            if (primenum(i)) {
                System.out.println(i);
            }
        }
        // if we dont want to use for loop we can use while loop like ; 
    }
}

// the above code is to find the prime numbers from 2 to n where n is the number entered by the user 