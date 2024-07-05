package practise_qs;

class Cylinder {
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

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(int h) {
        height = h;
    }
}

public class exrcs {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(43);
        c.setHeight(8773);

        int setHeight = c.getHeight();
        int setRadius = c.getRadius();

        System.out.println("Height is: " + setHeight + ", Radius is: " + setRadius);
    }
}
