abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
      
    }
}
public class DrawingShapes {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();

        Shape triangle = new Triangle();
        triangle.draw();
    }
}
