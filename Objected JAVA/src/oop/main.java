package oop;

import java.util.Scanner;

class employee{
    int id;
    int salary ;
    String name;

    public void pirntdetials()
    {
        System.out.println("my name is dhiren"+name);
        System.out.println("\n id is "+id);
    }
    public int getsalary(){
        return salary;
    }
}


public class main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        employee emp1 = new employee();
        employee emp2  = new employee();

        // taking input from user for the class employee with its new shorthand em
        System.out.println("ENTER NAME ");
        emp1.name = sc.nextLine();
        emp1.salary = 323;
        // taking id input form user using em 
        System.out.println("enter id ");
        emp1.id = sc.nextInt();


        System.out.println("enter name for emp2 :");
        emp2.name = sc.nextLine();
        System.out.println("enter id for emp2");
        emp2.id = sc.nextInt();
        emp2.salary = 323423;

        //System.out.println("id "+emp2.id+"name is "+emp2.name);
        emp2.pirntdetials();

       // System.out.println("id "+emp.id+"name is "+emp1.name);
        emp1.pirntdetials();

        int salary = emp1.getsalary(); // the class named getsalary is at the top 
        System.out.println(salary);

        sc.close();
    }
}
