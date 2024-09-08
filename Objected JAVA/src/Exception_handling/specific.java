import java.util.Scanner;
// import java.util.Eception;
public class specific {
    public static void main(String[] args) {
    int marks[] = new int[3];
    marks[0] = 7;
    marks[1] = 56;
    marks[2] = 67;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter an value of index");
    int val = sc.nextInt();

    System.out.println("Enter the value you wanna divide with ");
    int  num = sc.nextInt();
    try{
        System.out.println("the values at array index enterred is :"+marks[val]);
        System.out.println("the value of array-value/number is :"+marks[val]/num);
    }
    
    catch(ArithmeticException e){
        System.out.println("Arithmetic exception error");
        System.out.println("Error: "+e.getMessage());
}
catch(IndexOutOfBoundsException e){
    System.out.println("indexout of bound error");
    System.out.println("Error: "+e.getMessage());

}
catch(Exception e){
    System.out.println("Some error occured");
    System.out.println("Error: "+e.getMessage());
}




    }
}

