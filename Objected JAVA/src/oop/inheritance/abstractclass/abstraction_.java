package oop.inheritance.abstractclass;

// Abstract class
abstract class Shape {
    String objectName;

    Shape(String name) {
        this.objectName = name;
    }

    public void moveTo(int x, int y) {
        System.out.println(this.objectName + " has been moved to x = " + x + " and y = " + y);
    }

    abstract public double area();
    abstract public void draw();
}

// Implementing class for Rectangle
class Rectangle extends Shape {
    private int width;
    private int height;

    Rectangle(int width, int height, String name) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with width " + width + " and height " + height);
    }
}

// Implementing class for Circle
class Circle extends Shape {
    private int radius;

    Circle(int radius, String name) {
        super(name); // super keyword is used to call the constructor of the parent class (Shape) in this case it will act as Shape(name) it works as a constructor
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}




public class abstraction_ {
    // Main class
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(2, 3, "Rectangle");
        System.out.println("Area of rectangle: " + rect.area());
        rect.moveTo(1, 2);
        rect.draw(); // Added this call to demonstrate `draw` method

        Shape circle = new Circle(2, "Circle");
        System.out.println("Area of circle: " + circle.area());
        circle.moveTo(2, 4);
        circle.draw(); // Added this call to demonstrate `draw` method
    }
}
}