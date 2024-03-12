import java.lang.*;
import java.util.*;
class Triangle
{
 public static void main(String[] args)
 {
    int a, b,c;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter three sides of a traingle");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a==b && a==c)
      System.out.println("EQUILATERAL TRIANGLE");
    else if(a==b || a==c || b==c)
      System.out.println("ISOSCELES TRIANGLE");
    else 
      System.out.println("SCALENE TRIANGLE");
  }
}