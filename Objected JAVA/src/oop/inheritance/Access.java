package oop.inheritance;

class MYemployee {

    private int id;
    private String name;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String nameValue) {
        name = nameValue;
    }

    // getter for id
    public int getId() {
        return id;
    }

    // setter for id
    public void setId(int idValue) {
        id = idValue;
    }
}

public class Access {
    public static void main(String[] args) {
        MYemployee employee1 = new MYemployee();
        employee1.setName("dhiren");
        employee1.setId(1);
        System.out.println("Employee Name: " + employee1.getName());
        
        System.out.println("Employee ID: " + employee1.getId());
    }
}
