import java.lang.*;
import java.util.*;
class Transpose
{
public static void main(String[] args)
{
 int c,r,i,j,sum=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter rows and columns of two matrices");
 r=sc.nextInt();
 c=sc.nextInt();
int a[][]=new int[r][c];
 System.out.println("enter matrix A elements");
 for(i=0;i<r;i++)
 for(j=0;j<c;j++)
 a[i][j]=sc.nextInt(); 
 for(i=0;i<c;i++){
 for(j=0;j<r;j++)
 System.out.println(a[i][j]+" ");
 System.out.println();
}
}
}