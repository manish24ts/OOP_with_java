import java.lang.*;
import java.util.*;
class PrimeNumber
{
public static void main(String[] args)
{
 int n,i;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 n=sc.nextInt();
 for(i=2;i<=n;i++)
 {
   primenumber(i);
 }
}
public static void primenumber(int x)
{
 int i,c=0;
 for(i=2;i<x;i++)
 {
   if(x%i==0)
   {
     c=1;
     break;
   }
 }
 if(c==0)
 System.out.println(x);
}
}