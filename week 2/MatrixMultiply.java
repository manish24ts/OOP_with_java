import java.lang.*;
import java.util.*;
class MatrixMultiply
{
public static void main(String args[])
{
int i,j,k,r1,c1,r2,c2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter rowsand columns");
r1=sc.nextInt();
r2=sc.nextInt();
c1=sc.nextInt();
c2=sc.nextInt();
if(r2==c1)
{
int a[][]=new int[r1][c1];
int b[][]=new int[r2][c2];
int c[][]=new int[r1][c2];
System.out.println("Enter elements into matrix A");
for(i=0;i<r1;i++)
for(j=0;j<c1;j++)
a[i][j]=sc.nextInt();
System.out.println("Enter elements into matrix B");
for(i=0;i<r2;i++)
for(j=0;j<c2;j++)
b[i][j]=sc.nextInt();
for(i=0;i<r1;i++)
for(j=0;j<c2;j++)
{
c[i][j]=0;
for(k=0;k<c2;k++)
c[i][j]+=a[i][k]*b[k][j];
}
System.out.println("Resultant Matrix");
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
System.out.print(c[i][j]+" ");
System.out.println();
}
}
else
System.out.println("Matrix multiplication is not possible");
}
}