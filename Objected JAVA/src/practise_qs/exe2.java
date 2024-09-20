package practise_qs;
class Cylinderr{
    private int radius;
    private int height;

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int r) {
        radius = r;
    }
    // hi 

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int h) {
        height = h;
    }
    // 

    public double surfacearea(){
        return 2* 3.14* radius*radius +2*3.14*radius*height;
    }
    // Method to calculate volume
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class exe2 {
public static void main(String[] args) {
    Cylinderr newc = new Cylinderr();
    System.out.println(".................");
    newc.setHeight(43);
    newc.setRadius(43);

    System.out.println();
    double surfarea =newc.surfacearea();
    System.out.println("rsult "+surfarea);
    System.out.println("volume "+newc.volumne());

}
}
