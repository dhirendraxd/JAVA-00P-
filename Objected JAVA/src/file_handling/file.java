import java.io.*;// we have to import io package to work with files , it imports all the related classes form io package
import java.util.Scanner; // we have to import scanner class to read from a file
public class file {
    public static void main(String[] args) {
        
        
        // code to create a new file 
        File myFile = new File("dhiren.txt");
        // anytime we have to make a file we use File class and then we have to use new keyword to create a new file 

        try{
            myFile.writeToFile("Hello, World!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Successfully wrote to the file.");


        // code to write to a file 
        FileWriter fileWriter = new FileWriter("dhiren.txt");
        fileWriter.write("Hello, World!");
        fileWriter.close();
        System.out.println("Successfully wrote to the file.");

        // code to read from a file
        File myFile2 = new File("dhiren.txt");
        try{

        Scanner sc = new Scanner(myFile2);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
            
        }
        sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // code to delete a file
        if (myFile2.delete()) {
            // we have to use .delete method to delete a file its a inbuilt method
            System.out.println("Deleted the file: " + myFile2.getName());
            //get.name is alos an inbuilt method to get the name of the file 
             } else {
                System.out.println("Failed to delete the file.");
            }
    }
}
