package practise_qs;

 class Employee{
     int salary;
     String name;
     
     // the values inside these returns so we have to print it by them self 
    public int getsalary(){
        return salary;
    }
    // the geter is an userdefined things which is made or its main work it to retunr the value being a function returinign a  assinged var
    public String getname(){
        return name;
    }
    
    // while  taking the name form the user or alos said to be seter we take input form user and then retunr the new values  by give the new value to the variable the code was returning as follows :
    public String setname(String n){
        return name = n;
    }
    
    
}

/**
 * cellphone 
 * 
 */
class Cellphone{ // this is a class
    
    // these are called methods or fuctions returning some values, void is written if we sout anythnig  and int or string if we retunr anythign inside of them 
    public void ringing(){
        System.out.println("ringing");

    }
    public void vibrate(){
        System.out.println("vibrate");
    }
    public void callfriend(){
        System.out.println("vibrating......");

    }
}
public class exe {
    public static void main(String[] args) {
     Employee dhiren = new Employee();
     dhiren.setname("dhirensingh");
     System.out.println(dhiren.getname());
      dhiren.salary = 323;
      System.out.println(dhiren.getsalary());

    // phoen testing
    Cellphone  asus = new Cellphone();
    asus.callfriend();
    asus.ringing();
    asus.vibrate();

    } 
}