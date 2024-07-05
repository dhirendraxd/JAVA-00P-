package practise_qs;

class Cylinderr2{
    private int height;
    private int radius;
    public  Cylinderr2(int r, int h){
        radius = r;
        height = h;
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int r) {
        radius = r;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int h) {
        height = h;
    }

    public double surfacearea(){
        return 2* 3.14* radius*radius +2*3.14*radius*height;
    }
    // Method to calculate volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class exe3 {
    public static void main(String[] args) {
        Cylinderr2 cy = new Cylinderr2(434,343);
        System.out.println("");
        // cy.getHeight();
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());

    }
}
