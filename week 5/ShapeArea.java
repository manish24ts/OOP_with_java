import java.util.*;
abstract class Shape
{
    int a,b,r;
    Scanner sc = new Scanner(System.in);
    abstract void printArea();
}
class Rectangle extends Shape
{
    void printArea()
    {
        System.out.println("Enter length and breadth");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Area = "+(a*b));
    }
}
class Circle extends Shape
{
    void printArea()
    {
        System.out.println("Enter radius");
        r = sc.nextInt();
        System.out.println("Area = "+(2*3.14*r));
    }
}
class Triangle extends Shape
{
    void printArea()
    {
        System.out.println("Enter base and height");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Area = "+(0.5*a*b));
    }
}
class ShapeArea
{
    public static void main(String args[])
    {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        Shape s3 = new Triangle();
        s1.printArea();
        s2.printArea();
        s3.printArea();;
    }
}