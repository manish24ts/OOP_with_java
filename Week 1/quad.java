import java.lang.*;
import java.util.*;
class quad{
public static void main(String arga[])
{
int a,b,c,d;
double r1,r2;
Scanner sc = new Scanner(System.in);
System.out.println("Enter coefficients of the equation");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();

d = b*b -4*a*c;
if(d>=0)
{
  System.out.println("Roots are real");
  r1 = (-b + Math.sqrt(d))/(2*a);
  r2 = (-b - Math.sqrt(d))/(2*a);
  System.out.println("Root 1 is "+r1+" Root 2 is "+r2);
}
else
System.out.println("Roots are imaginary");
}
}