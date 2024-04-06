import java.util.*;
class Shape
{
    void print()
    {
        System.out.println("This is this shape");
    }
}
class Rectangle extends Shape
{
    @Override
    void print()
    {
        System.out.println("This is rectangle shape");
    }
}
class Circle extends Shape
{
    @Override
    void print()
    {
        System.out.println("This is cicle shape");
    }
}
class Square extends Rectangle
{
    @Override
    void print()
    {
        System.out.println("Sqaure is a Rectangle");
    }
}
class ShapePrint
{
    public static void main(String args[])
    {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();
        Shape s3 = new Square();
        s1.print();
        s2.print();
        s3.print();;
    }
}