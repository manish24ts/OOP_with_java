
import java.lang.*;
import java.util.*;
class Fibonacci
{
public static void main(String[] args)
{
 int n,i,a=0,b=1,c;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 n=sc.nextInt();
 System.out.println("Fibonacci Series");
 System.out.println(a);
 System.out.println(b);
 for(i=2;i<=n;i++)
{
  c=a+b;
  System.out.println(c);
  a=b;
  b=c;
}
}
}