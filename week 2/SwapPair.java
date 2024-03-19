import java.lang.*;
import java.util.*;
class SwapPair
{
public static void main(String[] args)
{
 int n,i,t;
int a[]=new int[100];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a numbers of elements");
 n=sc.nextInt();
 System.out.println("enter elements of array");
 for(i=0;i<n;i++)
a[i]=sc.nextInt();
for(i=0;i<n;i+=2)
{
t=a[i];
a[i]=a[i+1];
a[i+1]=t;
}
 System.out.println("elements of array after swapping");
 for(i=0;i<n;i++)
 System.out.println(a[i]+" ");
} 
}