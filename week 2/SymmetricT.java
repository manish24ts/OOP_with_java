import java.lang.*;
import java.util.*;
class SymmetricT
{
public static void main(String[] args)
{
 int r,i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter rows and columns of two matrices");
 r=sc.nextInt();
int a[][]=new int[r][r];
int t[][]=new int[r][r];
 System.out.println("enter matrix A elements");
 for(i=0;i<r;i++)
 for(j=0;j<r;j++)
 a[i][j]=sc.nextInt(); 
 for(i=0;i<r;i++)
{
for(j=0;j<r;j++)
t[i][j]=a[i][j];
int c=0;
for(i=0;i<r;i++)
for(j=0;j<r;j++)
if(a[i][j]!=t[i][j]);
{
c++;
break;
}
if(c==0)
 System.out.println("symmetric ");
else
 System.out.println("not symmetric");
}
}}