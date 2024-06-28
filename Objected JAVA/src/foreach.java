public class foreach {
    public static void main(String[] args) {
        int [] marks = {753, 534, 53, 523, 5242, 232};
        System.out.println(marks.length);
        //output : 6 // total numbers inside the array of marks 
        for(int element: marks){
            System.out.println(element);
        }
        //the element written is an variables that stores the values of the elements extracted from the marks  and print and same for next one till the end 
        // same goes for strings and  float we just change the int to string or float in each of them ..


        String [] studnets = {"dhiren", "clashe"};
        for (int i = 0; i < studnets.length; i++) {
            System.out.println(studnets[i]);
        }
        //reversing an array 
        for (int i = studnets.length - 1; i >=0; i--) {
            System.out.println(studnets[i]);
        }
    }
}
