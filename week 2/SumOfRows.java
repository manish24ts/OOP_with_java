import java.lang.*;
import java.util.*;
class SumOfRows
{
public static void main(String[] args)
{
 int sum,c,r,i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter rows and columns of two matrices");
 r=sc.nextInt();
 c=sc.nextInt();
int a[][]=new int[r][c];
 System.out.println("enter matrix A elements");
 for(i=0;i<r;i++)
 for(j=0;j<c;j++)
 a[i][j]=sc.nextInt(); 
 for(i=0;i<r;i++)
{
sum=0;
 for(j=0;j<r;j++)
sum+=a[i][j];
 System.out.println("sum of "+(i+1)+"row ="+sum);
}
}
}