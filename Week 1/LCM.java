import java.lang.*;
import java.util.*;
class LCM
{
public static void main(String[] args)
{
 int n1,n2,i,x;
 LCM m = new LCM();
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a numbers to find LCM");
 n1=sc.nextInt();
 n2=sc.nextInt();
 x=m.lcm(n1,n2);
 System.out.println("LCM of "+n1+" "+n2+" is equal to "+ x);
}
public static int lcm(int n1,int n2)
{
 int i,gcd=0,lc;
 for(i=1;i<=n1&&i<=n2;i++)
{
 if(n1%i==0 && n2%i==0)
gcd = i;
}
lc = (n1*n2)/gcd;
return lc;
}
} 