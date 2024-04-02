import java.util.Scanner;

public class Area{
    public int area(int a)
    {
        int area = a*a;
        System.out.println("Area of Square: "+area);
        return area;
    }
    public int area(int l,int b)
    {
        int area = l*b;
        System.out.println("Area of rectangle: "+area);
        return area;
    }
    public double area(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of circle: "+area);
        return area;
    }
    public static void main(String[] args) {
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        int s,l,b;
        double r;
        System.out.println("Enter side of a square: ");
        s = sc.nextInt();
        a.area(s);
        System.out.println("Enter length and breadth of a rectangel: ");
        l = sc.nextInt();
        b = sc.nextInt();
        a.area(l,b);
        System.out.println("Enter radius of a circle: ");
        r = sc.nextDouble();
        a.area(r);
    }
}