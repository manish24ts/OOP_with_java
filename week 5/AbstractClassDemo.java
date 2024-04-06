import java.util.*;
abstract class Shape
{
    int l,b,r;
    Scanner sc = new Scanner(System.in);
    abstract void printArea();
}
class Rectangle extends Shape
{
    void printArea()
    {
        System.out.println("Enter length and breadth");
        l = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Area = "+(l*b));
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
class AbstractClassDemo
{
    public static void main(String args[])
    {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        s1.printArea();
        s2.printArea();
    }
}