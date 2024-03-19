import java.lang.*;
import java.util.*;
class SquareOfDiagonal
{
public static void main(String[] args)
{
 int r,i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter rows and columns of two matrices");
 r=sc.nextInt();
int a[][]=new int[r][r];
 System.out.println("enter matrix A elements");
 for(i=0;i<r;i++)
 for(j=0;j<r;j++)
 a[i][j]=sc.nextInt(); 
 for(i=0;i<r;i++)
 System.out.println("Square of "+a[i][i]+"="+a[i][i]*a[i][i]);
}
}