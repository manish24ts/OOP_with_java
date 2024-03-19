import java.lang.*;
import java.util.*;
class SumOfDiagonal
{
public static void main(String[] args)
{
 int r,i,j,sum=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter rows and columns of two matrices");
 r=sc.nextInt();
int a[][]=new int[r][r];
 System.out.println("enter matrix A elements");
 for(i=0;i<r;i++)
 for(j=0;j<r;j++)
 a[i][j]=sc.nextInt(); 
 for(i=0;i<r;i++)
sum+=a[i][i];
 System.out.println("sum of main diagonal elements is"+sum);
sum=0;
for(i=0;i<r;i++)
sum+=a[i][r-i-1];
 System.out.println("sum of opposite diagonal elements is"+sum);
}
}