import java.lang.*;
import java.util.*;
class Symmetric
{
public static void main(String[] args)
{
 int c,r,i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter rows and columns of two matrices");
 r=sc.nextInt();
 c=sc.nextInt();
int a[][]=new int[r][c];
int t[][]=new int[c][r];
 System.out.println("enter matrix A elements");
 for(i=0;i<r;i++)
 for(j=0;j<c;j++)
 a[i][j]=sc.nextInt(); 
 for(i=0;i<r;i++)
{
 for(j=0;j<c;j++)
t[i][j]=a[i][j];
 c=0;
 for(i=0;i<r;i++)
 for(j=0;j<c;j++)
if(a[i][j]!=t[i][j]);
c++;
break;
}
if(c==0)
 System.out.println("symmetric ");
else
 System.out.println("not symmetric");
}
}