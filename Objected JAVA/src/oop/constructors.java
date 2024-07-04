package oop;
class MYmainemp{
    private int id;
    private String name;
    private int salary;



// constructors should have same name as the class with methods 
    public MYmainemp(){
        id = 43;
        name ="dhiren";
    }


//other forms of constructors
    public MYmainemp(String myname, int myid){
        id = myid;
        name =myname;
    }// this programs only runs when we pass values in new instance making  if not the above code will execute 

 //overloading in constructors
    public MYmainemp( int myid){
        id = myid;
        name ="name_for_fillups";
        
    }// also a valid code

    public MYmainemp(String myname){
        id = 2;
        name =myname;
    } // also a valid code 


// geters(retuners) and setters for id, name and salary
    public  String return_name(){
        return name;
    }
    public  void setName(String newname){
        name  = newname;  
    }

    public int return_id(){
        return id;
    }

    public void setId(int i){
        id = i;
    }

    public int return_salary(){
        return salary;
    }
    public void setsalary(int sa){
        salary = sa;
    }
}
public class constructors {
    public static void main(String[] args) {
    MYmainemp newemp1 = new MYmainemp("dhirendra",43);
    // newemp1.setId(43);
    // newemp1.setName("dhiren");

    System.out.println("new employees id print "+newemp1.return_id());
    System.out.println("name of employee 1 :"+newemp1.return_name());

    }
}
 