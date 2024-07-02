public class method_over {
    

    // static void change(int a){
    //     int a = 75;
    // }

    static void change2(int [] marks){
        marks[0] = 43;
    }
    static void telljoke (){
        System.out.println("this is a new joke ");
    }



 public static void main(String[] args) {
    // telljoke();
    int []marks ={23, 423, 2, 523, 52,545, 6};

    //changing the integer:
    // int x = 46;
    // change(x);
    // System.out.println(x); 
    //output :46

    //change the array:
    change2(marks);
    System.out.println(marks[0]);
    //output : 43
 }   
}


