import java.lang.*;
import java.util.*;
class GCD
{
public static void main(String[] args)
{
 int n1,n2,i,x;
 GCD m = new GCD();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a numbers to find GCD");
 n1=sc.nextInt();
 n2=sc.nextInt();
 x=m.gcd(n1,n2);
 System.out.println("GCD of "+n1+" "+n2+" is equal to "+ x);
}
public static int gcd(int n1,int n2)
{
 if(n2==0)
return n1;
else
return gcd(n2,n1%n2);
}
} 